package com.bnc.api.v3;

import com.bnc.api.v3.client.autogen.model.Error;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import feign.Feign;
import feign.Response;
import feign.codec.Decoder;
import feign.codec.ErrorDecoder;
import feign.jackson.JacksonDecoder;
import feign.slf4j.Slf4jLogger;
import java.io.IOException;
import java.util.Collections;

public class ApiClient {

    public static <T extends Api> T connect(Class<T> clientClass, String baseUrl) {
        Decoder decoder = new JacksonDecoder(Collections.singletonList(new JavaTimeModule()));
        return Feign.builder()
            .decoder(decoder)
            .errorDecoder(new ApiErrorDecoder(decoder))
            .logger(new Slf4jLogger())
            .target(clientClass, baseUrl);
    }

    public interface Api {

    }

    static class ApiErrorDecoder implements ErrorDecoder {

        final Decoder decoder;
        final ErrorDecoder defaultDecoder = new ErrorDecoder.Default();

        ApiErrorDecoder(Decoder decoder) {
            this.decoder = decoder;
        }

        @Override
        public Exception decode(String methodKey, Response response) {
            try {
                return (Exception) decoder.decode(response, Error.class);
            } catch (IOException fallbackToDefault) {
                return defaultDecoder.decode(methodKey, response);
            }
        }
    }
}

package com.bnc.api.v3.client.autogen;

import com.bnc.api.v3.ApiClient;


import java.time.OffsetDateTime;
import com.bnc.api.v3.client.autogen.model.TickerResponse;
import java.util.UUID;


import java.util.HashMap;
import java.util.Map;

import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaClientCodegen", date = "2018-08-17T11:47:51.512+12:00[Pacific/Auckland]")
public interface TickerApi extends ApiClient.Api {


  /**
   * List all tickers
   * This API provides ticker information by exchange and market. If no timestamp is provided, then all of the last ticks will be provided.  Using this API by **base and quote symbol is not recommended** as it may result in a error when duplicate symbols are found. Searching by marketId is recommended and will result in a faster response.

    * @param timestamp Retrieve all ticks from the timestamp provided. (optional)

    * @param exchangeId Retrieve all ticks for the particular exchange id provided. (optional)

    * @param marketId Retrieve all ticks for the particular market id provided. (optional)

    * @param startAfter Retrieve all ticks starting after this particular id. (optional)

    * @param size The maximum size to return in the result set. (optional)

    * @param baseSymbol Retrieve the ticks for the markets which contain the base symbol. If the base symbol is provided then the quote symbol must be provided. (optional)

    * @param quoteSymbol Retrieve the ticks for the markets which contain the quote symbol. If the quote symbol is provided, then the base symbol must be provided. (optional)


   * @return TickerResponse


   */
  @RequestLine("GET /ticker?timestamp={timestamp}&exchangeId={exchangeId}&marketId={marketId}&startAfter={startAfter}&size={size}&baseSymbol={baseSymbol}&quoteSymbol={quoteSymbol}")
  @Headers({
  
  "Accept: application/json"
  })
  TickerResponse listTicker(@Param("timestamp") OffsetDateTime timestamp, @Param("exchangeId") UUID exchangeId, @Param("marketId") UUID marketId, @Param("startAfter") UUID startAfter, @Param("size") Integer size, @Param("baseSymbol") String baseSymbol, @Param("quoteSymbol") String quoteSymbol);
    

  /**
   * List all tickers
   * This API provides ticker information by exchange and market. If no timestamp is provided, then all of the last ticks will be provided.  Using this API by **base and quote symbol is not recommended** as it may result in a error when duplicate symbols are found. Searching by marketId is recommended and will result in a faster response.
   * Note, this is equivalent to the other <code>listTicker</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListTickerQueryParams} class that allows for
   * building up this map in a fluent style.
      
        
      
        
      
        
      
        
      
        
      
        
      
        
      
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
      
   *   <li>timestamp - Retrieve all ticks from the timestamp provided. (optional)</li>
      
   *   <li>exchangeId - Retrieve all ticks for the particular exchange id provided. (optional)</li>
      
   *   <li>marketId - Retrieve all ticks for the particular market id provided. (optional)</li>
      
   *   <li>startAfter - Retrieve all ticks starting after this particular id. (optional)</li>
      
   *   <li>size - The maximum size to return in the result set. (optional)</li>
      
   *   <li>baseSymbol - Retrieve the ticks for the markets which contain the base symbol. If the base symbol is provided then the quote symbol must be provided. (optional)</li>
      
   *   <li>quoteSymbol - Retrieve the ticks for the markets which contain the quote symbol. If the quote symbol is provided, then the base symbol must be provided. (optional)</li>
      
   *   </ul>
      
   * @return TickerResponse
      
      
   */
  @RequestLine("GET /ticker?timestamp={timestamp}&exchangeId={exchangeId}&marketId={marketId}&startAfter={startAfter}&size={size}&baseSymbol={baseSymbol}&quoteSymbol={quoteSymbol}")
  @Headers({
  
  "Accept: application/json"
  })
  TickerResponse listTicker(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listTicker</code> method in a fluent style.
   */
  public static class ListTickerQueryParams extends HashMap<String, Object> {
      
    public ListTickerQueryParams timestamp(final OffsetDateTime value) {
        
        
      put("timestamp", EncodingUtils.encode(value));
        
      return this;
    }
      
    public ListTickerQueryParams exchangeId(final UUID value) {
        
        
      put("exchangeId", EncodingUtils.encode(value));
        
      return this;
    }
      
    public ListTickerQueryParams marketId(final UUID value) {
        
        
      put("marketId", EncodingUtils.encode(value));
        
      return this;
    }
      
    public ListTickerQueryParams startAfter(final UUID value) {
        
        
      put("startAfter", EncodingUtils.encode(value));
        
      return this;
    }
      
    public ListTickerQueryParams size(final Integer value) {
        
        
      put("size", EncodingUtils.encode(value));
        
      return this;
    }
      
    public ListTickerQueryParams baseSymbol(final String value) {
        
        
      put("baseSymbol", EncodingUtils.encode(value));
        
      return this;
    }
      
    public ListTickerQueryParams quoteSymbol(final String value) {
        
        
      put("quoteSymbol", EncodingUtils.encode(value));
        
      return this;
    }
      
  }
    
  

}

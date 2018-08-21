package com.bnc.api.v3.client.autogen;

import com.bnc.api.v3.ApiClient;


import com.bnc.api.v3.client.autogen.model.ExchangeResponse;
import com.bnc.api.v3.client.autogen.model.Exchange;
import java.util.UUID;


import java.util.HashMap;
import java.util.Map;

import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaClientCodegen", date = "2018-08-17T11:47:51.512+12:00[Pacific/Auckland]")
public interface ExchangeApi extends ApiClient.Api {


  /**
   * Retrieve a exchange
   * Retrieves the details of a exchange that has previously been created. Supply the unique identifier of the exchange.

    * @param id The unique resource identifier (required)


   * @return Exchange


   */
  @RequestLine("GET /exchange/{id}")
  @Headers({
  
  "Accept: application/json"
  })
  Exchange getExchangeById(@Param("id") UUID id);
    
  
  /**
   * List all exchanges
   * List all exchanges or provide a query parameter to search.

    * @param status Only return exchanges which have a particular status. (optional)


   * @return ExchangeResponse


   */
  @RequestLine("GET /exchange?status={status}")
  @Headers({
  
  "Accept: application/json"
  })
  ExchangeResponse listExchanges(@Param("status") String status);
    

  /**
   * List all exchanges
   * List all exchanges or provide a query parameter to search.
   * Note, this is equivalent to the other <code>listExchanges</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListExchangesQueryParams} class that allows for
   * building up this map in a fluent style.
      
        
      
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
      
   *   <li>status - Only return exchanges which have a particular status. (optional)</li>
      
   *   </ul>
      
   * @return ExchangeResponse
      
      
   */
  @RequestLine("GET /exchange?status={status}")
  @Headers({
  
  "Accept: application/json"
  })
  ExchangeResponse listExchanges(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listExchanges</code> method in a fluent style.
   */
  public static class ListExchangesQueryParams extends HashMap<String, Object> {
      
    public ListExchangesQueryParams status(final String value) {
        
        
      put("status", EncodingUtils.encode(value));
        
      return this;
    }
      
  }
    
  

}

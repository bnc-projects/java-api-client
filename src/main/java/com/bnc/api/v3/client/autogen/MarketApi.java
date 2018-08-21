package com.bnc.api.v3.client.autogen;

import com.bnc.api.v3.ApiClient;


import com.bnc.api.v3.client.autogen.model.Market;
import com.bnc.api.v3.client.autogen.model.MarketResponse;
import java.util.UUID;


import java.util.HashMap;
import java.util.Map;

import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaClientCodegen", date = "2018-08-17T11:47:51.512+12:00[Pacific/Auckland]")
public interface MarketApi extends ApiClient.Api {


  /**
   * Retrieve a market
   * Retrieves the details of a market that has previously been created. Supply the unique identifier of the market.

    * @param id The unique resource identifier (required)


   * @return Market


   */
  @RequestLine("GET /market/{id}")
  @Headers({
  
  "Accept: application/json"
  })
  Market getMarketById(@Param("id") UUID id);
    
  
  /**
   * List all markets
   * List all markets or provide a query parameter to search.

    * @param baseAssetId Only return markets which contain the asset id on the base side of the market. (optional)

    * @param quoteAssetId Only return markets which contain the asset id on the quote side of the market. (optional)


   * @return MarketResponse


   */
  @RequestLine("GET /market?baseAssetId={baseAssetId}&quoteAssetId={quoteAssetId}")
  @Headers({
  
  "Accept: application/json"
  })
  MarketResponse listMarkets(@Param("baseAssetId") UUID baseAssetId, @Param("quoteAssetId") UUID quoteAssetId);
    

  /**
   * List all markets
   * List all markets or provide a query parameter to search.
   * Note, this is equivalent to the other <code>listMarkets</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListMarketsQueryParams} class that allows for
   * building up this map in a fluent style.
      
        
      
        
      
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
      
   *   <li>baseAssetId - Only return markets which contain the asset id on the base side of the market. (optional)</li>
      
   *   <li>quoteAssetId - Only return markets which contain the asset id on the quote side of the market. (optional)</li>
      
   *   </ul>
      
   * @return MarketResponse
      
      
   */
  @RequestLine("GET /market?baseAssetId={baseAssetId}&quoteAssetId={quoteAssetId}")
  @Headers({
  
  "Accept: application/json"
  })
  MarketResponse listMarkets(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listMarkets</code> method in a fluent style.
   */
  public static class ListMarketsQueryParams extends HashMap<String, Object> {
      
    public ListMarketsQueryParams baseAssetId(final UUID value) {
        
        
      put("baseAssetId", EncodingUtils.encode(value));
        
      return this;
    }
      
    public ListMarketsQueryParams quoteAssetId(final UUID value) {
        
        
      put("quoteAssetId", EncodingUtils.encode(value));
        
      return this;
    }
      
  }
    
  

}

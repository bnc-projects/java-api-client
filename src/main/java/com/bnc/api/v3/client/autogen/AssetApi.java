package com.bnc.api.v3.client.autogen;

import com.bnc.api.v3.ApiClient;


import com.bnc.api.v3.client.autogen.model.AssetResponse;
import com.bnc.api.v3.client.autogen.model.Asset;
import java.util.UUID;


import java.util.HashMap;
import java.util.Map;

import feign.*;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.java.JavaClientCodegen", date = "2018-08-17T11:47:51.512+12:00[Pacific/Auckland]")
public interface AssetApi extends ApiClient.Api {


  /**
   * Retrieve a asset
   * Retrieves the details of a asset that has previously been created. Supply the unique identifier of the asset.

    * @param id The unique resource identifier (required)


   * @return Asset


   */
  @RequestLine("GET /asset/{id}")
  @Headers({
  
  "Accept: application/json"
  })
  Asset getAssetById(@Param("id") UUID id);
    
  
  /**
   * List all assets
   * List all assets or provide a query parameter to search.

    * @param type Only return assets of a particular type. (optional)

    * @param symbol Only return assets which have a particular ticker symbol. (optional)

    * @param status Only return assets which have a particular status. (optional)


   * @return AssetResponse


   */
  @RequestLine("GET /asset?type={type}&symbol={symbol}&status={status}")
  @Headers({
  
  "Accept: application/json"
  })
  AssetResponse listAssets(@Param("type") String type, @Param("symbol") String symbol, @Param("status") String status);
    

  /**
   * List all assets
   * List all assets or provide a query parameter to search.
   * Note, this is equivalent to the other <code>listAssets</code> method,
   * but with the query parameters collected into a single Map parameter. This
   * is convenient for services with optional query parameters, especially when
   * used with the {@link ListAssetsQueryParams} class that allows for
   * building up this map in a fluent style.
      
        
      
        
      
        
      
   * @param queryParams Map of query parameters as name-value pairs
   *   <p>The following elements may be specified in the query map:</p>
   *   <ul>
      
   *   <li>type - Only return assets of a particular type. (optional)</li>
      
   *   <li>symbol - Only return assets which have a particular ticker symbol. (optional)</li>
      
   *   <li>status - Only return assets which have a particular status. (optional)</li>
      
   *   </ul>
      
   * @return AssetResponse
      
      
   */
  @RequestLine("GET /asset?type={type}&symbol={symbol}&status={status}")
  @Headers({
  
  "Accept: application/json"
  })
  AssetResponse listAssets(@QueryMap(encoded=true) Map<String, Object> queryParams);

  /**
   * A convenience class for generating query parameters for the
   * <code>listAssets</code> method in a fluent style.
   */
  public static class ListAssetsQueryParams extends HashMap<String, Object> {
      
    public ListAssetsQueryParams type(final String value) {
        
        
      put("type", EncodingUtils.encode(value));
        
      return this;
    }
      
    public ListAssetsQueryParams symbol(final String value) {
        
        
      put("symbol", EncodingUtils.encode(value));
        
      return this;
    }
      
    public ListAssetsQueryParams status(final String value) {
        
        
      put("status", EncodingUtils.encode(value));
        
      return this;
    }
      
  }
    
  

}

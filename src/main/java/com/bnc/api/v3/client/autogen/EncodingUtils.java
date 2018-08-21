package com.bnc.api.v3.client.autogen;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
* Utilities to support Swagger encoding formats in Feign.
*/
public final class EncodingUtils {

  /**
   * Private constructor. Do not construct this class.
   */
  private EncodingUtils() {}

  /**
   * URL encode a single query parameter.
   * @param parameter The query parameter to encode. This object will not be
   *                  changed.
   * @return The URL encoded string representation of the parameter. If the
   *         parameter is null, returns null.
   */
  public static String encode(Object parameter) {
    if (parameter == null) {
      return null;
    }
    try {
      return URLEncoder.encode(parameter.toString(), "UTF-8");
    } catch (UnsupportedEncodingException e) {
      throw new RuntimeException(e);
    }
  }
}

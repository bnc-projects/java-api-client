package com.bnc.api.v3;

import com.bnc.api.v3.client.autogen.AssetApi;
import com.bnc.api.v3.client.autogen.ExchangeApi;
import com.bnc.api.v3.client.autogen.MarketApi;
import com.bnc.api.v3.client.autogen.TickerApi;
import com.bnc.api.v3.client.autogen.TickerApi.ListTickerQueryParams;
import com.bnc.api.v3.client.autogen.model.Asset;
import com.bnc.api.v3.client.autogen.model.Exchange;
import com.bnc.api.v3.client.autogen.model.Market;
import com.bnc.api.v3.client.autogen.model.TickerResponse;

public class BNCApiSample {

    public static void main(String[] args) {

        if (args.length == 0) {
            System.out.println("Please pass in the base url");
            return;
        }

        TickerApi tickerApi = ApiClient.connect(TickerApi.class, args[0]);
        AssetApi assetApi = ApiClient.connect(AssetApi.class, args[0]);
        ExchangeApi exchangeApi = ApiClient.connect(ExchangeApi.class, args[0]);
        MarketApi marketApi = ApiClient.connect(MarketApi.class, args[0]);

        // Get BTC and USD Assets
        Asset btc = assetApi.listAssets(null, "BTC", null).getContent().get(0);
        System.out.println(btc);

        Asset usd = assetApi.listAssets(null, "USD", null).getContent().get(0);
        System.out.println(usd);

        // Get the BTC_USD Market
        Market market = marketApi.listMarkets(btc.getId(), usd.getId()).getContent().get(0);
        System.out.println(market);

        // Get BitFinex Exchange
        Exchange exchange = exchangeApi
            .listExchanges("").getContent().stream()
            .filter(e -> "BitFinex".equalsIgnoreCase(e.getName())).findFirst().get();
        System.out.println(exchange);

        // Get Last BTC USD tick for
        TickerResponse tickerResponse = tickerApi.listTicker(new ListTickerQueryParams().marketId(market.getId()).exchangeId(exchange.getId()));
        System.out.println(tickerResponse);
    }
}

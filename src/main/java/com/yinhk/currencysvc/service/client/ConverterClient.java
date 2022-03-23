package com.yinhk.currencysvc.service.client;

import com.yinhk.currencysvc.pojo.dto.CurrencyConvertDto;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service 
public class ConverterClient {

    private final WebClient client;
    private final String apiKey = "922dc0473c0f8695cd055dbed2afa36372fe6929";
    
    String baseUrl = "https://api.getgeoapi.com/";
    public ConverterClient(WebClient.Builder webClientBuilder) {
        client = webClientBuilder.baseUrl(baseUrl).build();
    }
    
    public CurrencyConvertDto getExchangeRate(String baseCurrency, String targetCurrency, float amount) {
        return client
                .get()
                .uri(uriBuilder -> uriBuilder
                    .path("v2/currency/convert")
                    .queryParam("api_key", apiKey)
                    .queryParam("from", baseCurrency)
                    .queryParam("to", targetCurrency)
                    .queryParam("amount", amount)
                    .queryParam("format", "json")
                    .build())
                .retrieve()
                .bodyToMono(CurrencyConvertDto.class).block();
    };
    

}


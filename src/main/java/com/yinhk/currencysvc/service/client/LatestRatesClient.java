package com.yinhk.currencysvc.service.client;

import com.yinhk.currencysvc.pojo.dto.LatestRatesDto;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service 
public class LatestRatesClient {
	
	 private final WebClient client;
	 String baseUrl = "https://api.exchangerate.host/";
	 
	 public LatestRatesClient(WebClient.Builder webClientBuilder) {
	        client = webClientBuilder.baseUrl(baseUrl).build();
	 }
	 
	 // full url path example: https://api.exchangerate.host/latest?base=JPY
	 public LatestRatesDto getLatestRates(String base) {
		 return client
	             .get()
	             .uri(uriBuilder -> uriBuilder
	                 .path("latest")
	                 .queryParam("base", base)
	                 .build())
	             .retrieve()
	             .bodyToMono(LatestRatesDto.class).block();
	 }
	     
}

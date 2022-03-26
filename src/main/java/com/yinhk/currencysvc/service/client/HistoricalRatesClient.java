package com.yinhk.currencysvc.service.client;

import com.yinhk.currencysvc.pojo.dto.HistoricalRatesDto;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service 
public class HistoricalRatesClient {
	private final WebClient client;
	String baseUrl = "https://api.exchangerate.host/";
	 
	public HistoricalRatesClient(WebClient.Builder webClientBuilder) {
	        client = webClientBuilder.baseUrl(baseUrl).build();
	}
	 
	 //full url path example: https://api.exchangerate.host/2018-12-31?base=USD
	 public HistoricalRatesDto getHistoricalRates(String date, String base) {
		 return client
	             .get()
	             .uri(uriBuilder -> uriBuilder
	                 .path(date)
	                 .queryParam("base", base)
	                 .build())
	             .retrieve()
	             .bodyToMono(HistoricalRatesDto.class).block();
	 }
	
}

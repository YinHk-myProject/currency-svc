package com.yinhk.currencysvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.yinhk.currencysvc.pojo.dto.CurrencyConvertDto;
import com.yinhk.currencysvc.pojo.dto.HistoricalRatesDto;
import com.yinhk.currencysvc.pojo.dto.LatestRatesDto;
import com.yinhk.currencysvc.service.client.ConverterClient;
import com.yinhk.currencysvc.service.client.HistoricalConverterClient;
import com.yinhk.currencysvc.service.client.HistoricalRatesClient;
import com.yinhk.currencysvc.service.client.LatestRatesClient;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@Validated
@RequestMapping("/")
public class GetExchangeRate {

    @Autowired
    private ConverterClient converterClient;
    
    @Autowired
    private HistoricalConverterClient historicalConverterClient;
    
    @Autowired
    private LatestRatesClient latestRatesClient;
    
    @Autowired
    private HistoricalRatesClient historicalRatesClient;
    
    @GetMapping("/converter")  //example: /converter?from=USD&to=JPY&amount=1000
    public CurrencyConvertDto getCurrencyExchangeRate(
        @RequestParam(value = "from", required = true) String baseCurrency,
        @RequestParam(value = "to", required = true) String targetCurrency,
        @RequestParam(value = "amount", required = true) float amount) {

        return converterClient.getExchangeRate(baseCurrency, targetCurrency, amount);
    }
    
    @GetMapping("/past_converter/{date}")  //example: /past_converter/2015-10-12?from=USD&to=JPY&amount=1000
    public CurrencyConvertDto getPastCurrencyExchangeRate(
    	@PathVariable String date,
    	@RequestParam(value = "from", required = true) String baseCurrency,
        @RequestParam(value = "to", required = true) String targetCurrency,
        @RequestParam(value = "amount", required = true) float amount) {
    	
    	return historicalConverterClient.getPastExchangeRate(date, baseCurrency, targetCurrency, amount);
    }
    
    @GetMapping("/latest_rates") //example: /latest_rates?base=JPY
    public LatestRatesDto getLatestRatesList(@RequestParam(value = "base", required = true) String base) {
    	return latestRatesClient.getLatestRates(base);
    }
    
    @GetMapping("/historical_rates/{date}") //example: /historical_rates/2018-05-20?base=JPY
    public HistoricalRatesDto getHistoricalRatesList(
    	@PathVariable String date,
    	@RequestParam(value = "base", required = true) String base) {
    	return historicalRatesClient.getHistoricalRates(date,base);
    }
    
    
}


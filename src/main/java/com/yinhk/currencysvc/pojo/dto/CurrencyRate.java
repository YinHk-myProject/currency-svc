package com.yinhk.currencysvc.pojo.dto;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class CurrencyRate {
	
	private Map<String, String> currencyRate = new HashMap<String, String>();
	
	@JsonAnySetter
    private void setCurrencyRate(String key, String value) {
		currencyRate.put(key, value);	
    }
	
	public Map<String, String> getCurrencyRate() {
		return currencyRate;
	}
	
}

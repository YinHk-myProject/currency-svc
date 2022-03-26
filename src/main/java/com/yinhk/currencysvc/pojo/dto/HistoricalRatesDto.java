package com.yinhk.currencysvc.pojo.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"success",
"base",
"date",
"rates"
})
@JsonIgnoreProperties({"motd", "historical"})
public class HistoricalRatesDto {
	@JsonProperty("success")
	private Boolean success;
	@JsonProperty("base")
	private String base;
	@JsonProperty("date")
	private String date;
	@JsonProperty("rates")
	private CurrencyRate currencyRate;
	
	@JsonProperty("success")
	public Boolean getSuccess() {
	return success;
	}

	@JsonProperty("success")
	public void setSuccess(Boolean success) {
	this.success = success;
	}

	@JsonProperty("base")
	public String getBase() {
	return base;
	}

	@JsonProperty("base")
	public void setBase(String base) {
	this.base = base;
	}
	
	@JsonProperty("date")
	public String getDate() {
	return date;
	}

	@JsonProperty("date")
	public void setDate(String date) {
	this.date = date;
	}

	@JsonProperty("rates")
	public CurrencyRate getCurrencyRate() {
	return currencyRate;
	}

	@JsonProperty("rates")
	public void setCurrencyRate(CurrencyRate currencyRate) {
	this.currencyRate = currencyRate;
	}
	
	
}

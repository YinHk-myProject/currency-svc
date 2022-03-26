package com.yinhk.currencysvc.pojo.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
"base_currency_code",
"base_currency_name",
"amount",
"updated_date",
"rates",
"status"
})
public class HistoricalCurrencyConvertDto {
	@JsonProperty("base_currency_code")
	private String baseCurrencyCode;
	@JsonProperty("base_currency_name")
	private String baseCurrencyName;
	@JsonProperty("amount")
	private String amount;
	@JsonProperty("updated_date")
	private String updatedDate;
	@JsonProperty("rates")
	private Rates rates;
	@JsonProperty("status")
	private String status;
}

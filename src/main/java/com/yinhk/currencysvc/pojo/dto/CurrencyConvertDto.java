
package com.yinhk.currencysvc.pojo.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "base_currency_code",
    "base_currency_name",
    "amount",
    "updated_date",
    "rates",
    "status"
})
public class CurrencyConvertDto {

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
    
    
    @JsonProperty("base_currency_code")
    public String getBaseCurrencyCode() {
        return baseCurrencyCode;
    }

    @JsonProperty("base_currency_code")
    public void setBaseCurrencyCode(String baseCurrencyCode) {
        this.baseCurrencyCode = baseCurrencyCode;
    }

    @JsonProperty("base_currency_name")
    public String getBaseCurrencyName() {
        return baseCurrencyName;
    }

    @JsonProperty("base_currency_name")
    public void setBaseCurrencyName(String baseCurrencyName) {
        this.baseCurrencyName = baseCurrencyName;
    }

    @JsonProperty("amount")
    public String getAmount() {
        return amount;
    }

    @JsonProperty("amount")
    public void setAmount(String amount) {
        this.amount = amount;
    }

    @JsonProperty("updated_date")
    public String getUpdatedDate() {
        return updatedDate;
    }

    @JsonProperty("updated_date")
    public void setUpdatedDate(String updatedDate) {
        this.updatedDate = updatedDate;
    }

    @JsonProperty("rates")
    public Rates getRates() {
        return rates;
    }

    @JsonProperty("rates")
    public void setRates(Rates rates) {
        this.rates = rates;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }
    
    
}

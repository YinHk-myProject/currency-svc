
package com.yinhk.currencysvc.pojo.dto;

//import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "currency_name",
    "rate",
    "rate_for_amount"
})
@Generated("jsonschema2pojo")
public class RateInfo {

    @JsonProperty("currency_name")
    private String currencyName;
    @JsonProperty("rate")
    private String exchange;
    @JsonProperty("rate_for_amount")
    private String total;
    

    @JsonProperty("currency_name")
    public String getCurrencyName() {
        return currencyName;
    }

    @JsonProperty("currency_name")
    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    @JsonProperty("rate")
    public String getExchange() {
        return exchange;
    }

    @JsonProperty("rate")
    public void setExchange(String exchange) {
        this.exchange = exchange;
    }

    @JsonProperty("rate_for_amount")
    public String getTotal() {
        return total;
    }

    @JsonProperty("rate_for_amount")
    public void setTotal(String total) {
        this.total = total;
    }
    
}

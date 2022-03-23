package com.yinhk.currencysvc.pojo.vo;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseRateVo {
	
	//private String baseCurrencyName;
	private String amount;
	private String updatedDate;
	private String currencyName;
	private String exchange;
	private String total;
	private String status;
	
	/*
	public String getBaseCurrencyName() {
		return baseCurrencyName;
	}
	
	public void setBaseCurrencyName(String baseCurrencyName) {
		this.baseCurrencyName = baseCurrencyName;
	}
	*/
	
	public String getAmount() {
		return amount;
	}
	
	public void setAmount(String amount) {
		this.amount = amount;
	}

	
	public String getCurrencyName() {
		return currencyName;
	}
	
	public void setCurrencyName(String currencyName) {
		this.currencyName = currencyName;
	}
	
	
	public String getUpdatedDate() {
		return updatedDate;
	}
	
	public void setUpdatedDate(String updatedDate) {
		this.updatedDate = updatedDate;
	}
	
	public String getExchange() {
	    return exchange;
	}

	    
	public void setExchange(String exchange) {
	    this.exchange = exchange;
	}

	    
	public String getTotal() {
	    return total;
	}

	   
	public void setTotal(String total) {
	    this.total = total;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	

}

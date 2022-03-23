package com.yinhk.currencysvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

import com.yinhk.currencysvc.pojo.dto.CurrencyConvertDto;
import com.yinhk.currencysvc.service.client.ConverterClient;
import com.yinhk.currencysvc.pojo.vo.ResponseRateVo;
import com.yinhk.currencysvc.service.ResponseRate;


@RestController
@Api(tags = "Currency")
@Validated
@RequestMapping("/")
public class GetExchangeRate {

    @Autowired
    private ConverterClient converterClient;
	@Autowired
	private ResponseRate responseRate;

    @ApiOperation(value = "currency converter", notes = "get currency exchange rate")
    @GetMapping("/converter")
    public CurrencyConvertDto getCurrencyExchangeRate(
        @RequestParam(value = "from", required = true) String baseCurrency,
        @RequestParam(value = "to", required = true) String targetCurrency,
        @RequestParam(value = "amount", required = true) float amount) {

        return converterClient.getExchangeRate(baseCurrency, targetCurrency, amount);
    	//return responseRate.responseExchangeRate(baseCurrency, targetCurrency, amount);
    }

}


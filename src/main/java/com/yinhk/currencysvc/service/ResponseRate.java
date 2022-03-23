package com.yinhk.currencysvc.service;

import java.util.List;
import java.util.Map;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yinhk.currencysvc.pojo.vo.ResponseRateVo;
import com.yinhk.currencysvc.pojo.dto.CurrencyConvertDto;
import com.yinhk.currencysvc.service.client.ConverterClient;
import com.yinhk.currencysvc.pojo.dto.RateInfo;

@Service 
public class ResponseRate {
	
	@Autowired
    private ConverterClient converterClient;
	
	
	public ResponseRateVo responseExchangeRate(String baseCurrency, String targetCurrency, float amount) {
		
		CurrencyConvertDto currencyConvertDto = converterClient.getExchangeRate(baseCurrency, targetCurrency, amount);
		
		ModelMapper modelMapper = new ModelMapper();
		modelMapper.getConfiguration().setFullTypeMatchingRequired(true);
		modelMapper.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		modelMapper.typeMap(CurrencyConvertDto.class, ResponseRateVo.class)
			.addMappings(m -> m.map(src->src.getRates().getRateInfo(),
					ResponseRateVo::setCurrencyName));
		ResponseRateVo responseRateVo = modelMapper.map(currencyConvertDto, ResponseRateVo.class);
		
		return responseRateVo;
		
	}

}

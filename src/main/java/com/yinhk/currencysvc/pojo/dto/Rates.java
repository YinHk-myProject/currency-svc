
package com.yinhk.currencysvc.pojo.dto;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonRootName;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("jsonschema2pojo")
@JsonRootName("Rates")
public class Rates {
	
	private List<Map<String, Object>> rateInfo = new ArrayList<Map<String, Object>>();
	
	@JsonAnySetter
    private void setDynamicProperty(String key, Map<String, Object> map) {
		rateInfo.add(map);
    	
    }
	
	public List<Map<String, Object>> getRateInfo() {
		return rateInfo;
	}
	
	public void setRateInfo(List<Map<String, Object>> rateInfo) {
		this.rateInfo = rateInfo;
	}
	
	
}

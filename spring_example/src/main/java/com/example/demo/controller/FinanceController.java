package com.example.demo.controller;

import java.nio.charset.Charset;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import com.example.demo.dto.BasicFinanceInfo;
import com.example.demo.entity.DartInfo;
import com.example.demo.entity.DartResponse;
import com.example.demo.entity.FinanceInfo;
import com.example.demo.service.FinanceService;

@RestController
@RequestMapping(value="/finance")
public class FinanceController {
	
	
	@Autowired
	FinanceService financeService;
	//key 값 별도 Property로 뺄 것.
	
	@GetMapping(value = "",produces = MediaType.APPLICATION_JSON_VALUE)
	public BasicFinanceInfo getBasicFinanceInfo() {
		 BasicFinanceInfo basicFinInfo= new BasicFinanceInfo();
		 // Service 내로 집어넣을것

		 String serviceKey = "1f7a5f9c76c466ba9078c1f4a167c04b01fb9db4";
		 String url = "https://opendart.fss.or.kr/api/fnlttSinglAcnt.json?crtfc_key="+serviceKey+"&corp_code=00126380&bsns_year=2018&reprt_code=11011";
		 
		 RestTemplate restTemplate = new RestTemplate();
		 HttpHeaders headers = new HttpHeaders();
		 headers.setContentType(new MediaType("application","json",Charset.forName("UTF-8")));    //Response Header to UTF-8  
        
		 UriComponents builder = UriComponentsBuilder.fromHttpUrl(url)
                .queryParam("serviceKey", serviceKey)
                .queryParam("_type", "json")
                .build(false);    //자동으로 encode해주는 것을 막기 위해 false
        
		 ResponseEntity<DartResponse> response =
				  restTemplate.getForEntity(
				  builder.toUriString(),
				  DartResponse.class);
		 
		 DartResponse dartInfoResponse = response.getBody();
		 _getFinanceInfo(dartInfoResponse.getList());
		 
        return basicFinInfo;
	}
	
	private FinanceInfo _getFinanceInfo(List<DartInfo> dartInfos) {
		
		FinanceInfo financeInfo = new FinanceInfo();
		
		return financeInfo;
	}
}


package com.example.demo.entity;

import com.example.demo.util.FlexibleFloatDeserializer;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import lombok.Data;

@Data
public class DartInfo {

    @JsonProperty("bsns_year")
	String bsnsYear;
    @JsonProperty("corp_code")
	String corpCode;
    @JsonProperty("stock_code")
	String stockCode;
    @JsonProperty("account_nm")
	String accountNm;
    @JsonProperty("thstrm_amount")
    @JsonDeserialize(using = FlexibleFloatDeserializer.class)
    float thstrmAmount;
    @JsonProperty("frmtrm_amount")
    @JsonDeserialize(using = FlexibleFloatDeserializer.class)
    float frmtrmAmount;
    String ord;
	
//	public DartInfo(String bsns_year, String corp_code, String stock_code, String account_nm, String thstrm_amount,
//			String frmtrm_amount, String ord) {
//		super();
//		this.bsns_year = Integer.parseInt(bsns_year);
//		this.corp_code = corp_code;
//		this.stock_code = stock_code;
//		this.account_nm = account_nm;
//		this.thstrm_amount = Integer.parseInt(thstrm_amount);
//		this.frmtrm_amount = Integer.parseInt(frmtrm_amount);
//		this.ord = Integer.parseInt(ord);
//	}
}



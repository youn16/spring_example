package com.example.demo.entity;

import lombok.Data;

@Data
public class FinanceRatioInfo {
	String firmName;
	String stockCode;
	float deptToEquity;
	float interestCoverage;
	float returnOnEquity;
	float returnOnAsset;
	float operProfit;
	float revenueGrowth;
	float operIncomeGrowth;
}

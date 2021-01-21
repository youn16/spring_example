package com.example.demo.entity;

import lombok.Data;

@Data
public class FinanceInfo {
	String firmName;
	String stockCode;
	
	float currentAssetNow;
	float nonCurrentAssetNow;
	float totalAssetNow;
	float curLiabilityNow;
	float nonCurrentLiabilityNow;
	float totalLiabilityNow;
	float capitalNow;
	float retainedEarningNow;
	float totalEquityNow;
	float salesNow;
	float operatingIncomeNow;
	float incomeBeforeTaxExpenseNow;
	float netIncomeNow;
	
	float currentAssetPrior;
	float nonCurrentAssetPrior;
	float totalAssetPrior;
	float curLiabilityPrior;
	float nonCurrentLiabilityPrior;
	float totalLiabilityPrior;
	float capitalPrior;
	float retainedEarningPrior;
	float totalEquityPrior;
	float salesPrior;
	float operatingIncomePrior;
	float incomeBeforeTaxExpensePrior;
	float netIncomePrior;
	
}

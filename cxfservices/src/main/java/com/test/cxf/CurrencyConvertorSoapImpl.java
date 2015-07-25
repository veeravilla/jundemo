package com.test.cxf;

import net.webservicex.Currency;
import net.webservicex.CurrencyConvertorSoap;

public class CurrencyConvertorSoapImpl  implements CurrencyConvertorSoap{

	public double conversionRate(Currency fromCurrency, Currency toCurrency) {
		System.out.println("  From fromCurrency " +  fromCurrency + " to Currency " + toCurrency);
		return 34.56; //Todo: Write Actual Impl.
	}

}

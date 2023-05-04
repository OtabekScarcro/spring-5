package org.javacoders.converters;

import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

import org.javacoders.Currency;

import jakarta.ws.rs.ext.ParamConverter;
import jakarta.ws.rs.ext.ParamConverterProvider;
import jakarta.ws.rs.ext.Provider;

@Provider
public class CurrencyParamConverterProvider implements ParamConverterProvider{

	@Override
	public <T> ParamConverter<T> getConverter(Class<T> rawType, Type genericType, Annotation[] annotations) {
		return new ParamConverter<T>(){

			@Override
			public T fromString(String code) {
				Currency currency = null;
				
				switch(code.toUpperCase()) {
					case "EUR": currency = new Currency(code, "Euro"); break;
					case "USD": currency = new Currency(code, "US Dollar"); break;
					case "UZS": currency = new Currency(code, "Summ"); break;
				}
				
				return (T) currency;
			}

			@Override
			public String toString(T currency) {
				return currency.toString();
			}
		};
	}

}

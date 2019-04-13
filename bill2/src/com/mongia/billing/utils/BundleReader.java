package com.mongia.billing.utils;

import java.util.ResourceBundle;

public class BundleReader {
	private BundleReader(){}
	private static ResourceBundle rb = ResourceBundle.getBundle("db");
	public static String getValue(String key){
		return rb.getString(key);
	}
}

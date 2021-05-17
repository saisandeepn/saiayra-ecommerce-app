package com.saiayra.ecommerce.dao;

import java.util.Collection;
import java.util.Map;

public class Sample {
	public static void main(String args[]) {

	}

	public boolean isThereBMWOfDesiredColor(Map<String, Collection<String>> cars, String color) {
		Collection<String> carCollection = null;

		if (cars != null) {
			carCollection = cars.get("BMW");
			if (carCollection != null && carCollection.contains(color)) {
				return true;
			}
		}

		return false;

	}
}

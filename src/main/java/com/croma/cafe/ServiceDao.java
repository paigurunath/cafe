package com.croma.cafe;

import java.util.HashMap;

public class ServiceDao {

	public void getListOfItems() {
		
		HashMap<String, String> listOfItems = new HashMap<>();
		listOfItems.put("Sada Dosa", "dosa");
		listOfItems.put("Butter Dosa", "dosa");
		listOfItems.put("Masala Dosa", "dosa");
		listOfItems.put("Sezwan Dosa", "dosa");
		
		listOfItems.put("Watermelon Juice", "juice");
		listOfItems.put("MuskMelon Juice", "juice");
		listOfItems.put("Papaya Juice", "juice");
		listOfItems.put("Banana Juice", "juice");
		
		listOfItems.put("Idli", "instant");
		listOfItems.put("Poha", "instant");
		listOfItems.put("Bread", "instant");
		listOfItems.put("Missal Pav", "instant");

		listOfItems.put("Pani Puri", "snacks");
		listOfItems.put("Sev Puri", "snacks");
		listOfItems.put("Dahi Puri", "snacks");
		listOfItems.put("Bhel Puri", "snacks");
		
		listOfItems.put("tea", "teacoffee");
		listOfItems.put("coffe", "teacoffee");
		listOfItems.put("horlicks", "teacoffee");
		
	}
}

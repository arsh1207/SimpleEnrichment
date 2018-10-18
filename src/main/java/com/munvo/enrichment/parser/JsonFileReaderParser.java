package com.munvo.enrichment.parser;

import com.munvo.enrichment.model.Subscriber;

public class JsonFileReaderParser implements FileReaderParser {

	/*
	 * This class binds the data from the input string from json file to Subscriber
	 * object
	 */
	private int id;
	private String name;
	private String phone;

	@Override
	public Subscriber parseSubscriber(String subLine) {
		subLine = subLine.substring(1, subLine.length() - 1);
		String arr[] = subLine.split(",");
		String arr1[] = new String[3];
		int j = 0;

		for (int i = 0; i < arr.length; i++) {
			arr1[j] = arr[i].substring(arr[i].indexOf(":") + 1, arr[i].length());
			arr1[j] = arr1[j].replaceAll("\"", "");
			j++;
		}

		id = Integer.parseInt(arr[0]);
		name = arr[1];
		phone = arr[2];

		Subscriber subObj = new Subscriber(id, name, phone);
		return subObj;

	}

}

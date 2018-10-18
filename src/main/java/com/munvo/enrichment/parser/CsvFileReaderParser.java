package com.munvo.enrichment.parser;

import com.munvo.enrichment.model.Subscriber;

public class CsvFileReaderParser implements FileReaderParser {

	/*
	 * This class binds the data from the input string from csv file to Subscriber
	 * object
	 */
	private int id;
	private String name;
	private String phone;

	@Override
	public Subscriber parseSubscriber(String subLine) {

		String arr[] = subLine.split(",");
		for (int i = 0; i < arr.length; i++)
			arr[i] = arr[i].replaceAll("\"", "");

		id = Integer.parseInt(arr[0]);
		name = arr[1];
		phone = arr[2];

		Subscriber subObj = new Subscriber(id, name, phone);
		return subObj;
	}

}

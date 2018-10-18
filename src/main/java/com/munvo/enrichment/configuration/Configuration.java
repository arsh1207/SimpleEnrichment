package com.munvo.enrichment.configuration;

import com.typesafe.config.Config;
import com.typesafe.config.ConfigFactory;

public class Configuration {

	/*
	 * Implemented singleton for this class configuration
	 */
	private String studentName;
	private String type;
	private String fileName;

	private static Configuration instance = new Configuration();

	private Configuration() {
		Config config = ConfigFactory.load();
		this.studentName = config.getString("name");
		this.type = config.getString("type");
		this.fileName = config.getString("fileName");
	}

	public static Configuration getInstance() {
		return instance;
	}

	public String getStudentName() {
		return studentName;
	}

	public String getType() {
		return type;
	}

	public String getFileName() {
		return fileName;
	}
}
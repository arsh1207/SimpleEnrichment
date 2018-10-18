package com.munvo.enrichment.parser;

/*
 * I've implemented the Strategy and Factory pattern for InputSource class over the FileReaderParser.
 * */

public class FileReaderParserStrategyFactory {

	private final FileReaderParser jsonFileReader = new JsonFileReaderParser();
	private final FileReaderParser csvFileReader = new CsvFileReaderParser();

	public FileReaderParser getFileReaderParser(String filename) {
		switch (filename) {
		case "subscriber.json":
			return jsonFileReader;
		case "subscriber.csv":
			return csvFileReader;
		default:
			return null;
		}
	}
}
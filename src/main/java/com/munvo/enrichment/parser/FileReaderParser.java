package com.munvo.enrichment.parser;

import com.munvo.enrichment.model.Subscriber;

public interface FileReaderParser {
	public Subscriber parseSubscriber(String subLine);
}

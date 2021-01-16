package com.vijen.app.config;

import java.io.IOException;

@SuppressWarnings("serial")
public class CsvParseException extends Exception {
	/** @see Exception#Exception(Throwable) */
	public CsvParseException(IOException cause) {
		super(cause);
	}

	/** @see Exception#Exception(String) */
	public CsvParseException(String message) {
		super(message);
	}
}
package com.vijen.app.domain;

import java.util.List;

public class CSVFileDTO {
	String header;

	private List<String> listofFiles;

	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public List<String> getListofFiles() {
		return listofFiles;
	}

	public void setListofFiles(List<String> listofFiles) {
		this.listofFiles = listofFiles;
	}

}

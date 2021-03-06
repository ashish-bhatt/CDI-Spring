package com.intuit.core;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class ItemServerConnection {

	@NotNull
	@Size(min=3,max=20)
	private String name;
	
	@URL(protocol="ftp", port=21)
	@Size(min=10, max=200)
	private String ftpServerURL;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getFtpServerURL() {
		return ftpServerURL;
	}
	public void setFtpServerURL(String ftpServerURL) {
		this.ftpServerURL = ftpServerURL;
	}

}

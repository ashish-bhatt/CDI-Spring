package com.intuit.core;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.validation.executable.ValidateOnExecution;


public class ItemServerConnection {

	@NotNull
	@Size(min=3,max=20)
	private String name;
	
	@URL(protocol="ftp", port=21)
	@Size(min=10, max=200)
	private String ftpServerURL;
	
//	public ItemServerConnection(String name, String ftpServerURL){
//		this.name = name;
//		this.ftpServerURL = ftpServerURL;
//	}
	
	public String getName() {
		return name;
	}

	public void setName(@NotNull @Size(min=3,max=20) String name) {
		this.name = name;
	}

	public String getFtpServerURL() {
		return ftpServerURL;
	}
	
	public void setFtpServerURL(@URL(protocol="ftp", port=21) @Size(min=10, max=200) String ftpServerURL) {
		this.ftpServerURL = ftpServerURL;
	}

	@NotNull(message="returned String can't be null")
	public String returnSomeString(){
		return null;
	}
}

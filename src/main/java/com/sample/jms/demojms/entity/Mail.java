package com.sample.jms.demojms.entity;

public class Mail {
	private String to;
	private String body;
	
	public Mail() {
		
	}
	
	public Mail(String to, String body) {
		this.to = to;
		this.body = body;
	}
	
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}	
	
	@Override
	public String toString() {
		return String.format("Correo{to= %s, body= %s}", getTo(), getBody());
	}
}

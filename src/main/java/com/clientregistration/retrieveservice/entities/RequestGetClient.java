package com.clientregistration.retrieveservice.entities;

import com.fasterxml.jackson.annotation.JsonProperty;


public class RequestGetClient {
	@JsonProperty("id")
	private String id;
	@JsonProperty("requestId")
	private String requestId;
	@JsonProperty("channel")
	private String channel;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRequestId() {
		return requestId;
	}
	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}
	public String getChannel() {
		return channel;
	}
	public void setChannel(String channel) {
		this.channel = channel;
	}
}

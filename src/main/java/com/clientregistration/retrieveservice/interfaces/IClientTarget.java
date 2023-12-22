package com.clientregistration.retrieveservice.interfaces;

import com.clientregistration.retrieveservice.entities.GetClient;
import com.clientregistration.retrieveservice.entities.RequestGetClient;

public interface IClientTarget {
	
	GetClient getClientResponse();
	void getClient(RequestGetClient request);
}

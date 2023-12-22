package com.clientregistration.retrieveservice.adaptees;

import com.clientregistration.retrieveservice.entities.GetClient;
import com.clientregistration.retrieveservice.entities.RequestGetClient;
import com.clientregistration.retrieveservice.interfaces.IClientProviderAdaptee;
import com.clientregistration.retrieveservice.utilities.RequestAPI;

public class ClientsSalesforceAdaptee implements IClientProviderAdaptee {
	public ClientsSalesforceAdaptee () {}

	@Override
	public GetClient getClient(RequestGetClient request) {
		// TODO Auto-generated method stub
		RequestAPI requestAPI = new RequestAPI();
		return requestAPI.getClient(request);
	}
}

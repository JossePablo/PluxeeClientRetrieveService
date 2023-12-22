package com.clientregistration.retrieveservice.adapters;

import com.clientregistration.retrieveservice.entities.GetClient;
import com.clientregistration.retrieveservice.entities.RequestGetClient;
import com.clientregistration.retrieveservice.interfaces.IClientProviderAdaptee;
import com.clientregistration.retrieveservice.interfaces.IClientTarget;

public class ClientAdapter implements IClientTarget {
	
	private IClientProviderAdaptee _clientAdaptee;
	private GetClient getClient;
	
	public ClientAdapter(IClientProviderAdaptee adaptee) {
		this._clientAdaptee = adaptee;
	}
	
	@Override
	public void getClient(RequestGetClient request) {
		this.getClient = this._clientAdaptee.getClient(request);
	}

	@Override
	public GetClient getClientResponse() {
		// TODO Auto-generated method stub
		return this.getClient;
	}

}

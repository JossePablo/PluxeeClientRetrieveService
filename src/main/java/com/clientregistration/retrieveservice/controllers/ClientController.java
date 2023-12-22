package com.clientregistration.retrieveservice.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.clientregistration.retrieveservice.adaptees.ClientsSalesforceAdaptee;
import com.clientregistration.retrieveservice.adapters.ClientAdapter;
import com.clientregistration.retrieveservice.entities.GetClient;
import com.clientregistration.retrieveservice.entities.RequestGetClient;

@RestController
public class ClientController {
	
	@GetMapping("/retrieveservice")
	public GetClient getClient (@RequestBody RequestGetClient request) {
		ClientsSalesforceAdaptee clientsSalesforceAdaptee = new ClientsSalesforceAdaptee();
		ClientAdapter clientAdapter = new ClientAdapter(clientsSalesforceAdaptee);
		clientAdapter.getClient(request);
		return clientAdapter.getClientResponse();
	}

}

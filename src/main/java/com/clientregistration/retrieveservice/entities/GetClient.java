package com.clientregistration.retrieveservice.entities;

public class GetClient {
	private Response response;
	private Customer customer;
	private Opportunity opportunity;
	private SalesAgreement salesAgreement;
	
	public Response getResponse() {
		return response;
	}
	public void setResponse(Response response) {
		this.response = response;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Opportunity getOpportunity() {
		return opportunity;
	}
	public void setOpportunity(Opportunity opportunity) {
		this.opportunity = opportunity;
	}
	public SalesAgreement getSalesAgreement() {
		return salesAgreement;
	}
	public void setSalesAgreement(SalesAgreement salesAgreement) {
		this.salesAgreement = salesAgreement;
	}
}

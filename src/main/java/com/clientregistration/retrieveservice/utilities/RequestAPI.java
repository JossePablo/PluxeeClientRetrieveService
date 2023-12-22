package com.clientregistration.retrieveservice.utilities;

import java.util.Arrays;

import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.client.RestTemplate;

import com.clientregistration.retrieveservice.entities.Adresses;
import com.clientregistration.retrieveservice.entities.Contacts;
import com.clientregistration.retrieveservice.entities.Customer;
import com.clientregistration.retrieveservice.entities.GetClient;
import com.clientregistration.retrieveservice.entities.Opportunity;
import com.clientregistration.retrieveservice.entities.RequestGetClient;
import com.clientregistration.retrieveservice.entities.Response;
import com.clientregistration.retrieveservice.entities.SalesAgreement;

public class RequestAPI {

	RestTemplate restTemplate;

	public GetClient getClient(RequestGetClient request) {
		Response response = new Response();
		Customer customer = new Customer();
		Opportunity opportunity = new Opportunity();
		SalesAgreement salesAgreement = new SalesAgreement();
		Adresses adresses = new Adresses();
		Contacts contacts = new Contacts();
		GetClient get = new GetClient();

		HttpHeaders headers = new HttpHeaders();
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
		 //return (Future<GetClient>) restTemplate.exchange("http://localhost:8080/products", HttpMethod.PUT, entity, GetClient.class).getBody();
		response.setMessage("Successful");
		response.setStatus("200");
		response.setStatusCode("200");

		adresses.setBankAffiliationNumber("00001");
		adresses.setBuildingCompliment("ok");
		adresses.setCity("Mexico");
		adresses.setCountryRegion("Mexico");
		adresses.setCounty("Mexico");
		adresses.setDeliveryRole("example");
		adresses.setInvoiceRole("director");
		adresses.setName("example");
		adresses.setState("CDMX");
		adresses.setStreet("Polanco");
		adresses.setStreetNumber("09");
		adresses.setZipCode("59812");

		contacts.setBirthCountry("example");
		contacts.setBirthday("00/00/0000");
		contacts.setBirthState("Mexico");
		contacts.setContactId("12");
		contacts.setCurp("example");
		contacts.setEmail("example@example.com");
		contacts.setGender("m");
		contacts.setIdentificationNumber("12314345");
		contacts.setLastName("example");
		contacts.setMaritalStatus("single");
		contacts.setMiddleName("example");
		contacts.setMobilePhone("1234567890");
		contacts.setName("example");
		contacts.setPhone("123456789");

		customer.setClientGroupId("example");
		customer.setClientId("example");
		customer.setClientName("example");
		customer.setCompanyId("example");
		customer.setCompanyType("example");
		customer.setIdentificationNumber("example");
		customer.setInvoicePeriodDay("example");
		customer.setLanguage("example");
		customer.setNumberOfEmployees("example");
		customer.setOperationType("example");
		customer.setPaymentType("example");
		customer.setRfc("example");
		customer.setSiteId("example");
		customer.setSttlementFrequency("example");
		customer.setTaxRegime("example");
		customer.setType("example");
		customer.setValidityPeriod("example");
		customer.setAdresses(adresses);
		customer.setContacts(contacts);

		opportunity.setCloseDate("example");
		opportunity.setEstimatedBV("example");
		opportunity.setNumberOfBeneficiaries("example");
		opportunity.setProductFamily("example");
		opportunity.setProductOfInterest("example");

		salesAgreement.setDiscountPercentage("example");
		salesAgreement.setFinalPrice("example");
		salesAgreement.setPrice("example");
		salesAgreement.setProductOfInterest("example");

		get.setCustomer(customer);
		get.setOpportunity(opportunity);
		get.setResponse(response);
		get.setSalesAgreement(salesAgreement);

		return get;

	}
}

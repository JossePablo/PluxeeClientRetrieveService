package com.clientregistration.retrieveservice.controllers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.clientregistration.retrieveservice.entities.RequestGetClient;
import com.fasterxml.jackson.databind.ObjectMapper;

@WebMvcTest(controllers = ClientController.class)
@AutoConfigureMockMvc(addFilters = true)
@ExtendWith(MockitoExtension.class)

public class ClientControllerTests {

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private ObjectMapper objectMapper;

	private RequestGetClient requestGetClient;

	@BeforeEach
	public void init() {
		requestGetClient = new RequestGetClient();
	}

	@Test
	void clientController_getClient_returnGet() throws Exception {
		ResultActions response = mockMvc.perform(get("/retrieveService")
				.contentType(MediaType.APPLICATION_JSON)
				.content(objectMapper.writeValueAsString(requestGetClient)));
		response.andExpect(MockMvcResultMatchers.status().isCreated())
		.andDo(MockMvcResultHandlers.print());
	}

}

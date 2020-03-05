package com.account.Accounts;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.net.URL;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.ResponseEntity;

import com.account.Accounts.model.Account;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class AccountsControllerTest {
	
	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate restTemplate;

	@Test
	public void getAllAccounts() throws Exception {
		
		ResponseEntity<String> response = restTemplate.getForEntity(
				new URL("http://localhost:" + port + "/getAllAccounts").toString(), String.class);	       
		assertNotNull(response.getBody());
		
	}
	
	
	@Test
	public void getAllTransForAccounts() throws Exception {
		
		ResponseEntity<String> response = restTemplate.getForEntity(
				new URL("http://localhost:" + port + "/getAllTransForAccounts/1000").toString(), String.class);	       
		assertNotNull(response.getBody());
		
	}

}
	
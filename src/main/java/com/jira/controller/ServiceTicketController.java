package com.jira.controller;

import com.jira.service.JiraTicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jira.model.JiraPayload;

@RestController
public class ServiceTicketController {

	private JiraTicketService jiraTicketService;

	@Autowired
	public ServiceTicketController(JiraTicketService jiraTicketService) {
		this.jiraTicketService = jiraTicketService;
	}

	@PostMapping("/ticket.create")
	public ResponseEntity<String> createJiraTicket(@RequestBody JiraPayload jiraPayload) {
		try {
			System.out.println(jiraPayload);
			String response = jiraTicketService.createJiraTicket(jiraPayload);
			return new ResponseEntity<String>(jiraPayload.toString(), HttpStatus.CREATED);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<String>("Unable to process your request", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}

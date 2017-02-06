package org.ashish.trip.manager.v1.api;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class LoginValidation {
	
	@RequestMapping(value="/check",
			method= RequestMethod.GET,
			produces = MediaType.APPLICATION_JSON_VALUE)
	public String checkLogin(){
		return "{true}";
	}
}

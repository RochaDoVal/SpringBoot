package com.rochadoval.springboot.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.rochadoval.springboot.SpringbootApplication;
import com.rochadoval.springboot.entities.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    private final SpringbootApplication springbootApplication;

    UserResource(SpringbootApplication springbootApplication) {
        this.springbootApplication = springbootApplication;
    }
    
    @GetMapping
	public ResponseEntity<User> findAll(){
		User u = new User(1L, "Maria","maria@gmail.com", "99999999999", "12345");
		return ResponseEntity.ok().body(u);
		
		
	}
	
}

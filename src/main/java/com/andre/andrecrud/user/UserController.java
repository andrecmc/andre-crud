package com.andre.andrecrud.user;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@Autowired
	UserService userService;
	final Logger logger = LoggerFactory.getLogger(UserController.class);

	@RequestMapping("/users")
	public List<User> getAllUsers() {
		logger.debug("I am in getAllUsers");
		return userService.getAllUsers();
	}
	
	@RequestMapping("/users/{id}")
	public User getUsers(@PathVariable String id) {
		return userService.getUser(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value ="/users")
	public void addUser(@RequestBody User user) {
		userService.addUser(user);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value ="/users/{id}")
	public void updateUser(@RequestBody User topic, @PathVariable String id) {
		logger.debug("I am in updateUser");
		userService.updateUser(id, topic);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value ="/users/{id}")
	public void deleteUser(@PathVariable String id) {
		userService.deleteUser(id);
	}

}

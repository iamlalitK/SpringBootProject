package com.lalitstuff.springbootapi1.usermaster;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/userAddress")
public class UserAddressMasterController {

	@Autowired
	UserAddressMasterService userAddressMasterService;
	
	@PostMapping("/addUserAddress")
	public List<UserAddressMaster> addUserAddress(@RequestBody UserAddressMaster userAddressMaster){
		return userAddressMasterService.addUserAddress(userAddressMaster);
	}
	
	@GetMapping("/getAllUserAddress/{userId}")
	public List<UserAddressMaster> getAllUserAddress(@PathVariable int userId){
		return userAddressMasterService.getAllUserAddress(userId);
	}
}

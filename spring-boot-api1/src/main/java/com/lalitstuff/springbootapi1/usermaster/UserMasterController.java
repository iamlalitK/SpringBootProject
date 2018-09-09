package com.lalitstuff.springbootapi1.usermaster;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserMasterController {

	@Autowired
	UserMasterService userMasterService;
	
	@PostMapping("/addUser")
	public List<UserMaster> addUser(@RequestBody UserMaster userMaster){
		List<UserMaster> list = userMasterService.addUser(userMaster);
		return list;
	}
	
	@GetMapping("/getAllUser")
	public List<UserMaster> getAllUser(){
		List<UserMaster> list = userMasterService.getAllUser();
		return list;
	}
}

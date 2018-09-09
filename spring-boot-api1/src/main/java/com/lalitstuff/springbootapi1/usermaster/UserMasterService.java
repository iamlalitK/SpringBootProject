package com.lalitstuff.springbootapi1.usermaster;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserMasterService {
	
	@Autowired
	UserMasterRepository userMasterRepository;
	
	public List<UserMaster> addUser(UserMaster userMaster) {
		userMasterRepository.save(userMaster);
		return getAllUser();
	}
	
	public List<UserMaster> getAllUser() {
		List<UserMaster> list = new ArrayList<UserMaster>();
		userMasterRepository.findAll()
		.forEach(list::add);
		return list;
	}
	
	
}

package com.lalitstuff.springbootapi1.usermaster;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserAddressMasterService {

	@Autowired
	UserAddressMasterRepository userAddressMasterRepository;
	
	public List<UserAddressMaster> getAllUserAddress(int userId){
		List<UserAddressMaster> list = new ArrayList<UserAddressMaster>();
		userAddressMasterRepository.findByUserMasterUserId(userId)
		.forEach(list::add);
		return list;
	}
	
	public List<UserAddressMaster> addUserAddress(UserAddressMaster userAddressMaster){
		userAddressMasterRepository.save(userAddressMaster);
		return getAllUserAddress(userAddressMaster.getUserMaster().getUserId());
	}
}

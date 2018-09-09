package com.lalitstuff.springbootapi1.usermaster;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface UserAddressMasterRepository extends CrudRepository<UserAddressMaster, Integer>{

	public List<UserAddressMaster> findByUserMasterUserId(int userId);
	
}

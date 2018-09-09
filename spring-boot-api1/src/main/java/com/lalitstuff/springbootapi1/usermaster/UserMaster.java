package com.lalitstuff.springbootapi1.usermaster;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="user_master")
public class UserMaster {
	
	@Id
	@GeneratedValue
	@Column(name="user_id")
	private int userId;
	
	@Column(name="user_name")
	private String userName;
	
	@Column(name="password")
	private String password;
	
	@Column(name="mobile_no")
	private long mobileNo;
	
	@Column(name="email_id")
	private String emailId;

	public UserMaster() {
		super();
	}
	
	public UserMaster(int userId, String userName, String password,
			long mobileNo, String emailId) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.mobileNo = mobileNo;
		this.emailId = emailId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	
	
}

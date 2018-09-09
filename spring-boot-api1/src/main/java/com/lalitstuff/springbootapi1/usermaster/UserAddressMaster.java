package com.lalitstuff.springbootapi1.usermaster;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="user_address_master")
public class UserAddressMaster {

	@Id
	@GeneratedValue
	@Column(name="id")
	private int id;
	
	@Column(name="full_name")
	private String fullName;
	
	@Column(name="mobile_no")
	private long mobileNo;
	
	@Column(name="pincode")
	private int pincode;
	
	@Column(name="street_address_line1")
	private String streetAddressLine1;
	
	@Column(name="street_address_line2")
	private String streetAddressLine2;
	
	@Column(name="landmark")
	private String landmark;
	
	@Column(name="city")
	private int city;
	
	@Column(name="state")
	private int state;
	
	@Column(name="country")
	private int country;
	
	@ManyToOne
	private UserMaster userMaster;

	public UserAddressMaster() {
		super();
	}
	
	public UserAddressMaster(int id, String fullName, long mobileNo,
			int pincode, String streetAddressLine1, String streetAddressLine2,
			String landmark, int city, int state, int country,
			UserMaster userMaster) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.mobileNo = mobileNo;
		this.pincode = pincode;
		this.streetAddressLine1 = streetAddressLine1;
		this.streetAddressLine2 = streetAddressLine2;
		this.landmark = landmark;
		this.city = city;
		this.state = state;
		this.country = country;
		this.userMaster = userMaster;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getStreetAddressLine1() {
		return streetAddressLine1;
	}

	public void setStreetAddressLine1(String streetAddressLine1) {
		this.streetAddressLine1 = streetAddressLine1;
	}

	public String getStreetAddressLine2() {
		return streetAddressLine2;
	}

	public void setStreetAddressLine2(String streetAddressLine2) {
		this.streetAddressLine2 = streetAddressLine2;
	}

	public String getLandmark() {
		return landmark;
	}

	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}

	public int getCity() {
		return city;
	}

	public void setCity(int city) {
		this.city = city;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public int getCountry() {
		return country;
	}

	public void setCountry(int country) {
		this.country = country;
	}

	public UserMaster getUserMaster() {
		return userMaster;
	}

	public void setUserMaster(UserMaster userMaster) {
		this.userMaster = userMaster;
	}
	
}

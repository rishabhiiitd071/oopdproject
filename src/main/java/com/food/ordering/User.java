package com.food.ordering;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


import javax.persistence.JoinColumn;

@Entity
@Table(name =  "user_table", uniqueConstraints = @UniqueConstraint(columnNames = "emailid"))
public class User {
	
	@Column
	private String username;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private int phonenumber;
	
	@Column
	private String address;
	
	@Column
	private String password;
	
	@Column
	private String emailid;
	
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinTable(
			name = "users_roles",
			joinColumns = @JoinColumn(
		            name = "user_id", referencedColumnName = "id"),
			inverseJoinColumns = @JoinColumn(
				            name = "role_id", referencedColumnName = "id"))
	
	private Collection<Role> roles;
	
	public User() {
		
	}
	public User(String username,int phonenumber, String address, String password, String emailid, Collection<Role> roles) {
		super();
		this.username = username;
		this.phonenumber = phonenumber;
		this.address = address;
		this.password = password;
		this.emailid = emailid;
		this.roles = roles;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}


	public int getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmailid() {
		return emailid;
	}

	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	
	public Collection<Role> getRoles() {
		return roles;
	}
	public void setRoles(Collection<Role> roles) {
		this.roles = roles;
	}
}

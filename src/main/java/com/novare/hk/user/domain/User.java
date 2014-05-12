package com.novare.hk.user.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="user")
public class User {

	@Id
	@Column(unique=true, nullable=false)
	private Long userId;
	

	@Column(nullable=false)
	private String firstName;
	
	
	@Column(nullable=false)
	private String lastName;
	

	@Column(nullable=false)
	private String middleName;
	
	
	@Column(unique=true, nullable=false)
	private String email;
	
	
	@Column(unique=true, nullable=false)
	private String username;
	

	@Column(nullable=false)
	private String password;
	

	@Column(nullable=false)
	private Long positionId;
	
	@Column
	private Long supervisorId;
	
	@Column
	private String dateHired;
	

	@Column(nullable=false)
	private String role;
	
	@Column(unique=true)
	private String sssId;
	
	@Column(unique=true)
	private String pagibigId;
	
	@Column(unique=true)
	private String healthcardId;
	
	@Column(unique=true)
	private String tinId;
	
	@Column
	private Boolean isUserAccessDenied;
	
	public User(){
	}

	public User(Long userId,String firstName, String lastName,
			String middleName, String email, String username, String password,
			Long positionId, Long supervisorId, String dateHired, String role,
			String sssId, String pagibigId, String healthcardId, String tinId,
			Boolean isUserAccessDenied) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.email = email;
		this.username = username;
		this.password = password;
		this.positionId = positionId;
		this.supervisorId = supervisorId;
		this.dateHired = dateHired;
		this.role = role;
		this.sssId = sssId;
		this.pagibigId = pagibigId;
		this.healthcardId = healthcardId;
		this.tinId = tinId;
		this.isUserAccessDenied = isUserAccessDenied;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Long getPositionId() {
		return positionId;
	}

	public void setPositionId(Long positionId) {
		this.positionId = positionId;
	}

	public Long getSupervisorId() {
		return supervisorId;
	}

	public void setSupervisorId(Long supervisorId) {
		this.supervisorId = supervisorId;
	}

	public String getDateHired() {
		return dateHired;
	}

	public void setDateHired(String dateHired) {
		this.dateHired = dateHired;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getSssId() {
		return sssId;
	}

	public void setSssId(String sssId) {
		this.sssId = sssId;
	}

	public String getPagibigId() {
		return pagibigId;
	}

	public void setPagibigId(String pagibigId) {
		this.pagibigId = pagibigId;
	}

	public String getHealthcardId() {
		return healthcardId;
	}

	public void setHealthcardId(String healthcardId) {
		this.healthcardId = healthcardId;
	}

	public String getTinId() {
		return tinId;
	}

	public void setTinId(String tinId) {
		this.tinId = tinId;
	}

	public Boolean getIsUserAccessDenied() {
		return isUserAccessDenied;
	}

	public void setIsUserAccessDenied(Boolean isUserAccessDenied) {
		this.isUserAccessDenied = isUserAccessDenied;
	}
	
}

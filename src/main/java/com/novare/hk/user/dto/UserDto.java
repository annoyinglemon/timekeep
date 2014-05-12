package com.novare.hk.user.dto;

import java.io.Serializable;
import java.sql.Date;

public class UserDto implements Serializable {

	private Long userId;
	private String firstName;
	private String lastName;
	private String middleName;
	private String email;
	private String username;
	private String password;
	private Long positionId;
	private Long supervisorId;
	private String dateHired;
	private String role;
	private String sssId;
	private String pagibigId;
	private String healthcardId;
	private String tinId;
	private Boolean isUserAccessDenied;
	
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
	public void setDateHired(String date) {
		this.dateHired = date;
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

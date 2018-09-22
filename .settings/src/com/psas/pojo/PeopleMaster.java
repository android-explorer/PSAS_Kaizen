package com.psas.pojo;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


@Entity
@Table(name = "peopleMaster", uniqueConstraints = @UniqueConstraint(columnNames = "employeeEmailId"))
public class PeopleMaster implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4837098037772020729L;
	
	private String backendDatabaseId;
	private String salutation;
	private String firstName;
	private String lastName;
	private String employeeEmailId;
	private String employeeNumber;
	private String department;
	private String telephone;
	private String countryCode;
	private String mobileNumber;
	private String alternateCountryCode;
	private String alternateMobileNumber;
	private String lineManagerName;
	private String lineManagerId;
	private String lineManagerEmailId;
	private String status;
	
	
	
	//backend entries
	private String peopleId;
	private String orgId;
	private String createdBy;
	private String updatedBy;
	private Date createdOn;
	private Date lastUpdatedOn;

	
	
	
/*	PeopleMaster()
	{
		
	}*/     /// *********************UOKEI************************
	

	@Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	public String getBackendDatabaseId() {
		return backendDatabaseId;
	}
	public void setBackendDatabaseId(String backendDatabaseId) {
		this.backendDatabaseId = backendDatabaseId;
	}

	@Column(name = "salutation",  length = 50)
	public String getSalutation() {
		return salutation;
	}
	public void setSalutation(String salutation) {
		this.salutation = salutation;
	}
	
	@Column(name = "firstName",  length = 50)
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	
	@Column(name = "lastName",  length = 50)
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Column(name = "employeeEmailId",  length = 50)
	public String getEmployeeEmailId() {
		return employeeEmailId;
	}
	public void setEmployeeEmailId(String employeeEmailId) {
		this.employeeEmailId = employeeEmailId;
	}
	
	@Column(name = "employeeNumber",  length = 50)
	public String getEmployeeNumber() {
		return employeeNumber;
	}
	public void setEmployeeNumber(String employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	
	@Column(name = "department",  length = 50)
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	@Column(name = "telephone",  length = 50)
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	
	@Column(name = "countryCode",  length = 50)
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	
	@Column(name = "mobileNumber",  length = 50)
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	
	@Column(name = "alternateCountryCode",  length = 50)
	public String getAlternateCountryCode() {
		return alternateCountryCode;
	}
	public void setAlternateCountryCode(String alternateCountryCode) {
		this.alternateCountryCode = alternateCountryCode;
	}
	
	@Column(name = "alternateMobileNumber",  length = 50)
	public String getAlternateMobileNumber() {
		return alternateMobileNumber;
	}
	public void setAlternateMobileNumber(String alternateMobileNumber) {
		this.alternateMobileNumber = alternateMobileNumber;
	}
	
	@Column(name = "lineManagerName",  length = 50)
	public String getLineManagerName() {
		return lineManagerName;
	}
	public void setLineManagerName(String lineManagerName) {
		this.lineManagerName = lineManagerName;
	}
	
	@Column(name = "lineManagerId",  length = 50)
	public String getLineManagerId() {
		return lineManagerId;
	}
	public void setLineManagerId(String lineManagerId) {
		this.lineManagerId = lineManagerId;
	}
	
	@Column(name = "lineManagerEmailId",  length = 50)
	public String getLineManagerEmailId() {
		return lineManagerEmailId;
	}
	public void setLineManagerEmailId(String lineManagerEmailId) {
		this.lineManagerEmailId = lineManagerEmailId;
	}
	
	@Column(name = "status",  length = 50)
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	@Column(name = "peopleId",  length = 50)
	public String getPeopleId() {
		return peopleId;
	}
	public void setPeopleId(String peopleId) {
		this.peopleId = peopleId;
	}
	
	@Column(name = "orgId",  length = 50)
	public String getOrgId() {
		return orgId;
	}
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}
	
	@Column(name = "createdBy",  length = 50)
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	
	@Column(name = "updatedBy",  length = 50)
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	
	@Column(name = "createdOn",  length = 50)
	public Date getCreatedOn() {
		return createdOn;
	}
	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}
	
	@Column(name = "lastUpdatedOn",  length = 50)
	public Date getLastUpdatedOn() {
		return lastUpdatedOn;
	}
	public void setLastUpdatedOn(Date lastUpdatedOn) {
		this.lastUpdatedOn = lastUpdatedOn;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

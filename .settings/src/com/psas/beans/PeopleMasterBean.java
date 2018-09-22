package com.psas.beans;

import java.io.Serializable;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import com.psas.dao.PeopleMasterInterface;
import com.psas.daoimpl.OrganizationMasterImpl;
import com.psas.daoimpl.PeopleMasterImpl;



@ManagedBean(name = "peopleMaster", eager = true )
@RequestScoped
@ViewScoped
public class PeopleMasterBean implements Serializable{

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3590356931744063940L;
	

	private String salutation;
	private String firstName;
	private String lastName;
	private String employeeEmailId;
	private String employeeNumber;
	private String department;
	private String telephone;
	private String countryCode,mobileNumber;
	private String alternateCountryCode,alternateMobileNumber;
	private String lineManagerName;
	private String lineManagerId;
	private String lineManagerEmailId;
	private String status;
	
	
	
	
	
	PeopleMasterInterface masterInterface=new PeopleMasterImpl();
	
	
	public String getSalutation() {
		return salutation;
	}
	public void setSalutation(String salutation) {
		this.salutation = salutation;
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
	public String getEmployeeEmailId() {
		return employeeEmailId;
	}
	public void setEmployeeEmailId(String employeeEmailId) {
		this.employeeEmailId = employeeEmailId;
	}
	public String getEmployeeNumber() {
		return employeeNumber;
	}
	public void setEmployeeNumber(String employeeNumber) {
		this.employeeNumber = employeeNumber;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public String getAlternateCountryCode() {
		return alternateCountryCode;
	}
	public void setAlternateCountryCode(String alternateCountryCode) {
		this.alternateCountryCode = alternateCountryCode;
	}
	public String getAlternateMobileNumber() {
		return alternateMobileNumber;
	}
	public void setAlternateMobileNumber(String alternateMobileNumber) {
		this.alternateMobileNumber = alternateMobileNumber;
	}
	public String getLineManagerName() {
		return lineManagerName;
	}
	public void setLineManagerName(String lineManagerName) {
		this.lineManagerName = lineManagerName;
	}
	public String getLineManagerId() {
		return lineManagerId;
	}
	public void setLineManagerId(String lineManagerId) {
		this.lineManagerId = lineManagerId;
	}
	public String getLineManagerEmailId() {
		return lineManagerEmailId;
	}
	public void setLineManagerEmailId(String lineManagerEmailId) {
		this.lineManagerEmailId = lineManagerEmailId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	
	
	public String save() throws Exception
	{
	int result=0;	
		
	
	result=masterInterface.getStart(salutation,
			firstName, lastName, 
			employeeEmailId, employeeNumber,
			department, telephone, countryCode, 
			mobileNumber, alternateCountryCode,
			alternateMobileNumber, lineManagerName,
			lineManagerId, lineManagerEmailId, status);
	
	
	
	
	
	
	if(result==0)
	{
		return "organizationMaster";
	}

	else if(result==1)
	{
		
		
		


		
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "You are registered sucessfully.", "PrimeFaces Rocks."));
		
		
		
		
		
		
		
		return "peopleMaster?faces-redirect=true";
	}

	else if(result==2)
	{
		// already registered
		
		
		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Person with same email id is already registered.", "PrimeFaces Rocks."));
		  return "peopleMaster?faces-redirect=false";
	}

	else
	{

		FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN, "Internal Error", "PrimeFaces Rocks."));
		 return "organizationMaster?faces-redirect=true";
	}

	
	
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

package com.psas.daoimpl;

import java.util.Date;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

import com.psas.common.HibernateUtil;
import com.psas.dao.PeopleMasterInterface;
import com.psas.pojo.OrganizationMaster;
import com.psas.pojo.PeopleMaster;

public class PeopleMasterImpl implements PeopleMasterInterface{

	@Override
	public int getStart(String salutation, String firstName, String lastName, String employeeEmailId,
			String employeeNumber, String department, String telephone, String countryCode, String mobileNumber,
			String alternateCountryCode, String alternateMobileNumber, String lineManagerName, String lineManagerId,
			String lineManagerEmailId, String status) throws Exception {
		// TODO Auto-generated method stub
		
		
		
		
		
		
		
		
		String OrgId=null;//yet to be fetched from OrganizationMaster
		
	
		

		 String createdBy=null;
        Date createdOn=new Date();
		String lastUpdatedBy=null;
		 Date lastUpdatedOn=new Date();
		
		PeopleMaster  peopleMasterObj = null;
		Session session = null;
		Transaction tx2 = null;
		int result = 0;
		
try{
			
			session = HibernateUtil.getSession();
			tx2 = session.beginTransaction(); //ExceptionLine
			
			peopleMasterObj =    (PeopleMaster) session.createCriteria(PeopleMaster.class)
					.add(Restrictions.eq("employeeEmailId",employeeEmailId.toLowerCase().trim()).ignoreCase())				
										.uniqueResult();
			
			if (peopleMasterObj != null) {

				result=2;	
			}else{ 
				
				peopleMasterObj=new PeopleMaster();
				
				
				
				
				
				
			peopleMasterObj.setSalutation(salutation);
			peopleMasterObj.setFirstName(firstName);
			peopleMasterObj.setLastName(lastName);
			peopleMasterObj.setEmployeeEmailId(employeeEmailId);
			peopleMasterObj.setEmployeeNumber(employeeNumber);
			peopleMasterObj.setDepartment(department);
			peopleMasterObj.setTelephone(telephone);
			peopleMasterObj.setCountryCode(countryCode);
			peopleMasterObj.setMobileNumber(mobileNumber);
			peopleMasterObj.setAlternateCountryCode(alternateCountryCode);
			peopleMasterObj.setAlternateMobileNumber(alternateMobileNumber);
			peopleMasterObj.setLineManagerName(lineManagerName);
			peopleMasterObj.setLineManagerId(lineManagerId);
			peopleMasterObj.setLineManagerEmailId(lineManagerEmailId);
			peopleMasterObj.setStatus(status);
			
			
			peopleMasterObj.setCreatedOn(createdOn);
			peopleMasterObj.setLastUpdatedOn(lastUpdatedOn);
			
			
			
			
				session.save(peopleMasterObj);
				
				
		
				
			result=1;
			}
			
				tx2.commit();
			
			
			
			
			
		}catch(Exception e){
			if(tx2 != null)
			{
				tx2.rollback();
			}

			e.printStackTrace();
			throw new Exception(e);
		} finally {
			if (session != null)
				session.close();
		}
		
		
		return result;
	
	
	
	}

}

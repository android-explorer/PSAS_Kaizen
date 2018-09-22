package com.psas.beans;

import javax.faces.bean.ManagedBean;

import com.psas.dao.TestBySatishInterface;
import com.psas.daoimpl.TestBySatishImpl;

@ManagedBean(name="testbysatish")
public class TestBySatish {

	private TestBySatishInterface obj=new TestBySatishImpl();
	private String category;
	public String save(){
		System.out.println("category name "+category);
		int result=0;
		result = obj.getSaveCategory(category);
		return "testBySatish.xhtml";
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
}

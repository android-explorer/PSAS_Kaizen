package com.psas.dao;

import java.util.List;



import org.primefaces.model.UploadedFile;

import com.psas.vo.MasterVo;

public interface RoleInterface {

	public int getsaverole(String rolename) throws Exception;


	

	int getsaverole1(String rolename, String description) throws Exception;

	List<MasterVo> getretrive()throws Exception;

	public MasterVo getretrivedata(int id) throws Exception;




	public int getsaverole(String rolename, String description) throws Exception;
	;

	
}


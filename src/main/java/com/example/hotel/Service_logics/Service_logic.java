package com.example.hotel.Service_logics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hotel.Entity.Entity1;
import com.example.hotel.Repository.Repository_1;

@Service
public class Service_logic  {
	
	

	@Autowired
	Repository_1 re;
	

	@Autowired
	Entity1 en;
	
	

	public void Save(Entity1 en) {
		// TODO Auto-generated method stub
		
		System.out.println(en.getName());

		System.out.println(en.getEmail());
		
		
		 re.save(en);
	}


	
	public void delete(Entity1 en)
	{
		
		System.out.println(en.getId()+"is Deleted");

		
		
		re.delete(en);
	}
	
}

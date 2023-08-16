package com.example.hotel.Ctrl1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.hotel.Entity.Entity1;
import com.example.hotel.Service_logics.Service_logic;

@RestController
public class Delete_1 {
	
	@Autowired
	Entity1 en1;
	
	
	@Autowired
	Service_logic ss1;

	@RequestMapping("/Delete_ctrl")
	public String Delete_op(@RequestParam Integer id)
	{
		
		en1.setId(id);
		
	
		
		
	ss1.delete(en1);
	
		return "your entered id is Deleted...";
	}
	
	
}

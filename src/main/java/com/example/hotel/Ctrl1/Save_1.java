package com.example.hotel.Ctrl1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.example.hotel.Entity.Entity1;
import com.example.hotel.Entity.Fetching;
import com.example.hotel.Service_logics.Service_logic;


@RestController
public class Save_1  {

	@Autowired
	Entity1 en;
	
	@Autowired
	Service_logic ss;
	
	
	@RequestMapping("/index_ctrl")
	public Entity1 Save_1(@RequestParam Integer id,@RequestParam String city,@RequestParam String name,@RequestParam String email,@RequestParam String checkin,@RequestParam String checkout,@RequestParam String adult,@RequestParam String children,@RequestParam String room)
	{
		
		
		en.setId(id);
		en.setCity(city);
		en.setName(name);
		en.setEmail(email);
		en.setCheckin(checkin);
		en.setCheckout(checkout);
		en.setAdult(adult);
		en.setChildren(children);
		en.setRoom(room);
		
		
		ss.Save(en);
		
		return en;
		
		
		
		
		
	}

	
}

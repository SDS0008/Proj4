package com.example.hotel.Entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Component

@Entity

@Table(name ="hotel1")

public class Entity1 {
	
	
	
	
	@Id
	private Integer id;
	
	@Column(name = "city")
	private String city;
	
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "email",nullable = false)
	private String email;
	
	
	
	@Column(name = "checkin")
	private String checkin;
	
	@Column(name = "checkout")
	private String checkout;
	
	@Column(name = "adult")
	private String adult;
	
	@Column(name = "children")
	private String children;
	
	@Column(name = "room")
	private String room;
	
	
	
	
	
	
	
	
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCheckin() {
		return checkin;
	}

	public void setCheckin(String checkin) {
		this.checkin = checkin;
	}

	public String getCheckout() {
		return checkout;
	}

	public void setCheckout(String checkout) {
		this.checkout = checkout;
	}

	public String getAdult() {
		return adult;
	}

	public void setAdult(String adult) {
		this.adult = adult;
	}

	public String getChildren() {
		return children;
	}

	public void setChildren(String children) {
		this.children = children;
	}

	public String getRoom() {
		return room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	
	

}

package com.example.hotel.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Fetching {

	@Autowired
	Entity1 d2;
	
	public Entity1 fetching() {
	
	 System.out.println("<html>");
	    
	System.out.println("<table border=3>");

	System.out.println("<tr></br>");

	System.out.println(" <th>ID</th>");
	
	System.out.println(" <th>EMAIL</th>");	
	System.out.println(" <th>Name</th>");

	System.out.println(" <th>Checking</th>");
	System.out.println(" <th>Checkout</th>");
	
	System.out.println("</tr>");
	
	System.out.println("<tr>");
	
	
	System.out.println("<td>"+d2.getId()+"</td>");
	
	System.out.println("<td>"+d2.getEmail()+"</td>");
	System.out.println("<td>"+d2.getName()+"</td>");
	System.out.println("<td>"+d2.getCheckin()+"</td>");
	System.out.println("<td>"+d2.getCheckout()+"</td>");
	System.out.println("</tr>");

	System.out.println("</table>");
	
	System.out.println("</html>");
	return d2;
	
	// from hre .. link with logout servlet
	}

}

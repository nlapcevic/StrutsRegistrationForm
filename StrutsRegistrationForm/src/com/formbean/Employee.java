package com.formbean;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

public class Employee extends ActionForm {

	private int id;
	private String name, email, address, gender;
	private String[] hobies;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}
	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}
	/**
	 * @param gender the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
	}
	/**
	 * @return the hobies
	 */
	public String[] getHobies() {
		return hobies;
	}
	/**
	 * @param hobies the hobies to set
	 */
	public void setHobies(String[] hobies) {
		this.hobies = hobies;
	} 
	
	@Override
	public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
		ActionErrors ae = new ActionErrors();
		if(id==0) {
			ae.add("id_e", new ActionMessage("idMsg"));
		}
		if(name.equals("")) {
			ae.add("name_e", new ActionMessage("nameMsg"));			
		}
		if(address.equals("")) {
			ae.add("address_e", new ActionMessage("addressMsg"));
		}
		if(email.equals("")) {
			ae.add("email_e", new ActionMessage("emailMsg"));
		}
		if(gender.equals("")) {
			ae.add("gendar_e", new ActionMessage("genderMsg"));
		}
			
		if(hobies.length<1) {
			ae.add("hobies_e", new ActionMessage("hobiesMsg"));
		}

		return ae;
	}
	
}

package application;

import java.util.ArrayList;

import javafx.scene.control.Button;

public class Restaurant {
	protected String id, name, address, pn, email, workingHours, tc, td, priceRange;// pn=phone number, tc= type of
																					// cusine, td = type of dining
	protected ArrayList<food> menu;
	protected Button picture;

	public Restaurant(String name, String address, String pn, String email, String workingHours, String tc, String td,
			String priceRange, ArrayList<food> menu) {
		this.name = name;
		this.address = address;
		this.pn = pn;
		this.email = email;
		this.workingHours = workingHours;
		this.tc = tc;
		this.td = td;
		this.priceRange = priceRange;
		this.menu = menu;
	}

	public Restaurant(String name, String address, String tc, Button picture) {
		this.name = name;
		this.address = address;
		this.tc = tc;
		this.picture = picture;

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPn() {
		return pn;
	}

	public void setPn(String pn) {
		this.pn = pn;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getWorkingHours() {
		return workingHours;
	}

	public void setWorkingHours(String workingHours) {
		this.workingHours = workingHours;
	}

	public String getTc() {
		return tc;
	}

	public void setTc(String tc) {
		this.tc = tc;
	}

	public String getTd() {
		return td;
	}

	public void setTd(String td) {
		this.td = td;
	}

	public String getPriceRange() {
		return priceRange;
	}

	public void setPriceRange(String priceRange) {
		this.priceRange = priceRange;
	}

	public ArrayList<food> getMenu() {
		return menu;
	}

	public void setMenu(ArrayList<food> menu) {
		this.menu = menu;
	}

}

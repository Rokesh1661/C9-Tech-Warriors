package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Mall {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String mallAdmin;
	private String mallName;
	private String location;
	private long shopId;
	private String category;
	public Mall() {
		
	}
	public Mall(long id, String mallAdmin, String mallName, String location, long shopId, String category) {
		
		this.id = id;
		this.mallAdmin = mallAdmin;
		this.mallName = mallName;
		this.location = location;
		this.shopId = shopId;
		this.category = category;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getMallAdmin() {
		return mallAdmin;
	}
	public void setMallAdmin(String mallAdmin) {
		this.mallAdmin = mallAdmin;
	}
	public String getMallName() {
		return mallName;
	}
	public void setMallName(String mallName) {
		this.mallName = mallName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public long getShopId() {
		return shopId;
	}
	public void setShopId(long shopId) {
		this.shopId = shopId;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}

}

package com.example.JetAirways.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class JetAirways 
{
	@Id
	private int fid;
	private String fname;
	private String date;
	public int getFid() {
		return fid;
	}
	public void setFid(int fid) {
		this.fid = fid;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
}

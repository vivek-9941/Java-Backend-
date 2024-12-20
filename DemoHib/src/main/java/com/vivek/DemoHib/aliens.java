package com.vivek.DemoHib;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Transient;

//allow class to store its obj 
//@Entity(name = "now_table_change")
@Entity
public class aliens {
	
	//should have a primary key
	@Id
	private int aid;
	private name aname;
	private String acolor;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	
	public name getAname() {
		return aname;
	}
	public void setAname(name aname) {
		this.aname = aname;
	}
	public String getAcolor() {
		return acolor;
	}
	public void setAcolor(String acolor) {
		this.acolor = acolor;
	}
	@Override
	public String toString() {
		return "aliens [aid=" + aid + ", aname=" + aname + ", acolor=" + acolor + "]";
	}
	
}

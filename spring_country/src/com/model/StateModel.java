package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="state")
public class StateModel {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String sn;
	private String sd;
	
	@ManyToOne
	private CountryModel cm;
	
	public CountryModel getCm() {
		return cm;
	}
	public void setCm(CountryModel cm) {
		this.cm = cm;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getSn() {
		return sn;
	}
	public void setSn(String sn) {
		this.sn = sn;
	}
	public String getSd() {
		return sd;
	}
	public void setSd(String sd) {
		this.sd = sd;
	}
	
}

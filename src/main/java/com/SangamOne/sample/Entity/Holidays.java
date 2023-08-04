package com.SangamOne.sample.Entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="holidays")
public class Holidays {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	@Column(name = "holiday_id")
	private int holidayId;

	@Column(name = "holiday_name")
	private String holidayName;
	
	@ManyToOne 
	@JoinColumn(name="company_id", insertable = false, updatable = false)
	private Company company;
	
	@ManyToOne
	@JoinColumn (name="state_id", insertable = false, updatable = false)
	private States states;

	public int getHolidayId() {
		return holidayId;
	}

	public void setHolidayId(int holidayId) {
		this.holidayId = holidayId;
	}

	public String getHolidayName() {
		return holidayName;
	}

	public void setHolidayName(String holidayName) {
		this.holidayName = holidayName;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public States getStates() {
		return states;
	}

	public void setStates(States states) {
		this.states = states;
	}
	
	
}

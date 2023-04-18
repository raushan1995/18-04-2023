package com.cg.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="covid")
public class model {
  
	private String name;
	private String type;
	private String confirmed;
	private String recovered;
	private String deaths;
	private String confirmedNewCases;
	private String confirmedNewDeaths;
	private String lastUpdated;
	public model() {
		super();
		// TODO Auto-generated constructor stub
	}
	public model(String name, String type, String confirmed, String recovered, String deaths, String confirmedNewCases,
			String confirmedNewDeaths, String lastUpdated) {
		super();
		this.name = name;
		this.type = type;
		this.confirmed = confirmed;
		this.recovered = recovered;
		this.deaths = deaths;
		this.confirmedNewCases = confirmedNewCases;
		this.confirmedNewDeaths = confirmedNewDeaths;
		this.lastUpdated = lastUpdated;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getConfirmed() {
		return confirmed;
	}
	public void setConfirmed(String confirmed) {
		this.confirmed = confirmed;
	}
	public String getRecovered() {
		return recovered;
	}
	public void setRecovered(String recovered) {
		this.recovered = recovered;
	}
	public String getDeaths() {
		return deaths;
	}
	public void setDeaths(String deaths) {
		this.deaths = deaths;
	}
	public String getConfirmedNewCases() {
		return confirmedNewCases;
	}
	public void setConfirmedNewCases(String confirmedNewCases) {
		this.confirmedNewCases = confirmedNewCases;
	}
	public String getConfirmedNewDeaths() {
		return confirmedNewDeaths;
	}
	public void setConfirmedNewDeaths(String confirmedNewDeaths) {
		this.confirmedNewDeaths = confirmedNewDeaths;
	}
	public String getLastUpdated() {
		return lastUpdated;
	}
	public void setLastUpdated(String lastUpdated) {
		this.lastUpdated = lastUpdated;
	}
	@Override
	public String toString() {
		return "model [name=" + name + ", type=" + type + ", confirmed=" + confirmed + ", recovered=" + recovered
				+ ", deaths=" + deaths + ", confirmedNewCases=" + confirmedNewCases + ", confirmedNewDeaths="
				+ confirmedNewDeaths + ", lastUpdated=" + lastUpdated + "]";
	}
	
	
	
}

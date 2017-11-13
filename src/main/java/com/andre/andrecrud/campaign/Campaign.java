package com.andre.andrecrud.campaign;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Campaign {
	
    @Id
	private String id;
	private String name;
	private String idTeam;
	private String start;
	private String end;
	
	public Campaign() {}
	
	public Campaign(String id, String name, String idTeam) {
		super();
		this.id = id;
		this.name = name;
		this.idTeam = idTeam;
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
	public String getIdTeam() {
		return idTeam;
	}
	public void setIdTeam(String idTeam) {
		this.idTeam = idTeam;
	}
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public String getEnd() {
		return end;
	}
	public void setEnd(String end) {
		this.end = end;
	}
}

package com.js.jainsamaj.models.Matrimony.ProfileAndSearch.Response.Search;

import java.io.Serializable;

public class Degree implements Serializable{
	public String educationLevel;
	public String description;
	public int id;
	public boolean status;

	public void setEducationLevel(String educationLevel){
		this.educationLevel = educationLevel;
	}

	public String getEducationLevel(){
		return educationLevel;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setStatus(boolean status){
		this.status = status;
	}

	public boolean isStatus(){
		return status;
	}

	@Override
 	public String toString(){
		return 
			"Degree{" + 
			"educationLevel = '" + educationLevel + '\'' + 
			",description = '" + description + '\'' + 
			",id = '" + id + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}

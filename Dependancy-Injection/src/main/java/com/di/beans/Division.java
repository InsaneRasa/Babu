package com.di.beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Division {

	Set<Students> stus;
	Map<String,Students> ranks;
	
	List<String> subjects;
	Map<String,String> studentsInDivision;
	
	
	
	public Set<Students> getStus() {
		return stus;
	}



	public void setStus(Set<Students> stus) {
		this.stus = stus;
	}



	public Map<String, Students> getRanks() {
		return ranks;
	}



	public void setRanks(Map<String, Students> ranks) {
		this.ranks = ranks;
	}



	public List<String> getSubjects() {
		return subjects;
	}



	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}



	public Map<String, String> getStudentsInDivision() {
		return studentsInDivision;
	}



	public void setStudentsInDivision(Map<String, String> studentsInDivision) {
		this.studentsInDivision = studentsInDivision;
	}



	@Override
	public String toString() {
		return "Division [stus=" + stus + ", ranks=" + ranks + ", subjects=" + subjects + ", studentsInDivision="
				+ studentsInDivision + "]";
	}



	
	
	
}

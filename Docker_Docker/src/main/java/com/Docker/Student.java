package com.Docker;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "Student_Docker")
public class Student {
	
	@Id
	@JsonProperty("id")
	String id;
	
	@Column(name="Name_Student")
	@JsonProperty("name")
	String nameString;
	
	@Column(name = "City_Student")
	@JsonProperty("city")
	String city;

}

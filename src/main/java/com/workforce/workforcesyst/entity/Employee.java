package com.workforce.workforcesyst.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name ="Employee")
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	//@Column(name="first_name")
	private String firstName;
	private String lastName;
	private String emailId;
	
	public Employee(Long id, String firstName, String lastName, String emailId) {
	}

	public Object getId() {
		return id;	}

	public Object getFirstName() {
		return firstName;
	}

	public Object getLastName() {
		return lastName;
	}
	
	public Object getEmailId() {
		return emailId;
	}
}

package com.rahul.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@RequiredArgsConstructor
public class PhoneNumber {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long regNo;

	@NonNull
	private Long phoneNo;

	@NonNull
	private String provider;

	@NonNull
	private String type;

	@ManyToOne(targetEntity = Person.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "PERSON_ID", referencedColumnName = "pid")
	private Person person;

}

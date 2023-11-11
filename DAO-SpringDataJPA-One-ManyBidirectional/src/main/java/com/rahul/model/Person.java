package com.rahul.model;

import java.util.Set;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
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
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer pid;

	@NonNull
	private String pname;

	@NonNull
	private String paddress;

	@OneToMany(targetEntity = PhoneNumber.class, cascade = CascadeType.ALL)
	@JoinColumn(name = "PERSON_ID", referencedColumnName = "pid")
	private Set<PhoneNumber> contactDetails;

}

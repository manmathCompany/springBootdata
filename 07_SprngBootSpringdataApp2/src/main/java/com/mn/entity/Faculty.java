package com.mn.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Table(name="FACULTY_TAB")
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Faculty {

	@Id
	@Column(name="FACULTY_ID")
	private int fId;
	@Column(name="FACULTY_NAME")
	private String fName;
	@Column(name="FACULTY_FEE")
	private double fee;
	@Column(name="FACULTY_AGE")
	private int age;
	@Column(name="FACULTY_GENDER")
	private String gender;
}

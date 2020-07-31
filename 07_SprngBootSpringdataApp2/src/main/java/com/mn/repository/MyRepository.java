package com.mn.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mn.entity.Faculty2;

public interface MyRepository extends JpaRepository<Faculty2, Serializable> {

	/*
	 * @Query("INSERT INTO Faculty(fId,fName,fee,age,gender) SELECT fId,fName,fee,age,gender FROM Faculty2 WHERE fId=:id"
	 * ) public void insert(int id);
	 */
}

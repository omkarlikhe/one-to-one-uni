package com.ty.onetoone.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.ty.onetoone.dto.Pan;
import com.ty.onetoone.dto.Person;

public class TestPanGetAPerson {
public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager = entityManagerFactory.createEntityManager();
	Pan pan=entityManager.find(Pan.class, 1);
	Person person=pan.getPerson();
	System.out.println("Id:"+pan.getId());
	System.out.println("Name of country:"+pan.getCountry());
	System.out.println("Date"+pan.getDate());
	System.out.println("Name is:"+person.getName());
	System.out.println("Phone number:"+person.getPhone());
	System.out.println("Gender :"+person.getGender());
}
}

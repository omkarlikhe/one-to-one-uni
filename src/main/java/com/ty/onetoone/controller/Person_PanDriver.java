package com.ty.onetoone.controller;

import java.time.LocalDateTime;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetoone.dto.Pan;
import com.ty.onetoone.dto.Person;

public class Person_PanDriver {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();

		Person person = new Person();
		person.setName("Omkar");
		person.setGender("male");
		person.setPhone(958584);

		Pan pan = new Pan();
		pan.setDate(LocalDateTime.now());
		pan.setCountry("India");
		pan.setPerson(person);

		entityManager.persist(person);
		entityManager.persist(pan);

	}

}

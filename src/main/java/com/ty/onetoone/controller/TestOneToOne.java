package com.ty.onetoone.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.ty.onetoone.dto.Address;
import com.ty.onetoone.dto.Branch;

public class TestOneToOne {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("dev");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		Branch branch = new Branch();
		branch.setName("QSP");
		branch.setPhone(985845);

		Address address = new Address();
		address.setArea("Basvangudi");
		address.setPin(458545);
		address.setState("KA");
		branch.setAddress(address);
		entityManager.persist(branch);
		entityManager.persist(address);
		entityTransaction.commit();
	}
}

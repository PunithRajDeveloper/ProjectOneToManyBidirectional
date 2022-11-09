package com.tyss.OneToManyBaiDi;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tyss.OneToManyBaiDiDTO.Phone;
import com.tyss.OneToManyBaiDiDTO.Sim;

public class Connecter {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("punith");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Phone phone=new Phone();
		phone.setId(1);
		phone.setBrand("OnePluse");
		phone.setCompany("oppo corporation");
		phone.setPrice(35000);
		phone.setUcode("SDRFFGSF6874267");
		
		
		
		Sim sim1=new Sim();
		sim1.setId(1);
		sim1.setCompany("aritel");
		sim1.setName("punith");
		sim1.setSimid("EGBF0009787");
		
		Sim sim2=new Sim();
		sim2.setId(2);
		sim2.setCompany("vadfone");
		sim2.setName("Abhshek");
		sim2.setSimid("BJJMVG67825");
		
		
		List<Sim>  l1 = new  ArrayList<Sim>();
		l1.add(sim1);
		l1.add(sim2);
		
		phone.setSims(l1);
		
	entityTransaction.begin();

	entityManager.persist(sim1);
	entityManager.persist(sim2);
	entityManager.persist(phone);

	entityTransaction.commit();

		
		
		
		
		
		
	}
}

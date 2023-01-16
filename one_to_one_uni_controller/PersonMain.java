package one_to_one_uni_controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import one_to_one_uni_dto.AdharCard;
import one_to_one_uni_dto.Person;

public class PersonMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		//OBJECT FOR ADHARCARD
		
		AdharCard adharcard=new AdharCard();
		adharcard.setAid(101);
		adharcard.setName("Pavan");
		adharcard.setAddress("Mumbai");
		
		//OJECT FOR PERSON
		
		Person person=new Person();
		person.setId(1);
		person.setName("Dimple");
		person.setPhone(23456789);
		person.setAddress("bengluru");
		person.setAdharcard(adharcard);
		
		entityTransaction.begin();
		entityManager.persist(adharcard);
		entityManager.persist(person);
		entityTransaction.commit();
		
		
		

	}

}

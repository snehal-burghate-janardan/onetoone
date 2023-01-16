package one_to_one_uni.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import one_to_one_uni_dto.AdharCard;
import one_to_one_uni_dto.Person;

public class PersonDao {

	
	public EntityManager getEntityManager() {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vinod");
		return entityManagerFactory.createEntityManager();
	}
	
	public void savePerson(Person person) {
		EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		entityTransaction.begin();
		AdharCard adharcard=person.getAdharcard();
		entityManager.persist(adharcard);
		entityManager.persist(person);
		entityTransaction.commit();
		
	}
	public void updatePerson(int id,String name) {
		EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Person person=entityManager.find(Person.class,id);
		person.setName(name);
		
		entityTransaction.begin();
		entityManager.merge(person);
		entityTransaction.commit();
	}
	public void deletePerson(int id) {
		EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Person person=entityManager.find(Person.class,id);
		if(person!=null) {
			entityTransaction.begin();
			entityManager.remove(person);
			
			entityTransaction.commit();
		}
	}
	public Person getPerson(int id) {
		EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Person person=entityManager.find(Person.class,id);
		return person;
	}
	
	public List<Person> getAllPerson(){ 
		EntityManager entityManager=getEntityManager();
		Query query=entityManager.createQuery("Select p from Person p");
		List<Person>list=query.getResultList();
		return list;
		
		
		
		
		
	
		

		
	}
}

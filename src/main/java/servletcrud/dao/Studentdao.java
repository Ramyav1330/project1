package servletcrud.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;


import servlet.Dto.studentDto;
import sevlet.control.studentfetchbyid;

public class Studentdao {
EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
EntityManager entityManager=entityManagerFactory.createEntityManager();
EntityTransaction entityTransaction= entityManager.getTransaction();

public String create(studentDto d1) {
	entityTransaction.begin();
	entityManager.persist(d1);
	entityTransaction.commit();
	return "inserted successfully";
}

public String delete(int d1) {
	studentDto std=entityManager.find(studentDto.class, d1);
	if(std!=null) {
		entityTransaction.begin();
		entityManager.remove(std);
		entityTransaction.commit();
		return"<h1>data is deleted</h1>";
	}
	else
		return"no data found";
	}
public String  update(int id,long phno) {
	studentDto d1=entityManager.find(studentDto.class, id);
	d1.setPhnno(phno);
	
	entityTransaction.begin();
	entityManager.persist(d1);
	entityTransaction.commit();
	return "Updated successfully";
	
}
public studentDto fetch(int id) {
	studentDto d1=entityManager.find(studentDto.class, id);
	return d1;
}



public List<studentDto> fetchall() {
	Query  q1=entityManager.createQuery("select data from studentDto data");
	List<studentDto> d1=  q1.getResultList();
	return d1;
	
}
public void delete1(int sid)
{
	studentDto s1=entityManager.find(studentDto.class,sid);
	entityTransaction.begin();
	entityManager.remove(s1);
	entityTransaction.commit();
}
public String update1(studentDto s1)
{
	entityTransaction.begin();
	entityManager.merge(s1);
	entityTransaction.commit();
	return "<h1>updated successfully</h1>";
}
}


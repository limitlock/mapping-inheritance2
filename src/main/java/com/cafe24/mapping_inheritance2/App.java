package com.cafe24.mapping_inheritance2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		// 1. Entity Manager Factory 생성
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mapping-inheritance2");

		// 2. Entity Manager 생성
		EntityManager em = emf.createEntityManager();

		// 3.Get TX
		EntityTransaction tx = em.getTransaction();

		// 4. TX Begins
		tx.begin();

		// 5. Business Logic
		try {

		} catch (Exception e) {
			tx.rollback();
			e.printStackTrace();
		}

		// 6. TX Commit
		tx.commit();

		// 7. Entity Manager 종료
		em.clear();

		// 8. Entity Manager Factory 종료
		emf.close();
	}
}

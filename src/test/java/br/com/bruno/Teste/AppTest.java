package br.com.bruno.Teste;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import br.com.bruno.entidade.Usuario;
import junit.framework.TestCase;
 
 
/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
 
	private EntityManager entityManager;
 
	public void testApp() {
 
		entityManager = Persistence.createEntityManagerFactory("FrameworkJava")
				.createEntityManager();
 
		entityManager.getTransaction().begin();
 
		Usuario user = new Usuario();
		user.setLogin("Teste");
		user.setNome("Bruno");
		user.setSenha("123456");
		entityManager.persist(user);
 
		entityManager.getTransaction().commit();
		entityManager.close();
	}
}


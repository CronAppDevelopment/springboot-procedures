package app.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.StoredProcedureQuery;

import org.springframework.stereotype.Repository;

/**
 * Classe que representa ...
 * 
 * @author Robson Ataide
 * @version 1.0
 * @since 2017-02-07
 *
 */
@Repository
public class ProceduresDAOImpl implements ProceduresDAO{

	@PersistenceContext
	private EntityManager entityManager;
	
  @Override
  public java.util.List<Object[]> getAdultPeople() {
    StoredProcedureQuery storedProcedure = entityManager.createStoredProcedureQuery("SP_Selecionar_Pessoas_Adultas");
	  // Call the stored procedure. 
	  List<Object[]> storedProcedureResults = storedProcedure.getResultList();
	  return storedProcedureResults;
  }

}

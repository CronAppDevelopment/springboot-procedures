package app.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import app.dao.PessoaDAO;
import app.dao.ProceduresDAOImpl;
import app.entity.Pessoa;
/**
 * Classe que representa a camada de negócios de PessoaBusiness
 * 
 * @generated
 **/
@Service("PessoaBusiness")
public class PessoaBusiness {


    /**
     * Instância da classe PessoaDAO que faz o acesso ao banco de dados
     * 
     * @generated
     */
    @Autowired
    @Qualifier("PessoaDAO")
    protected PessoaDAO repository;
    
    
    @Autowired
    protected ProceduresDAOImpl spRepository;

    // CRUD

    /**
     * Serviço exposto para novo registro de acordo com a entidade fornecida
     * 
     * @generated
     */
    public Pessoa post(final Pessoa entity) throws Exception {
      // begin-user-code  
      // end-user-code  
        repository.save(entity);
      // begin-user-code  
      // end-user-code  
      return entity;
    }

    /**
     * Serviço exposto para recuperar a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    public Pessoa get(java.lang.String id) throws Exception {
      // begin-user-code  
      // end-user-code        
       Pessoa result = repository.findOne(id);
      // begin-user-code  
      // end-user-code        
      return result;
    }

    /**
     * Serviço exposto para salvar alterações de acordo com a entidade fornecida
     * 
     * @generated
     */
    public Pessoa put(final Pessoa entity) throws Exception {
      // begin-user-code  
      // end-user-code
        repository.saveAndFlush(entity);
      // begin-user-code  
      // end-user-code        
      return entity;
    }

    /**
     * Serviço exposto para remover a entidade de acordo com o id fornecido
     * 
     * @generated
     */
    public void delete( java.lang.String id) throws Exception {
      // begin-user-code  
      // end-user-code        
      repository.delete(id);
      // begin-user-code  
      // end-user-code        
    }

    // CRUD
    
  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  public Page<Pessoa> list ( Pageable pageable ){
    // begin-user-code  
    // end-user-code        
    Page<Pessoa> result = repository.list (  pageable );
    // begin-user-code  
    // end-user-code        
    return result;
  }
    
  
  public List<Object[]> listAdultPeople (){
    List<Object[]> result = spRepository.getAdultPeople();
    return result;
  }


}
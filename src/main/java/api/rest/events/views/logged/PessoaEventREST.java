package api.rest.events.views.logged;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import app.business.PessoaBusiness;

@RestController
@RequestMapping(value = "/api/rest/events/PessoaEventREST")
public class PessoaEventREST {

  @Autowired
  @Qualifier("PessoaBusiness")
  private PessoaBusiness pessoaBusiness;

  @RequestMapping(method = RequestMethod.POST, value = "/mostrarquantidadeadultos")
  public Map<String, Object> MostrarQuantidadeAdultos() throws Exception {
    Map<String, Object> result = new HashMap<>();
    
    List<Object[]> adults = pessoaBusiness.listAdultPeople();
    
    result.put("totalAdults", adults.size());
    return result;
  }
}
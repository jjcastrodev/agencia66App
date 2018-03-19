
package web.afip.dgi.ag66.service;

import java.util.List;
import web.afip.dgi.ag66.model.Agente;

public interface AgenteService {

    public Agente save(Agente agente);

    public List<Agente> findAll();

    public void borrarAgente(Long id);
    
}

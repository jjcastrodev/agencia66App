
package web.afip.dgi.ag66.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import web.afip.dgi.ag66.model.Agente;

public interface AgenteRepository extends JpaRepository<Agente, Long>{
    
     
    
    @SuppressWarnings("uncheked")
    Agente save(Agente agente);
    
    
    
}

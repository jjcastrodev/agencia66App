
package web.afip.dgi.ag66.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.afip.dgi.ag66.dao.AgenteRepository;
import web.afip.dgi.ag66.model.Agente;


@Service
public class AgenteServicesImpl implements AgenteService{
    
    @Autowired
    protected AgenteRepository agenteRepository;

    @Override
    public Agente save(Agente agente) {
        return this.agenteRepository.save(agente);
    }

    @Override
    public List<Agente> findAll() {
        return this.agenteRepository.findAll();
    }

    @Override
    public void borrarAgente(Long id) {
        this.agenteRepository.deleteById(id);
    }
}

package web.afip.dgi.ag66.controllers;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import web.afip.dgi.ag66.model.Agente;
import web.afip.dgi.util.RestResponse;
import web.afip.dgi.ag66.service.AgenteService;
import org.apache.commons.lang3.StringUtils;

@RestController
public class AgenteController {
    
    @Autowired
    protected AgenteService agenteService;
    
    protected ObjectMapper mapper;

    @RequestMapping(value = "/saveOrUpdate", method = RequestMethod.POST)
    public RestResponse saveOrUpdate(@RequestBody String agenteJson) 
           throws JsonParseException, JsonMappingException, IOException {
        this.mapper = new ObjectMapper();
        Agente agente = this.mapper.readValue(agenteJson, Agente.class);
        
        if(!this.validate(agente)) {
            return new RestResponse(HttpStatus.NOT_ACCEPTABLE.value(), "Los datos de nombre son obligatorios" );
        }
        this.agenteService.save(agente);
        
        return new RestResponse(HttpStatus.OK.value(), "Registro agregado OK");
    }

    @RequestMapping(value = "/getAgentes", method = RequestMethod.GET)
    public List<Agente> getAgentes() {
        return this.agenteService.findAll();
    }    
    
    @RequestMapping(value = "/borrarAgente", method = RequestMethod.POST)
    public void borrarAgente(@RequestBody String agenteJson) throws Exception {
        this.mapper = new ObjectMapper();
        Agente agente = this.mapper.readValue(agenteJson, Agente.class);
        
        if(agente.getId() == null) {
            throw new Exception("No se encontro el registro que pretende borrar"); 
        }
        
        this.agenteService.borrarAgente(agente.getId());

        
    }    
    
    private boolean validate(Agente agente) {
        boolean isValid = true;
        
        if(StringUtils.trimToNull(agente.getNombre()) == null) {
            isValid = false;
        }
        return isValid;
    }
}

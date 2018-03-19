
package web.afip.dgi.util;

import java.util.List;


public class QueryResult {
   private int totalRegistros;
   private List<Object> lista;

    public int getTotalRegistros() {
        return totalRegistros;
    }

    public void setTotalRegistros(int totalRegistros) {
        this.totalRegistros = totalRegistros;
    }

    public List<Object> getLista() {
        return lista;
    }

    public void setLista(List<Object> lista) {
        this.lista = lista;
    }
    
}

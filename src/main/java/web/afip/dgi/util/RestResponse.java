package web.afip.dgi.util;

public class RestResponse {
    
    private Integer responseCode;
    private String mensaje;

    public RestResponse(Integer codigo) {
        super();
        this.responseCode = codigo;
    }
    
    public RestResponse(Integer codigo, String mensaje) {
        super();
        this.responseCode = codigo;
        this.mensaje = mensaje;
    }
    
    public int getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(int responseCode) {
        this.responseCode = responseCode;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
}

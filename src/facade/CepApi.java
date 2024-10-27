package facade;

public class CepApi {
    public static CepApi instancia = new CepApi();
    
    private CepApi() {

    }

    public static CepApi getInstancia() {
        return instancia;
    }

    public String recuperarCidade(String cep) {
        return "São Paulo";
    }

    public String recuperarEstado(String cep) {
        return "SP";
    }
}
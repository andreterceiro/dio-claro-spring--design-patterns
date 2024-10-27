package facade;

public class CRMService {
    private CRMService() {
        
    }

    public static void gravarCliente(String nome, String cep, String cidade, String estado) {
        System.out.println("Cliente gravado no sistema");
        System.out.println("nome: " + nome);
        System.out.println("CEP: " + cep);
        System.out.println("cidade: " + cidade);
        System.out.println("Estado: " + estado);
    }
}

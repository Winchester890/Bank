package models;
import java.util.ArrayList;
import java.util.List;
public class Banco {
    private List<Conta> contasList = new ArrayList<>();

    public List<Conta> getContasList() {
        return contasList;
    }

    public void addNovaConta(Conta conta) {
        contasList.add(conta);
    }

    public void transferir(Conta origem, Conta destino) {

    }

}

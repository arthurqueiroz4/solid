package br.com.alura.rh.service.promocao;

import br.com.alura.rh.model.Cargo;
import br.com.alura.rh.model.Funcionario;

public class PromocaoService {
    
    public void promover(Funcionario funcionario, boolean metaBatida) {
        Cargo cargoAtual = funcionario.getDadosPessoais().getCargo();
        if (cargoAtual == Cargo.GERENTE) {
            throw new IllegalArgumentException("Gerentes nao podem ser promovidos!");
        }

        if (metaBatida) {
            Cargo novoCargo = cargoAtual.getProximoCargo();
            funcionario.promover(novoCargo);
        } else {
            throw new IllegalArgumentException("Funcionario nao bateu a meta!");
        }
    }
}

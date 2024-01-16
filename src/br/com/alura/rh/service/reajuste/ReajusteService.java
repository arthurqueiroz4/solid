package br.com.alura.rh.service.reajuste;

import java.math.BigDecimal;
import java.util.List;

import br.com.alura.rh.model.Funcionario;

public class ReajusteService {

	private List<Validacao> validacoes;

    public ReajusteService(List<Validacao> validacoes) {
        this.validacoes = validacoes;
    }

    public void reajustarSalario(Funcionario funcionario, BigDecimal aumento) {
		validacoes.forEach(v -> v.validar(funcionario, aumento));

        BigDecimal salarioReajustado = funcionario.getDadosPessoais().getSalario().add(aumento);
		funcionario.atualizarSalario(salarioReajustado);
	}
}
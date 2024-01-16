package br.com.alura.rh.isp;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Promocao implements ReajusteTributavel {

    private BigDecimal valor;
    private LocalDate data;

    @Override
    public BigDecimal valorImpostoDeRenda() {
        return valor.multiply(new BigDecimal(0.1f));
    }

    @Override
    public LocalDate data() {
        return data;
    }

    @Override
    public BigDecimal valor() {
        return valor;
    }
    
    
}

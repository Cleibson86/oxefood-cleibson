package br.com.ifpe.oxefood.api.cupomDesconto;

import java.time.LocalDate;

import br.com.ifpe.oxefood.modelo.cupomDesconto.cupomDesconto;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CupomDescontoRequest {

    private String codigoDesconto;

    private double percentualDesconto;

    private double valorDesconto;

    private double valorMinimoPedidoPermitido;

    private int quantidadeMaximaUso;

    private LocalDate inicioVigencia;

    private LocalDate fimVigencia;



    public cupomDesconto build() {

        return cupomDesconto.builder()
                .codigoDesconto(codigoDesconto)
                .percentualDesconto(percentualDesconto)
                .valorDesconto(valorDesconto)
                .valorMinimoPedidoPermitido(valorMinimoPedidoPermitido)
                .quantidadeMaximaUso(quantidadeMaximaUso)
                .inicioVigencia(inicioVigencia)
                .fimVigencia(fimVigencia)

                .build();
    }

}

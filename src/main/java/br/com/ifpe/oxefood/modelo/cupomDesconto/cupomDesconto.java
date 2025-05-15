package br.com.ifpe.oxefood.modelo.cupomDesconto;

import java.time.LocalDate;

import org.hibernate.annotations.SQLRestriction;

import br.com.ifpe.oxefood.util.entity.EntidadeAuditavel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "CupomDesconto")
@SQLRestriction("habilitado = true")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class cupomDesconto extends EntidadeAuditavel  {
  
   @Column

   private String codigoDesconto;
   private double percentualDesconto;

    private double valorDesconto;

    private double valorMinimoPedidoPermitido;

    private int quantidadeMaximaUso;

    private LocalDate inicioVigencia;

    private LocalDate fimVigencia;

}

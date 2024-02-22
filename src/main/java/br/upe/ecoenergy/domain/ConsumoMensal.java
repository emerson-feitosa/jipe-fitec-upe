package br.upe.ecoenergy.domain;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "consumo_mensal")
public class ConsumoMensal {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nome;

    private Double kilowattsHoraTotal;

    @ManyToOne
    @JoinColumn(name = "usuario_id", nullable = false)
    private Usuario usuario;
}

package com.setxpro.gerency.core.domain.entities;

import com.setxpro.gerency.core.domain.dtos.obraDto.ObraDTO;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.time.LocalDateTime;
import java.util.UUID;

@Entity(name="obra")
@Table(name="obra")
@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of="id")
public class Obra {
    private static final long SerialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @NotBlank
    private String autorId;

    @NotBlank
    private String nome;

    @NotBlank
    @Max(value = 240, message = "Descrição deve conter no máximo 240 caracteres.")
    private String descricao;

    @NotBlank
    private LocalDateTime dataPublicacao;

    @NotBlank
    private LocalDateTime dataExposicao;



    public Obra(ObraDTO obraDTO) {
        this.autorId = obraDTO.autorId();
        this.nome = obraDTO.nome();
        this.descricao = obraDTO.descricao();
        this.dataPublicacao = obraDTO.dataPublicacao();
        this.dataExposicao = obraDTO.dataExposicao();
    }
}

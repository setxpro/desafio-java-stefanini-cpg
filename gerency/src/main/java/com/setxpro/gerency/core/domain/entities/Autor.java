package com.setxpro.gerency.core.domain.entities;

import com.setxpro.gerency.core.domain.dtos.autorDto.AutorDTO;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity(name="author")
@Table(name="author")
@Getter
@Setter
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of="id")
public class Autor {
    private static final long SerialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @NotBlank
    private String nome;

    @NotBlank
    private String sexo;

    @Email
    @NotBlank
    private String email;

    @NotBlank
    private LocalDateTime dataNascimento;

    @NotBlank
    private String pais;

    private String cpf;

    @ElementCollection
    private List<String> obra;

    public Autor(AutorDTO autorDTO) {
        this.id = autorDTO.id();
        this.nome = autorDTO.nome();
        this.sexo = autorDTO.sexo();
        this.email = autorDTO.email();
        this.dataNascimento = autorDTO.dataNascimento();
        this.pais = autorDTO.pais();
        this.cpf = autorDTO.cpf();
        this.obra = autorDTO.obra();
    }

}

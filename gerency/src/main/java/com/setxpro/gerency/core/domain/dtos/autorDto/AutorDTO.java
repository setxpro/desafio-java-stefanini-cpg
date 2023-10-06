package com.setxpro.gerency.core.domain.dtos.autorDto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

public record AutorDTO(
        UUID id,
        List<String> obra,
        String nome,
        String sexo,
        String email,
        LocalDateTime dataNascimento,
        String pais,
        String cpf) {
}

package com.setxpro.gerency.core.domain.dtos.obraDto;

import java.time.LocalDateTime;

public record ObraDTO(String autorId, String nome, String descricao, LocalDateTime dataPublicacao, LocalDateTime dataExposicao) {
}

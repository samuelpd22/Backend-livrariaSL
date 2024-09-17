package br.com.livrariasl.dto;

import br.com.livrariasl.entity.Genero;

public record LivrosDTO(String titulo, String imagemUrl, Genero genero) {
}

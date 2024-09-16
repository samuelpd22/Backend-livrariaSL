package br.com.livrariasl.dto;

import br.com.livrariasl.entity.Genero;

public record LivrosDTO(String titulo, String imagemUrl, String sinopse,String valor,String linkLivro ,Genero genero) {
}

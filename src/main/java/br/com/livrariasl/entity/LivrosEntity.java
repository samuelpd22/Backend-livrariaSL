package br.com.livrariasl.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table ( name = "tb_livrosSL")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class LivrosEntity {

    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;

    private String imagemUrl;

    @Column(length = 5000)
    private String sinopse;

    private String valor;

    @Column(length = 5000)
    private String linkLivro;

    @Enumerated(EnumType.STRING)
    private Genero genero;

}

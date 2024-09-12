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

    @Enumerated(EnumType.STRING)
    private Genero genero;

}

package br.com.livrariasl.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name = "autor")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"}) // Ignora propriedades indesejadas
public class AutorEntity {

    @Id
    @GeneratedValue ( strategy =  GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String imageAutorUrl;


    @OneToMany(mappedBy = "autor", fetch = FetchType.EAGER)
    //@JsonIgnore // Ignora a lista de livro
    @JsonManagedReference // Gerencia a relação para evitar loop
    private List<LivrosEntity> livros;

}


package br.com.livrariasl.repository;


import br.com.livrariasl.entity.AutorEntity;
import br.com.livrariasl.entity.Genero;
import br.com.livrariasl.entity.LivrosEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AutorRepository extends JpaRepository<AutorEntity, Long> {


    List<AutorEntity> findByNome(String nome);

}

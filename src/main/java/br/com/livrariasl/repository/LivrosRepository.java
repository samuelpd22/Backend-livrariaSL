package br.com.livrariasl.repository;

import br.com.livrariasl.entity.Genero;
import br.com.livrariasl.entity.LivrosEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface LivrosRepository extends JpaRepository<LivrosEntity, Long> {

    List<LivrosEntity> findByGenero(Genero genero);
    List<LivrosEntity> findByAutorId(Long autorId);

}

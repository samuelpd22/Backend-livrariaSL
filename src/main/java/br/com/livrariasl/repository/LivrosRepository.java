package br.com.livrariasl.repository;

import br.com.livrariasl.entity.LivrosEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivrosRepository extends JpaRepository<LivrosEntity, Long> {
}

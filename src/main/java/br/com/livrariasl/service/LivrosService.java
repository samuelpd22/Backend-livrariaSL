package br.com.livrariasl.service;

import br.com.livrariasl.dto.LivrosDTO;
import br.com.livrariasl.entity.LivrosEntity;
import br.com.livrariasl.repository.LivrosRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LivrosService {

    @Autowired
    private LivrosRepository livrosRepository;


    public List<LivrosEntity> getAll(){
        return livrosRepository.findAll();
    }

    public Optional<LivrosEntity> getById(Long id){
        return livrosRepository.findById(id);
    }


    public LivrosEntity registraLivro(LivrosDTO livrosDTO){
        LivrosEntity newLivro = new LivrosEntity();
        BeanUtils.copyProperties(livrosDTO , newLivro);
        return livrosRepository.save(newLivro);
    }

    public String apagarLivro(Long id){
        livrosRepository.deleteById(id);
        return "Livro apagado com sucesso";
    }


    //



}

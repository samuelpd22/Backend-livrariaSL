package br.com.livrariasl.controller;

import br.com.livrariasl.dto.LivrosDTO;
import br.com.livrariasl.entity.Genero;
import br.com.livrariasl.entity.LivrosEntity;
import br.com.livrariasl.repository.LivrosRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")
@RequestMapping("/livros")
@RestController
public class LivrosController {

    @Autowired
    private LivrosRepository livrosRepository;

    @PostMapping("/enviar")
    public ResponseEntity<LivrosEntity> enviarLivro(@RequestBody LivrosDTO livrosDTO){
        LivrosEntity newLivro = new LivrosEntity();
        BeanUtils.copyProperties(livrosDTO, newLivro);
        livrosRepository.save(newLivro);

        return ResponseEntity.ok(newLivro);

    }
    @GetMapping
    public ResponseEntity<List> verLivros(){
        return new ResponseEntity(livrosRepository.findAll(), HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deletarPorId(@PathVariable Long id) {
        livrosRepository.deleteById(id);
        return new ResponseEntity(HttpStatus.OK);
    }


    @GetMapping("/genero/{genero}")
    public List<LivrosEntity> buscarLivrosPorGenero(@PathVariable Genero genero) {
        return livrosRepository.findByGenero(genero);
    }




}

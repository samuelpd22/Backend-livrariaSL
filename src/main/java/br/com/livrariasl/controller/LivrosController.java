package br.com.livrariasl.controller;

import br.com.livrariasl.dto.LivrosDTO;
import br.com.livrariasl.entity.Genero;
import br.com.livrariasl.entity.LivrosEntity;
import br.com.livrariasl.repository.LivrosRepository;
import br.com.livrariasl.service.LivrosService;
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

    @Autowired
    private LivrosService livrosService;




    @PostMapping("/enviar")
    public ResponseEntity<LivrosEntity> enviarLivro(@RequestBody LivrosDTO livrosDTO){
        return ResponseEntity.ok(livrosService.registraLivro(livrosDTO));

    }
    @GetMapping
    public ResponseEntity<List> verLivros(){
        return new ResponseEntity(livrosService.getAll(), HttpStatus.OK);
    }



    @GetMapping("/pegar/{id}")
    public ResponseEntity<LivrosEntity> pegarPorId(@PathVariable Long id) {
        return new ResponseEntity(livrosService.getById(id),HttpStatus.OK);
    }





    // Sem utilizade até o momento
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deletarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(livrosService.apagarLivro(id));
    }


    @GetMapping("/genero/{genero}")
    public List<LivrosEntity> buscarLivrosPorGenero(@PathVariable Genero genero) {
        return livrosRepository.findByGenero(genero);
    }




}

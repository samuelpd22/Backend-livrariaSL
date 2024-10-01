
package br.com.livrariasl.controller;

import br.com.livrariasl.dto.AutorDTO;
import br.com.livrariasl.entity.AutorEntity;
import br.com.livrariasl.entity.Genero;
import br.com.livrariasl.entity.LivrosEntity;
import br.com.livrariasl.repository.AutorRepository;
import br.com.livrariasl.service.LivrosService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin("*")
@RestController
@RequestMapping ("/autor")
public class AutorController {

    @Autowired
    private AutorRepository autorRepository;

    @Autowired
    private LivrosService livrosService;


    @PostMapping("/cadastrar")
    public ResponseEntity<AutorEntity> cadastrarAutor(@RequestBody AutorDTO autorDTO) {
        AutorEntity newAutor = new AutorEntity();
        BeanUtils.copyProperties(autorDTO, newAutor);
        autorRepository.save(newAutor);
        return ResponseEntity.ok(newAutor);
    }

    @GetMapping
    public ResponseEntity<List<AutorEntity>> todos() {
        return ResponseEntity.ok(autorRepository.findAll());
    }

    @GetMapping("/{nome}")
    public List<AutorEntity> buscarLivrosPorNome(@PathVariable String nome) {
        return autorRepository.findByNome(nome);
    }
}

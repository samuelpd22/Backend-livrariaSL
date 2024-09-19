
package br.com.livrariasl.controller;

import br.com.livrariasl.dto.AutorDTO;
import br.com.livrariasl.entity.AutorEntity;
import br.com.livrariasl.repository.AutorRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("/autor")
public class AutorController {

    @Autowired
    private AutorRepository autorRepository;


    @PostMapping ("/cadastrar")
    public ResponseEntity<AutorEntity> cadastrarAutor(@RequestBody AutorDTO autorDTO){
        AutorEntity newAutor = new AutorEntity();
        BeanUtils.copyProperties(autorDTO, newAutor);
        autorRepository.save(newAutor);
        return ResponseEntity.ok(newAutor);
    }

    @GetMapping
    public ResponseEntity<List<AutorEntity>> todos(){
        return ResponseEntity.ok( autorRepository.findAll());
    }
}

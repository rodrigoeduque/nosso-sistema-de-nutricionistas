package br.com.zup.edu.nutricionistas.controller;

import br.com.zup.edu.nutricionistas.model.Nutricionista;
import br.com.zup.edu.nutricionistas.repository.NutricionistaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;

@RestController
@RequestMapping("/nutricionistas")
public class NutricionistaController {

    @Autowired
    NutricionistaRepository repository;

    @PostMapping
    public ResponseEntity<Object> novoNutricionista(@RequestBody @Valid NutricionistaRequest request) {

        Nutricionista novoNutricionista = request.toNutricionista();

        repository.save(novoNutricionista);


        URI uri = UriComponentsBuilder.fromPath("/nutricionistas").build().toUri();
        return ResponseEntity.created(uri).build();
    }
}

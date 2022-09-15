package br.com.tiacademy.flores.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.tiacademy.flores.core.crud.CrudController;
import br.com.tiacademy.flores.domain.Flores;
import br.com.tiacademy.flores.repository.FloresRepository;

@RestController
@RequestMapping(value = "/flores")
public class FloresController extends CrudController<Flores, Long> {

    @Autowired
    public FloresRepository repository;

    @GetMapping(value = "/pesquisarpornome")
        public ResponseEntity<List<Flores>> pesquisarPorNomePopular(@RequestParam("nomepopular") String nomePopular){
            List<Flores> flores = repository.pesquisarPorNomePopularLike(nomePopular.toUpperCase());
            return new ResponseEntity<List<Flores>>(flores, HttpStatus.OK);
    }

}


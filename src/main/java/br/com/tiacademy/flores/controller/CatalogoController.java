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
import br.com.tiacademy.flores.domain.Catalogo;
import br.com.tiacademy.flores.repository.CatalogoRepository;

@RestController
@RequestMapping(value = "/catalogos")
public class CatalogoController extends CrudController<Catalogo, Long>{

    @Autowired
    public CatalogoRepository repository;

    @GetMapping(value = "/pesquisarpormes")
        public ResponseEntity<List<Catalogo>> pesquisarPorCatalogo(@RequestParam("mes") String mes){
            List<Catalogo> catalogo = repository.pesquisarPorCatalogo(mes.toUpperCase());
            return new ResponseEntity<List<Catalogo>>(catalogo, HttpStatus.OK);
    }
    
}
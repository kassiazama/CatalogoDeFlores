package br.com.tiacademy.flores.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.tiacademy.flores.core.crud.CrudService;
import br.com.tiacademy.flores.domain.Flores;
import br.com.tiacademy.flores.repository.FloresRepository;

@Service
public class FloresService extends CrudService<Flores, Long> {

    @Autowired
    public FloresRepository repository;

    @Override
    protected Flores editarEntidade(Flores recuperado, Flores entidade) {
        recuperado.setNomePopular(entidade.getNomePopular());
        recuperado.setNomeCientifico(entidade.getNomeCientifico());
        recuperado.setIluminacao(entidade.getIluminacao());
        recuperado.setRega(entidade.getRega());
        return recuperado;
    }



   
 
}
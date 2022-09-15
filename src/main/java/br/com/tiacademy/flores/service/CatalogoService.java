package br.com.tiacademy.flores.service;

import org.springframework.stereotype.Service;

import br.com.tiacademy.flores.core.crud.CrudService;
import br.com.tiacademy.flores.domain.Catalogo;

@Service
public class CatalogoService extends CrudService<Catalogo, Long> {

    @Override
    protected Catalogo editarEntidade(Catalogo recuperado, Catalogo entidade) {
        recuperado.setDescricao(entidade.getDescricao());
        recuperado.setMes(entidade.getMes());
        recuperado.setDataCatalogo(entidade.getDataCatalogo());
        return recuperado;
    }

}
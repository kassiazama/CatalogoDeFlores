package br.com.tiacademy.flores.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.tiacademy.flores.core.crud.CrudRepository;
import br.com.tiacademy.flores.domain.Catalogo;

@Repository
public interface CatalogoRepository extends CrudRepository<Catalogo, Long>{

    //Native Query
    @Query(value = " select c.ID, c.MES, c.DESCRICAO, c.DATA_CATALOGO from catalogo c where c.MES = :mes", nativeQuery = true)
    List<Catalogo> pesquisarPorCatalogo(@Param("mes") String mes);

    
}
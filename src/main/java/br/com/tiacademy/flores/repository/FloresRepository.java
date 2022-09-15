package br.com.tiacademy.flores.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.tiacademy.flores.core.crud.CrudRepository;
import br.com.tiacademy.flores.domain.Flores;

@Repository
public interface FloresRepository extends CrudRepository<Flores, Long>{

    //HQL
    @Query(value = " select flores from Flores flores where upper(flores.nomePopular) like %:nomePopular% ")
    List<Flores> pesquisarPorNomePopularLike(@Param("nomePopular") String nomePopular);

    
    
}
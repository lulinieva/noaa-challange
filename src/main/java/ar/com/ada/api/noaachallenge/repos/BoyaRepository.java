package ar.com.ada.api.noaachallenge.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import ar.com.ada.api.noaachallenge.entities.Boya;

public interface BoyaRepository extends JpaRepository<Boya, Integer> {

    Boya findByBoyaId(Integer boyaId);
    
}
    


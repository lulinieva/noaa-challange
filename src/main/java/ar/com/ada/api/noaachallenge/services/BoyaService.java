package ar.com.ada.api.noaachallenge.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ar.com.ada.api.noaachallenge.entities.Boya;
import ar.com.ada.api.noaachallenge.repos.BoyaRepository;

@Service
public class BoyaService {

    @Autowired
    BoyaRepository repo;
    
    public boolean crearBoya(Boya boya){
        
        if (existe(boya.getBoyaId()))
            return false;

        grabar(boya);
        return true;
    }

  
    public Boya buscarPorId(Integer id) {
        return repo.findByBoyaId(id);
    }

}

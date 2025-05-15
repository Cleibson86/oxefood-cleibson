package br.com.ifpe.oxefood.modelo.cupomDesconto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;

@Service
public class cupomDescontoService {

    public List<cupomDesconto> listarTodos() {
  
        return repository.findAll();
    }

    public cupomDesconto obterPorID(Long id) {

        return repository.findById(id).get();
    }


    @Autowired
    private cupomDescontoRepository repository;

    @Transactional
    public cupomDesconto save(cupomDesconto cupomDesconto) {

        cupomDesconto.setHabilitado(Boolean.TRUE);
        return repository.save(cupomDesconto);
    }

}

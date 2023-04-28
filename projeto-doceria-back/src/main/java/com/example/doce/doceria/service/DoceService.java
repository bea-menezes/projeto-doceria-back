package com.example.doce.doceria.service;

import com.example.doce.doceria.entity.Doce;
import com.example.doce.doceria.repository.DoceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoceService {
    @Autowired
    private DoceRepository doceRepository;

    public List<Doce> buscarTodos(){
        return doceRepository.findAll();
    }

    public Doce inserir(Doce doce){
        //return doceRepository.save(doce);

        Doce doceBanco = doceRepository.save(doce);
        return doceBanco;
    }

    public Doce alterar(Doce doce){
        Doce doceBanco = doceRepository.save(doce);
        return doceBanco;
    }

    public void excluir(Long id){
        Doce doce = doceRepository.findById(id).get();
        doceRepository.delete(doce);
    }
}

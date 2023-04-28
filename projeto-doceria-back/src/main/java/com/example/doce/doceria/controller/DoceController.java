package com.example.doce.doceria.controller;

import com.example.doce.doceria.entity.Doce;
import com.example.doce.doceria.service.DoceService;
import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/doce")
public class DoceController {
    @Autowired
    private DoceService doceService;
    @GetMapping("/")
    @CrossOrigin("http://localhost:3000")
    public List<Doce> buscarTodos(){
        return doceService.buscarTodos();
    }
    @PostMapping("/")
    @CrossOrigin("http://localhost:3000")
    public Doce inserir(@RequestBody Doce doce){
        return doceService.inserir(doce);
    }

    @PutMapping("/")
    @CrossOrigin("http://localhost:3000")
    public Doce alterar(@RequestBody Doce doce){
        return doceService.alterar(doce);
    }

    @DeleteMapping("/{id}")
    @CrossOrigin("http://localhost:3000")
    public ResponseEntity<Void> excluir(@PathParam("id") Long id){
        doceService.excluir(id);
        return ResponseEntity.ok().build();
    }
}

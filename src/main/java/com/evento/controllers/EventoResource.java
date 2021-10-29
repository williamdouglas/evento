package com.evento.controllers;

import javax.validation.Valid;

import com.evento.models.Evento;
import com.evento.repository.EventoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/evento")
public class EventoResource {
    @Autowired
    private EventoRepository er;

    @GetMapping
    public Iterable<Evento> listaEventos() {
        Iterable<Evento> listaEventos = er.findAll();

        return listaEventos;
    }

    @PostMapping
    public Evento cadastraEvento(@Valid Evento evento) {
        return er.save(evento);
    }

    @DeleteMapping
    public Evento deletaEvento(Evento evento) {
        er.delete(evento);

        return evento;
    }

    @GetMapping("/{id}")
    public Evento getEvento(@PathVariable("id") String id) {
        return er.getById(id);
    }
}

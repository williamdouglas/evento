package com.evento.repository;

import com.evento.models.Evento;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EventoRepository extends JpaRepository<Evento, String> {
}

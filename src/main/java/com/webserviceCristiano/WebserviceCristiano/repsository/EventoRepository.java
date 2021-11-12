package com.webserviceCristiano.WebserviceCristiano.repsository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.webserviceCristiano.WebserviceCristiano.models.Evento;

public interface EventoRepository extends JpaRepository<Evento,String> {

}

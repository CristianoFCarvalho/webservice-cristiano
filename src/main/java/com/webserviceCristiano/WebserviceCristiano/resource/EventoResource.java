package com.webserviceCristiano.WebserviceCristiano.resource;

import com.webserviceCristiano.WebserviceCristiano.models.Evento;
import com.webserviceCristiano.WebserviceCristiano.repsository.EventoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/evento")
public class EventoResource {
	
	@Autowired
	private EventoRepository er;
	
@GetMapping(produces="application/jason")
	public @ResponseBody Iterable<Evento> listaEventos() {
	Iterable<Evento> listaEventos = er.findAll();
		
	return listaEventos;
	
}

	@PostMapping()
	public Evento cadastraEvento(@RequestBody @Valid Evento evento ) {

	return er.save(evento);

}
	@DeleteMapping()
	public Evento deletaEvento(@RequestBody Evento evento ) {
	er.delete(evento);
	return evento;
}
}

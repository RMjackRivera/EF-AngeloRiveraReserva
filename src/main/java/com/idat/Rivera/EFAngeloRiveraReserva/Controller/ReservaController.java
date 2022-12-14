package com.idat.Rivera.EFAngeloRiveraReserva.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import com.idat.Rivera.EFAngeloRiveraReserva.Model.Reserva;
import com.idat.Rivera.EFAngeloRiveraReserva.Service.ReservaService;

@Controller
@RequestMapping("/api/reserva/v1")
public class ReservaController {
	@Autowired
	private ReservaService service;
	
	@PostMapping("/guardar")
	public @ResponseBody void guardar(@RequestBody Reserva reserva) {
		service.guardarReserva(reserva);
		
	}
	@PostMapping("/asignar")
	public @ResponseBody void asignar() {
		service.asignarHospedajeReserva();
	}
	
}

package com.idat.Rivera.EFAngeloRiveraReserva.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class HospedajeReservaFK implements Serializable {

	private static final long serialVersionUID = 6373561034533057980L;
	
	@Column(name = "id_reserva" , nullable = false, unique = true)
	private Integer idReserva;
	
	@Column(name = "id_hospedaje" , nullable = false, unique = true)
	private Integer idHospedaje;
}

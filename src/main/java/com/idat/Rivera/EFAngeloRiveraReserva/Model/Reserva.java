package com.idat.Rivera.EFAngeloRiveraReserva.Model;

import javax.persistence.Entity;
import javax.persistence.Table;

@Table(name = "reserva")
@Entity
public class Reserva {
	
	private Integer idReserva;
	private String  Costo;
	public Integer getIdReserva() {
		return idReserva;
	}
	public void setIdReserva(Integer idReserva) {
		this.idReserva = idReserva;
	}
	public String getCosto() {
		return Costo;
	}
	public void setCosto(String costo) {
		Costo = costo;
	}
	
	

	
}

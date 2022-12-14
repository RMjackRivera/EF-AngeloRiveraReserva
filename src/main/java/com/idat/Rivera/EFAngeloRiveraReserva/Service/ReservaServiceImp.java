package com.idat.Rivera.EFAngeloRiveraReserva.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.idat.Rivera.EFAngeloRiveraReserva.Client.OpenFeingClient;
import com.idat.Rivera.EFAngeloRiveraReserva.Model.HospedajeReservaFK;
import com.idat.Rivera.EFAngeloRiveraReserva.Model.Reserva;
import com.idat.Rivera.EFAngeloRiveraReserva.Model.ReservaDetalle;
import com.idat.Rivera.EFAngeloRiveraReserva.Repository.DetalleReservaRepository;
import com.idat.Rivera.EFAngeloRiveraReserva.Repository.ReservaRepository;
import com.idat.Rivera.EFAngeloRiveraReserva.dto.HospedajeDTO;


public class ReservaServiceImp implements ReservaService {

	@Autowired
	private ReservaRepository reservaRepo;
	@Autowired
	private DetalleReservaRepository detalleRepo;
	
	
	
	@Autowired
	private OpenFeingClient client;

	
	
	
	@Override
	public void guardarReserva(Reserva reserva) {
		reservaRepo.save(reserva);

	}

	@Override
	public void asignarHospedajeReserva() {
		 List<HospedajeDTO> listado = client.listarHospedajes();
	        
		    HospedajeReservaFK fk = null;
	        ReservaDetalle detalle = null;
	        
		 
			
		    }

	}

	



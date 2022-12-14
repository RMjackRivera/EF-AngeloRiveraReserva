package com.idat.Rivera.EFAngeloRiveraReserva.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.idat.Rivera.EFAngeloRiveraReserva.Model.ReservaDetalle;

@Repository
public interface DetalleReservaRepository extends JpaRepository<ReservaDetalle,Integer >{
	

}

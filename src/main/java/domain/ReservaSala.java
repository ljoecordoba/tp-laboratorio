package domain;

import java.time.LocalTime;

public class ReservaSala
{
	Sala sala;
	LocalTime tiempoInicio;
	LocalTime tiempoFinal;
	Profesor profesor;
	Prioridad prioridad;
	public ReservaSala(Sala sala, LocalTime tiempoInicio, LocalTime tiempoFinal, Profesor profesor,
			Prioridad prioridad) {
		super();
		this.sala = sala;
		this.tiempoInicio = tiempoInicio;
		this.tiempoFinal = tiempoFinal;
		this.profesor = profesor;
		this.prioridad = prioridad;
	}
	
}

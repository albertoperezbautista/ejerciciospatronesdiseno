package com.patrones.software.creaciones.factorymethod;

/*
 * DEFINE UNA INTERFAZ PARA LA CREACION DE UN OBJETO,
 * PERO DEJA QUE LA SUBCLASE, 
 * ES DECIR LA CLASE QUE IMPLEMENTA LA INTERFAZ,
 * DECIDA QUE CLASE INSTANCIAR.s
 */


public class PasteleriaAP implements IPasteleria{

	@Override
	public Pastel prepararPastel(String tipoSabor) {
		
		if(tipoSabor.equals("Chocolate")) {
			return new Pastel(12, "Chocolate");
		}
		if(tipoSabor.equals("Vainilla")) {
			return new Pastel(8, "Vainilla");
		}
		if(tipoSabor.equals("Rellena")) {
			return new PastelRelleno(8, "Rellena");
		}
		return null;
			
	}
	
	
	
}

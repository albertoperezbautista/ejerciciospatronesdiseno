package com.patrones.software.creacionales.factorymethod;

public class Pastel {

	
	private int cantidadRebanadas;
	private String sabor;

	public Pastel(int cantidadRebanadas, String sabor) {

		this.cantidadRebanadas = cantidadRebanadas;
		this.sabor = sabor;
	}

	@Override
	public String toString() {
		return "Cantidad de rebanadas= " + cantidadRebanadas + ", sabor= " + sabor;
	}

}

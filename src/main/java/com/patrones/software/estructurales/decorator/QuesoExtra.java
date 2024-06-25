package com.patrones.software.estructurales.decorator;

public class QuesoExtra implements IPizza {

	private IPizza pizza; //COMPOSICION

	public QuesoExtra(IPizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String descripcion() {
		return this.pizza.descripcion() + " QUESO EXTRA";
	}

	@Override
	public double precio() {
		return this.pizza.precio() + 2;
	}

}

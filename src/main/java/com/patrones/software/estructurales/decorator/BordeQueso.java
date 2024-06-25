package com.patrones.software.estructurales.decorator;

public class BordeQueso implements IPizza {

	private IPizza pizza; //COMPOSICION

	public BordeQueso(IPizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public String descripcion() {
		return this.pizza.descripcion() + " BORDE QUESO";
	}

	@Override
	public double precio() {
		return this.pizza.precio() + 4;
	}

}

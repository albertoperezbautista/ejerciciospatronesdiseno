package com.patrones.software.estructurales.decorator;

public class PizzaPepperoni implements IPizza {

	public String descripcion() {
		return "Pizza pepperoni";
	}

	public double precio() {
		return 8;
	}

}

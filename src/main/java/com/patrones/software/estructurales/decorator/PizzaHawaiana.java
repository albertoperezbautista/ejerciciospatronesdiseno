package com.patrones.software.estructurales.decorator;

public class PizzaHawaiana implements IPizza{
	
	public String descripcion() {
		return "Pizza hawaiana";
	}

	public double precio() {
		return 6;
	}

}

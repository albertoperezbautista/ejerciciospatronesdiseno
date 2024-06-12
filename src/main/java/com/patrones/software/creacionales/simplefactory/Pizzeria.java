package com.patrones.software.creacionales.simplefactory;

public class Pizzeria {

	public Pizza crearPizzaPequena() {
		//llamar api
		// guardar db
		//etc
		return new Pizza(6); // asumimos que son para pequenas 6 rebanadas

	}

	public Pizza crearPizzaMediana() {
		return new Pizza(8);

	}

	public Pizza crearPizzaGrande() {
		return new Pizza(12);

	}
}

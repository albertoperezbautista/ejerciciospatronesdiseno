package com.patrones.software.estructurales.decorator;

import org.junit.Test;

public class DecoratorTest {

	@Test
	public void test1() {

		IPizza pizzaHawaiana = new QuesoExtra(new PizzaHawaiana());
		IPizza pizzaPepperoni = new QuesoExtra(new PizzaPepperoni());
		

//		System.out.println(pizzaHawaiana.descripcion());
//		System.out.println(pizzaHawaiana.precio());
//
//		System.out.println(pizzaPepperoni.descripcion());
//		System.out.println(pizzaPepperoni.precio());

		// IMPLEMENTAR FUNCIONALIDAD PARA QUE CUALQUIER PIZZA PUEDA
		// AGREGAR QUESO EXTRA Y SU VALOR SEA 2$

		// IMPLEMENTAR FUNCIONALIDAD PARA AGREGAR BORDE DE QUESO
		// POR 4$

		IPizza pizzaHawaiana2 = new BordeQueso(new PizzaHawaiana());
		IPizza pizzaPepperoni2 = new BordeQueso(new PizzaPepperoni());

//		System.out.println(pizzaHawaiana2.descripcion());
//		System.out.println(pizzaHawaiana2.precio());
//
//		System.out.println(pizzaPepperoni2.descripcion());
//		System.out.println(pizzaPepperoni2.precio());

	}
	
	
	

	@Test
	public void test2() {
	
//		
	IPizza pizzaPepperoni = new QuesoExtra(new BordeQueso(new PizzaPepperoni()));
	
	
	System.out.println(pizzaPepperoni.descripcion());
	System.out.println(pizzaPepperoni.precio());
	
	
}

}

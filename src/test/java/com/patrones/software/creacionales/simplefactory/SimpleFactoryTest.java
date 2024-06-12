package com.patrones.software.creacionales.simplefactory;

import org.junit.Test;

import com.patrones.software.creacionales.simplefactory.Pizza;
import com.patrones.software.creacionales.simplefactory.Pizzeria;

public class SimpleFactoryTest {

//	   @Test
//	    public void test1()
//	    {
//	        Pizza pizza = new Pizza(8);
//	        System.out.println(pizza);
//	    }

	@Test
	public void test2() {
		Pizzeria pizzeria = new Pizzeria();
		Pizza pizzaHawaiana = pizzeria.crearPizzaGrande();
		System.out.println(pizzaHawaiana);

	}

}

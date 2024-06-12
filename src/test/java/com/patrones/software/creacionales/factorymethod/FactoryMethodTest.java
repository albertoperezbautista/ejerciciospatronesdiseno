package com.patrones.software.creacionales.factorymethod;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.patrones.software.creacionales.factorymethod.Pastel;
import com.patrones.software.creacionales.factorymethod.PasteleriaAP;
import com.patrones.software.creacionales.simplefactory.Pizza;
import com.patrones.software.creacionales.simplefactory.Pizzeria;

public class FactoryMethodTest {

	@Test
	public void test1() {

		PasteleriaAP pasteleriaAP = new PasteleriaAP();
		
		Pastel pastelChocolate = pasteleriaAP.prepararPastel("Chocolate");
		System.out.println(pastelChocolate);
		Pastel pastelVainilla = pasteleriaAP.prepararPastel("Vainilla");
		System.out.println(pastelVainilla);
	
		PasteleriaAP pasteleria2= new PasteleriaAP();
		Pastel pastelRelleno = pasteleria2.prepararPastel("Rellena");
		System.out.println(pastelRelleno);

	}

}

package com.patrones.software.estructurales.composite;

import org.junit.Test;

public class CompositeTest {

	@Test
	public void test1() {
		Menu menu = new Menu();

		Menu menu1 = new Menu();
		Menu menu2 = new Menu();
		
		menu.agregarMenu(menu1);
		menu.agregarMenu(menu2);
		
		
		
		Menu menu3 = new Menu();
		
		Menu menu4 = new Menu();
		Menu menu5 = new Menu();
		
		menu3.agregarMenu(menu4);
		menu3.agregarMenu(menu5);
		
		
		menu.abrir();
		menu.cerrar();
		
		menu.toString();
		menu1.abrir();
		menu1.cerrar();
		menu1.toString();
	}

}

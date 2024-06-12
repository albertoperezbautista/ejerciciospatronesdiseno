package com.patrones.software.creacionales.abstractfactory;

import org.junit.Test;

import com.patrones.software.creacionales.abstractfactory.AppleStoreFactory;
import com.patrones.software.creacionales.abstractfactory.DellStoreFactory;
import com.patrones.software.creacionales.abstractfactory.IComputadora;
import com.patrones.software.creacionales.abstractfactory.ITablet;

public class AbstractFactoryTest {

	@Test
	public void test1() {

		AppleStoreFactory appleStoreFactory = new AppleStoreFactory();
		DellStoreFactory dellStoreFactory = new DellStoreFactory();

		IComputadora macbook = appleStoreFactory.crearComputadora();
		ITablet ipad = appleStoreFactory.crearTablet();
		IComputadora dellxp = dellStoreFactory.crearComputadora();
		ITablet venue = dellStoreFactory.crearTablet();

	}

}

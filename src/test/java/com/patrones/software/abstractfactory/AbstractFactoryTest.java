package com.patrones.software.abstractfactory;

import org.junit.Test;

import com.patrones.software.creaciones.abstractfactory.AppleStoreFactory;
import com.patrones.software.creaciones.abstractfactory.DellStoreFactory;
import com.patrones.software.creaciones.abstractfactory.IComputadora;
import com.patrones.software.creaciones.abstractfactory.ITablet;

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

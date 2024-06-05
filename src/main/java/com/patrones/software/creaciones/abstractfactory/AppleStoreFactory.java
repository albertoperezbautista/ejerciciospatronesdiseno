package com.patrones.software.creaciones.abstractfactory;

public class AppleStoreFactory implements IAbstractFactory{

	@Override
	public IComputadora crearComputadora() {
		
		return new MacBookPro();
	}

	@Override
	public ITablet crearTablet() {
		
		return new IPad();
	}

}

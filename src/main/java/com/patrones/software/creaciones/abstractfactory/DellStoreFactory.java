package com.patrones.software.creaciones.abstractfactory;

public class DellStoreFactory implements IAbstractFactory{

	@Override
	public IComputadora crearComputadora() {
		
		return new DellXP();
	}

	@Override
	public ITablet crearTablet() {
		
		return new DellVenue();
	}

}

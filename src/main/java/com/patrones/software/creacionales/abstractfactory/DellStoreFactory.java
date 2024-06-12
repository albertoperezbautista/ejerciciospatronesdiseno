package com.patrones.software.creacionales.abstractfactory;

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

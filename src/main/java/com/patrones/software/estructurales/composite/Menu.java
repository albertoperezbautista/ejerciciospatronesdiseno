package com.patrones.software.estructurales.composite;

import java.util.ArrayList;
import java.util.List;

public class Menu implements IMenu {

	// reglas PMD
	private List<IMenu> menuList;

	public Menu() {
		this.menuList = new ArrayList<IMenu>();
	}

	@Override
	public boolean abrir() {
		System.out.println("Abierto!!!");
		return true;
	}

	@Override
	public boolean cerrar() {
		System.out.println("Cerrado!!!");
		return true;
	}

	public void agregarMenu(IMenu menu) {
		this.menuList.add(menu);
	}

	public IMenu obtenerMenu(int index) {
		return this.menuList.get(index);
	}

	@Override
	public String toString() {
		System.out.println("Menu [menuList=" + menuList + "]");
		return "Menu [menuList=" + menuList + "]";
	}

}

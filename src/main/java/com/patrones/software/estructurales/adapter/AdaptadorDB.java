package com.patrones.software.estructurales.adapter;

/*
 * Este adaptador implementara una interfaz y en este caso 
 * el adaptador servira como puente
 * entre el cliente y la la interfaz de conexion NOSQL
 * 
 */

public class AdaptadorDB implements IConexionBD{
	
	//paso 1.- DEFINIR SU COMPORTAMIENTO
	private IConexionNoSQL noSQL;
	// entonces: ENLAZANDO LAS DOS INTERFACES
	

	//ASIGNAMOS UN VALOR AL ATRIBUTO MEDIANTE EL CONSTRUCTOR
	public AdaptadorDB(IConexionNoSQL noSQL) {
		this.noSQL = noSQL; // YA CON UN VALOR PODEMOS MODIFICAR EL COMPORTAMIENTO 
		
	}

	
	
	@Override
	public void conexion() {
	
		this.noSQL.conexion();
		
	}

	
	@Override
	public String ejecutarConsulta() {
		
		return this.noSQL.ejecutarConsultaNosql();
	}

}

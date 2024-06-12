package com.patrones.software.estructurales.adapter;

public class ConexionMySQL implements IConexionBD{

	@Override
	public void conexion() {
		System.out.println("Conexion a MYSQL");
		
	}

	@Override
	public String ejecutarConsulta() {
		return "Resultado consulta";
		
	}

}

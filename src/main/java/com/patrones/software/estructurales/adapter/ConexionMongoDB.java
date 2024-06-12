package com.patrones.software.estructurales.adapter;

public class ConexionMongoDB implements IConexionNoSQL {

	@Override
	public void conexion() {

		System.out.println("Conexion Mongo DB");

	}

	@Override
	public String ejecutarConsultaNosql() {

		return "Consulta NOSQL Mongo DB";
	}

}

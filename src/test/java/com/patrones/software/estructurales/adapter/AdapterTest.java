package com.patrones.software.estructurales.adapter;

import org.junit.Test;

public class AdapterTest {

	@Test
	public void test1() {

		//pregunta de examen
		IConexionBD conexion = new AdaptadorDB(new ConexionMongoDB()); 
//				new ConexionMySQL();

		conexion.conexion();

		String resultado = conexion.ejecutarConsulta();
		System.out.println(resultado);
	}

}

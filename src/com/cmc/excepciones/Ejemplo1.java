package com.cmc.excepciones;

public class Ejemplo1 {

	public static void main(String[] args) {
		System.out.println("Inicio");
		try{
		System.out.println("Abre conexion");
		String a= null;
		a.substring(1,3);
		System.out.println("Cierra conexion BDD");
		}catch(Exception e){
			System.out.println("Entra al catch");
		}finally{
			System.out.println("Entra al finally");
		}
		System.out.println("Fin");
	}

}

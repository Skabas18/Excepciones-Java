package com.cmc.excepciones;

public class TestDeposito {

	public static void main(String[] args) {
		Cuenta c = new Cuenta();
		
		try{
		c.depositar(-100);
		}catch(CheckedException e){
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		System.out.println("fin");
	}

}

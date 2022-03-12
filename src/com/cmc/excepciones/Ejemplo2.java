package com.cmc.excepciones;

import java.io.File;

//Checked
//Unchecked
public class Ejemplo2 {

	public static void main(String[] args) {
		File file = new File("archivo.txt");
		file.createNewFile();
	}

}

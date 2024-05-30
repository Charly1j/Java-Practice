package com.Manipulador;

public class StringManipulator {
	
	public String trimAndConcat(String cadena1, String cadena2){
		String cadenaConcatenada = cadena1.trim() + cadena2.trim();
		return cadenaConcatenada;
	}
	public int getIndexOrNull(String palabra, char letra) {
		int indice = palabra.indexOf(letra);
		return indice;
	}
	int getIndexOrNull(String cdena1, String indice1) {
		int indice = cdena1.indexOf(indice1);
		return indice;
	}
	public String concatSubstring(String caden1, int indiceIn, int indiceEnd, String caden2) {
		String subCadena = caden1.substring(indiceIn,indiceEnd)+caden2;
		return subCadena;
	}
	


}

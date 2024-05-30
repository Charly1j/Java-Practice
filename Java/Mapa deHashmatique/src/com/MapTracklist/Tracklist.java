package com.MapTracklist;

import java.util.HashMap;
import java.util.Map;

public class Tracklist {
    public static void main(String[] args) {
	

    	Map<String, String> trackList = new HashMap<>();

    	// CANCIONES DEL TRACKLIST
    	trackList.put("Cancion1", "Letra de la Cancion1...");
    	trackList.put("Cancion2", "Letra de la Cancion2...");
    	trackList.put("Cancion3", "Letra de la Cancion3...");
    	trackList.put("Cancion4", "Letra de la Cancion4...");
		        
    	// EXTRAER CANCION POR TITULO
    	String nombreDeCancion = "Cancion2";
    	String letraDeCancion = trackList.get(nombreDeCancion);
    	System.out.println("Letra de la canción '" + nombreDeCancion + "':\n" + letraDeCancion);


    	// IMPRIMIR LOS NOMBRES POR PISTAS Y LETRAS
    	System.out.println("=== TrackList ===");

    	for (Map.Entry<String, String> entry : trackList.entrySet()) {
    		String nombre = entry.getKey();
    		String letra = entry.getValue();
    		System.out.println(nombre + ": " + letra);
    		
    		
    	}				
    }

}

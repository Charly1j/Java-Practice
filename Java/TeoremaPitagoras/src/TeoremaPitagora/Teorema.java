package TeoremaPitagora;
import java.lang.Math;
public class Teorema {
	
	public double calcularHipotenusa(double catetoA, double catetoB) {
			
		double resultado =0.0; 
		resultado = Math.sqrt((catetoA*catetoA)+(catetoB*catetoB));
		return resultado;
	}
}

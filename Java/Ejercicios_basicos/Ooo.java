import java.util.ArrayList;

public class Ooo {
    public static void main(String[] args) {
        //tarea 1: imprimir 1 al 255.
        System.out.println("1._--------------------------------------------");
        int i=0;
        while (i<256){
            System.out.println(i);
            i=i+1;
        }
        //tarea 2: imprimir los numeros impares entre el 1 y 255.
        System.out.println("2._--------------------------------------------");
        for(int ii=1;ii<256;ii++){
            if(ii%2!=0){
                System.out.println(ii);
            }
        }
        //tarea 3: recorrer el arreglo [1,3,5,7,9,13].
        System.out.println("3._--------------------------------------------");
        int[] array = {1,3,5,7,9,13};
        for (int iii: array){
            System.out.println(iii);
        }
        //tarea 4: Escribir un método que tome un arreglo e imprima el valor máximo en el arreglo [1,3,5,7,9,13].
        System.out.println("4._--------------------------------------------");
        int[] arreglo = new int[6];
        arreglo[0]=1;
        arreglo[1]=3;
        arreglo[2]=-5;
        arreglo[3]=7;
        arreglo[4]=-9;
        arreglo[5]=-13;
        int b=arreglo[0];
        for(int a=1;a<arreglo.length;a++){
            if(arreglo[a]>b){
                b=arreglo[a];
            }
        }
        System.out.println("El valor mas grande de la lista es: "+b);
        //tarea 5: Escribir un método que tome un arreglo e imprima el promedio de los valores en el arreglo [2,10,3].
        System.out.println("5._--------------------------------------------");
        int[] lista=new int [3];
        lista[0]=2;
        lista[1]=10;
        lista[2]=3;
        int bb=0;
        for(int aa=0;aa<lista.length;aa++){
            bb=bb+lista[aa];
        }
        bb= bb/lista.length;
        System.out.println("El promedio de la lista es: "+ bb);
        //tarea 6: Escribir un método que cree un arreglo ‘y’ que contenga todos los números impares entre 1 - 255
        System.out.println("6._--------------------------------------------");
        ArrayList<Integer> myArrayList = new ArrayList<Integer>();
        for (int aaa=0;aaa<256;aaa++){
            if (aaa%2!=0) {
                myArrayList.add(aaa);
            }
        }
        System.out.println(myArrayList);
        //tarea 7: Escribir un método que tome un arreglo y devuelva el número de valores mayores a un valor Y dado. Por ejemplo, si el arreglo es [1,3,5,7] y Y = 3, después de terminar el proceso el método debe Imprimir el número 2 (ya que hay 2 valores en el arreglo que son mayores que 3).
        System.out.println("7._--------------------------------------------");
        int[] list1 = {1,3,5,-12,6,7,9,35,-1,-21,-23324};
        int y = 3;
        int b1=0;
        for(int i1=0;i1<list1.length;i1++){
            if(list1[i1]>y) {
                b1=b1+1;
            }
        }
        System.out.println("los numeros mayores a 3 son: "+b1);
        //tarea 8: Dado cualquier arreglo x, digamos [1,5,10,-2], escribir un método que multiplique cada valor en el arreglo por sí mismo. Cuando el método haya terminado, el arreglo x debe contener valores que han sido elevados al cuadrado, digamos [1,25,100,4].
        System.out.println("8._--------------------------------------------");
        ArrayList<Integer> array1 = new ArrayList<Integer>();
        array1.add(3);
        array1.add(5);
        array1.add(10);
        array1.add(-2);///////////////////pedir ayuda en agregar un elemento en ArrayList.
        for(int i2=0;i2<array1.size();i2++){
            int b2=array1.get(i2)*array1.get(i2);
            array1.add(b2);
            array1.remove(0);
        }
        System.out.println(array1);
        //tarea 9:Dado un arreglo x, digamos [1,5,10,-2], escribir un método que reemplace cualquier número negativo por 0. Cuando el método haya terminado, x no debe tener valores negativos, digamos como [1,5,10,0].
        System.out.println("9._--------------------------------------------");
        int[] numero={1,5,10,-2};
        for(int r=0;r<numero.length;r++){
            if(numero[r]<0){
                numero[r]=0;//como hacer para el valor mostrado en pantalla sea [1,5,10,-2] y no como prntln.
            }
        }
        for(int rr = 0 ; rr<numero.length;rr++){
            System.out.println(numero[rr]);
        }
        //tarea 10:Dado un arreglo x, digamos [1,5,10,-2], escribir un método que devuelva un arreglo con el número máximo, el número mínimo y el valor promedio que hay en el arreglo x. El arreglo devuelto debe contener solo 3 valores [Max, Min, Prom].
        System.out.println("10._--------------------------------------------");
        ArrayList<Integer> value = new ArrayList<Integer>();
            value.add(11);
            value.add(55);
            value.add(100);
            value.add(-22);
        int minimo=value.get(0);
        int maximo=value.get(0);
        int promedio=0;
        for(int x=1;x<value.size();x++){
            if(value.get(x)<minimo){
                minimo=value.get(x);
            }if(value.get(x)>maximo){
                maximo=value.get(x);
            }
            promedio=promedio+value.get(x);
        }
        promedio=promedio/value.size();
        value.clear();
        value.add(minimo);
        value.add(maximo);
        value.add(promedio);
        System.out.println(value);
    }
}

import java.util.ArrayList;
import java.util.Collections;
public interface Rompecabezas {
    public static void main(String[] args){
        //1._Crear un arreglo con los siguientes valores: 3,5,1,2,7,9,8,13,25,32. Imprimir la suma de todos los números en el arreglo. El método también debe retornar un arreglo que incluya solo los números que son mayores a 10 (Por ejemplo cuando envía el arreglo anterior, debe retornar un arreglo con los valores de 13,25,32).
        ArrayList<Integer> list= new ArrayList<Integer>();
        ArrayList<Integer> newList= new ArrayList<Integer>();
        list.add(3);
        list.add(5);
        list.add(1);
        list.add(2);
        list.add(7);
        list.add(9);
        list.add(8);
        list.add(13);
        list.add(25);
        list.add(32);
        int suma = 0;
        for(int i=0;i<list.size();i++){
            suma=suma+list.get(i);
            if(list.get(i)>10){
                newList.add(list.get(i));
            }
        }
        System.out.println(suma);
        System.out.println(newList);
        //2._Crear un arreglo con los siguientes valores: Nancy, Jinichi, Fujibayashi, Momochi, Ishikawa. Mezcle el arreglo e imprima el nombre de cada persona. Haga que el método también devuelva un arreglo con los nombres que tienes más de 5 caracteres.
        ArrayList<String> array=new ArrayList<String>();
        ArrayList<String> newArray=new ArrayList<String>();
        array.add("Nancy");
        array.add("Jinichi");
        array.add("Fujibayashi");
        array.add("Momochi");
        array.add("Ishikawa");

        Collections.shuffle(array);
        System.out.println(array);
        for(int i=0;i<array.size();i++){
            if(array.get(i).length() > 5){
                newArray.add(array.get(i));
            }
        }
        System.out.println(newArray);
        
    }
}

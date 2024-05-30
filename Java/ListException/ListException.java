import java.util.ArrayList;

public class ListException{
    public static void main(String[]args){
        ArrayList<Object>myList = new ArrayList<Object>();
        myList.add("13");
        myList.add("Hola Mundo");
        myList.add(48);
        myList.add("Adios Mundo");
        for(int i=0;i<myList.size();i++){
            try{
            int castedValue=(int) myList.get(i);
                System.out.println("casting exitoso: "+castedValue);
            }catch(ClassCastException e){
                System.out.println("error de casting: "+myList.get(i)+" no es un int.");
            }
        }





    }
}

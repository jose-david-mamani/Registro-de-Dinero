import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner lecTecla = new Scanner(System.in);
        String txt1 = "ingrese el nombre del producto:";
        String txt2 = "inidique su precio:";


        System.out.println("por donde quiere empezar a registrar, desde la cantidad de productos o la cantidad de dinero");
        String decide = lecTecla.next();


        if (decide.equals("productos")) {

            System.out.println("Muy bien la lista se creara apartir de la cantidad que le asigne");
            System.out.println("Igrese la cantidad:");
            int decideNum = lecTecla.nextInt();
            int i = 0 ;

            while (i > decideNum);
            System.out.println(txt1);
            decide= lecTecla.next();
            List<String> listaDeProductos = new ArrayList<>(decideNum*2);
            listaDeProductos.add(decide);
            System.out.println(txt2);
            decide = lecTecla.next();
            listaDeProductos.add(decide);

            System.out.println(listaDeProductos.get(1));

             // logica de agregado de datos a la lsta , y luego cuando quiera terminar o finalizar que se se muestre o que agrego ala lista
             //para verificar si le falta algun dato para agregar a la lista

        } else if (decide.equals("dinero")) {

            System.out.println("Cuánto dinero posee para gastar?        (ingrese numeros) ");
            int dineroDispone = lecTecla.nextInt();
            if (dineroDispone > 0) {
                System.out.println("su dinero es " + dineroDispone);
                String[] listaDeProductos = new String[6];

            } else {
                System.out.println("ingrese un numero positivo || ingrese un dato valido");

            }
        }



    }
}

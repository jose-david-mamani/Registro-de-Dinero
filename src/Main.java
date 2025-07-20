import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner lecTecla = new Scanner(System.in);


        System.out.println("por donde quiere empezar a registrar, desde la cantidad de productos o la cantidad de dinero");
        String decide = lecTecla.next();


        if (decide.equals("productos")) {

            System.out.println("Muy bien la lista se creara apartir de la cantidad que le asigne");
            System.out.println("Igrese la cantidad:");
            int decideNum = lecTecla.next();
            String[] listaDeProductos = new String[decideNum];

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


        System.out.println("ingrese lo que desea agregar a la lista ");

    }
}

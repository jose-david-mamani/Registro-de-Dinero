import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner lecTecla = new Scanner(System.in);
        System.out.println("Cuánto dinero posee?        (ingrese numeros) ");

        int dineroDispone = lecTecla.nextInt();

        System.out.println("ingrese lo que desea agregar a la lista ");

        String[] listaDeProductos = new String[6];
        do {
            System.out.println(" Ingrese el nombre del producto?");
        }
        while (dineroDispone > 0);
            String nombreProducto = lecTecla.next();



        System.out.println("dinero insuficiente ");

    }
}
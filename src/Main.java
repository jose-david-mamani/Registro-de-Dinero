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
//  aqui empieza la primera parte que es de productos y eso hace una lista para agregar los datos yu luego mostrarlo en la pantalla
        // asi suceciva menta sucede con dinero

        if (decide.equals("productos")) {

            System.out.println("Muy bien la lista se creara apartir de la cantidad que le asigne");
            System.out.println("Igrese la cantidad:");
            int decideNum = lecTecla.nextInt();


            for (int j = 0; j < decideNum; j++) {
                System.out.println(txt1);
                decide = lecTecla.next();
                List<String> listaDeProductos = new ArrayList<>(decideNum * 2);
                listaDeProductos.add(decide);
                System.out.println(txt2);
                decide = lecTecla.next();
                listaDeProductos.add(decide);

            for (String lol : listaDeProductos ) {
                System.out.println("Nombre: " + lol);
            }}

             // logica de agregado de datos a la lsta , y luego cuando quiera terminar o finalizar que se se muestre o que agrego ala lista
             //para verificar si le falta algun dato para agregar a la lista

        } else if (decide.equals("dinero")) {

//  aqui empieza la primera parte que es de productos y eso hace una lista para agregar los datos yu luego mostrarlo en la pantalla
            // asi suceciva menta sucede con dinero


            System.out.println("Muy bien la lista se creara apartir de la cantidad que le asigne");
                System.out.println("Igrese la cantidad:");
                int decideNum = lecTecla.nextInt();


                for (int j = 0; j < decideNum; j++) {
                    System.out.println(txt1);
                    decide = lecTecla.next();
                    List<String> listaDeProductos = new ArrayList<>(decideNum * 2);
                    listaDeProductos.add(decide);
                    System.out.println(txt2);
                    decide = lecTecla.next();
                    listaDeProductos.add(decide);

                    for (String lol : listaDeProductos ) {
                        System.out.println("Nombre: " + lol);
                    }}

            } else {
                System.out.println("ingrese un numero positivo || ingrese un dato valido");

            }
        }



    }


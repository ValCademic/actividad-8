//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Perro p1 = new Perro();
        String nomPerro1, comida1;
        double gramos1;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Nombre del Perro 1: ");
        p1.setNombre(teclado.next());
        nomPerro1=p1.getNombre();

        System.out.println("Raza del Perro 1: ");
        p1.setRaza(teclado.next());

        System.out.println("Edad del Perro 1: ");
        p1.setEdad(teclado.nextInt());
        System.out.println("Comida del Perro 1: ");
        comida1=(teclado.next());
        System.out.println("Gramos de Comida del Perro 1: ");
        gramos1=(teclado.nextDouble());
        p1.comer(comida1, gramos1);


        Perro p2 = new Perro();
        System.out.println("Nombre del Perro 2: ");
        p2.setNombre(teclado.next());
        String nomPerro2, comida2;
        double gramos2;
        nomPerro2=p2.getNombre();

        System.out.println("Raza del Perro 2: ");
        p2.setRaza(teclado.next());

        System.out.println("Edad del Perro 2: ");
        p2.setEdad(teclado.nextInt());

        System.out.println("Comida del Perro 2: ");
        comida2=(teclado.next());
        System.out.println("Gramos de Comida del Perro 2: ");
        gramos2=(teclado.nextDouble());

        p1.comer(comida1, gramos1);
        System.out.println(p1.ladrar());

        p2.comer(comida2, gramos2);
        System.out.println(p2.ladrar());
    }
}

import java.lang.*;

public class Main {


    public static void main(String[] args) {
        Jefe jefe = new Jefe("Diomedes", 20, 10000);
        jefe.añadirEmpleados("Diomedess", 28, 8000);
        jefe.añadirEmpleados("Diomedess", 28, 8000);
        jefe.listaDeEmpleados.get(0).añadirEmpleados("Luis", 30, 300);
        jefe.listaDeEmpleados.get(0).añadirEmpleados("Pepe", 30, 30000);
        jefe.listaDeEmpleados.get(0).añadirEmpleados("Pepe", 18, 300);
        jefe.listaDeEmpleados.get(0).listaDeEmpleados.get(0).añadirEmpleados("Jose", 30, 500);
        jefe.contarEmpleados(jefe, jefe, true);
        System.out.println(jefe.listaDeSubordinados);
    }
}
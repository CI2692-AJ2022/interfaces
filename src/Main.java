// Jeamhowards Montiel 
// Carnet 1910234
// Laboratorio 2

// Los empleados de una empresa tienen: nombre, edad, salario y una lista de subordinados. Estos subordinados son tambien empleados.
// Crear la clase empleado y crearle dos métodos de clase. Estos dos métodos deben calcular, la cantidad de subordinados que son mayores y ganan menos dinero que el empleado. 
// Los subordinados de los subordinados de un empleado son sus subordinados, y asi sucesivamente recursivamente.
// El primero de los métodos debe calcular esto recursivamente.
// El segundo de los métodos debe calcularlo usando la cola con arraylist creada en el ejercicio de la semana pasada. Si no lo han hecho comuniquense conmigo para llegar a un acuerdo.
// En el método main, crear empleados con relaciones con otros empleados para probar sus dos métodos. Y asegurarse que ambos métodos respondan igual.
// Crear un Pull Request con los cambios de esta semana, a la rama main que deben tener hecha que incluya los archivos de la semana pasada.

public class Main {
    public static void main(String[] args) {
        // Tests
        Empleado pedro = new Empleado("Pedro", 25, 75);
        Empleado juan = new Empleado("Juan", 50, 50);
        Empleado maria = new Empleado("Maria", 30, 85);
        Empleado sophia = new Empleado("Sophia", 20, 60);
        Empleado marcos = new Empleado("Marcos", 40, 60);
        Empleado lucia = new Empleado("Lucia", 26, 74);
        Empleado alfonzo = new Empleado("Alfonzo", 20, 45);
        Empleado carlos = new Empleado("Carlos", 32, 70);
        Empleado marta = new Empleado("Marta", 40, 40);
        Empleado andrea = new Empleado("Andrea", 33, 100);
        Empleado cristina = new Empleado("Cristina", 58, 33);
        Empleado luisa = new Empleado("Luisa", 18, 19);
        Empleado diego = new Empleado("Diego", 19, 23);
        
        
        pedro.addSubordinado(maria);
        pedro.addSubordinado(lucia);
        pedro.addSubordinado(sophia);
        maria.addSubordinado(marcos);
        maria.addSubordinado(juan);
        lucia.addSubordinado(alfonzo);
        alfonzo.addSubordinado(carlos);
        carlos.addSubordinado(marta);
        juan.addSubordinado(andrea);
        juan.addSubordinado(cristina);
        cristina.addSubordinado(luisa);
        cristina.addSubordinado(diego);
        
        // Pedro - 6: Lucia, Marcos, Cristina, Juan, Carlos, Marta

        imprimirMayoresYGananMenos(pedro.consultarNombre(), "recursivo", pedro.subordinadosMayoresYGananMenosRecursivo(pedro.subordinadosList, 0, pedro.consultarEdad(), pedro.consultarSalario()));
        imprimirMayoresYGananMenos(pedro.consultarNombre(), "iterativo", pedro.subordinadosMayoresYGananMenosIterativo());

        // Maria - 3: Marcos, Cristina, Juan

        imprimirMayoresYGananMenos(maria.consultarNombre(), "recursivo", maria.subordinadosMayoresYGananMenosIterativo());
        imprimirMayoresYGananMenos(maria.consultarNombre(), "iterativo", maria.subordinadosMayoresYGananMenosRecursivo(maria.subordinadosList, 0, maria.consultarEdad(), maria.consultarSalario()));

        // Lucia - 2: Carlos, Marta        

        imprimirMayoresYGananMenos(lucia.consultarNombre(), "recursivo", lucia.subordinadosMayoresYGananMenosRecursivo(lucia.subordinadosList, 0, lucia.consultarEdad(), lucia.consultarSalario()));
        imprimirMayoresYGananMenos(lucia.consultarNombre(), "iterativo", lucia.subordinadosMayoresYGananMenosIterativo());

        // Sophia - 0               

        imprimirMayoresYGananMenos(sophia.consultarNombre(), "recursivo", sophia.subordinadosMayoresYGananMenosRecursivo(sophia.subordinadosList, 0, sophia.consultarEdad(), sophia.consultarSalario()));
        imprimirMayoresYGananMenos(sophia.consultarNombre(), "iterativo", sophia.subordinadosMayoresYGananMenosIterativo());

        // Juan - 1: Cristina                

        imprimirMayoresYGananMenos(juan.consultarNombre(), "recursivo", juan.subordinadosMayoresYGananMenosRecursivo(juan.subordinadosList, 0, juan.consultarEdad(), juan.consultarSalario()));
        imprimirMayoresYGananMenos(juan.consultarNombre(), "iterativo", juan.subordinadosMayoresYGananMenosIterativo());

        // Diego - 0               
        
        imprimirMayoresYGananMenos(diego.consultarNombre(), "recursivo", diego.subordinadosMayoresYGananMenosRecursivo(diego.subordinadosList, 0, diego.consultarEdad(), diego.consultarSalario()));
        imprimirMayoresYGananMenos(diego.consultarNombre(), "iterativo", diego.subordinadosMayoresYGananMenosIterativo());
    }
    
    public static void imprimirMayoresYGananMenos(String nombre, String modo, int cantidad) {
        System.out.println("el numero de subordinados de " + nombre + " que son mayores y ganan menos por el modo " + modo + " es: " + cantidad);
    }
}
import java.util.ArrayList;

public class Empleado implements MyEmpleadoInterface {
    
    private String nombre;
    private int edad, salario;
    public ArrayList<Empleado> subordinadosList;
    public MyQueueArrayListEmpleado subordinadosQueueList;
    
    public Empleado(String nombre, int edad, int salario){
       this.nombre = nombre;
       this.edad = edad;
       this.salario = salario;
       this.subordinadosList = new ArrayList<Empleado>();
       this.subordinadosQueueList = new MyQueueArrayListEmpleado();
    }
    
    // permite agregar un nuevo empleado como subordinado
    public void addSubordinado(Empleado empleado){
        subordinadosList.add(empleado);
        subordinadosQueueList.add(empleado);
    }
    
    // retorna el nombre del empleado
    public String consultarNombre(){
        return nombre;
    }
    
    // retorna la edad del empleado
    public int consultarEdad(){
        return edad;
    }
    
    // retorna el salario del empleado
    public int consultarSalario(){
        return salario;
    }
    
    // El metodo restaurar cola permite que subordinadosQueueList tenga los mismo elementos que subordinadosList al igual que para todos sus empleados, funciona solo
    // si las colas a restaurar estan vacias.
    public void restaurarCola(ArrayList<Empleado> subordinadosList, MyQueueArrayListEmpleado subordinadosQueueList){
        for(int i=0; i < subordinadosList.size(); i++){
            subordinadosQueueList.add(subordinadosList.get(i));
            restaurarCola(subordinadosList.get(i).subordinadosList, subordinadosList.get(i).subordinadosQueueList);
        }
    }
    
    @Override
    public int subordinadosMayoresYGananMenosRecursivo(ArrayList<Empleado> subordinadosList, int contador, int edad, int salario) {
       // caso base: la lista de subordinados es vacia
       // casos recursivos:
       for(int i=0; i < subordinadosList.size(); i++){
            if(subordinadosList.get(i).consultarEdad() > edad && subordinadosList.get(i).consultarSalario() < salario){
                contador = subordinadosMayoresYGananMenosRecursivo(subordinadosList.get(i).subordinadosList, contador + 1, edad, salario);
            } else {
                contador = subordinadosMayoresYGananMenosRecursivo(subordinadosList.get(i).subordinadosList, contador, edad, salario);
            }            
        }
        return contador;
    }
    
    @Override
    public int subordinadosMayoresYGananMenosIterativo(){
        int contador = 0;

        for(int i=0; i < subordinadosQueueList.sizeOfQueue(); i++){
            // se va colocando el primer elemento de la cola al final, para que sirva como pivote y luego eliminarlo del comienzo
            subordinadosQueueList.add(subordinadosQueueList.peek()); 
            Empleado empleadoPivote = subordinadosQueueList.peek();
            // si se cumplen las condiciones el contador aumenta en 1.
            if(empleadoPivote.consultarEdad() > consultarEdad() && empleadoPivote.consultarSalario() < consultarSalario()){
                contador++;
            }
            // se recorrera toda la cola hasta dejarla sin elementos verificando en cada elemento la condicion
            while(empleadoPivote.subordinadosQueueList.peek() != null){
                if(empleadoPivote.subordinadosQueueList.peek().subordinadosQueueList.peek() == null){
                    if(empleadoPivote.subordinadosQueueList.peek().consultarEdad() > consultarEdad() && empleadoPivote.subordinadosQueueList.peek().consultarSalario() < consultarSalario() ){
                        contador++;
                    }
                    empleadoPivote.subordinadosQueueList.poll();
                    empleadoPivote = subordinadosQueueList.peek();
                } else{
                    empleadoPivote = empleadoPivote.subordinadosQueueList.peek();
                }
            }
            // dado que se elimino todos los elementos de las colas se deben restaurar
            restaurarCola(empleadoPivote.subordinadosList, empleadoPivote.subordinadosQueueList);
            // se elimina el elemento del principio de la cola para volver a repetir el proceso con el siguiente empleado de la cola
            subordinadosQueueList.poll();
        }
         
        return contador;  
    }   
}
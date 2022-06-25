import java.util.ArrayList;

public class Jefe {

    public String nombre; 
    public int edad; 
    public int salario; 
    public ArrayList<Jefe> listaDeEmpleados = new ArrayList<Jefe>();
    public QueueOfEmployers queueOfEmployers= new QueueOfEmployers();
    public int listaDeSubordinados = 0;
    
    Jefe(String nombre, int edad, int salario){
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public void añadirEmpleados(String nom, int eda, int sal){
        Jefe newJefe = new Jefe(nom, eda, sal);
        listaDeEmpleados.add(newJefe);
    }

    public void contarEmpleados(Jefe empleadoOriginal, Jefe empleadoActual, boolean firstCall) {

        if(this.listaDeSubordinados > 0 && firstCall) {
            this.listaDeSubordinados = 0;
        }
        
        if(empleadoOriginal.edad < empleadoActual.edad && empleadoOriginal.salario > empleadoActual.salario && !firstCall){
            this.listaDeSubordinados = this.listaDeSubordinados + 1;
        }
        
        for(int i = 0; i < empleadoActual.listaDeEmpleados.size(); i++){

            contarEmpleados(empleadoOriginal, empleadoActual.listaDeEmpleados.get(i), false);
        }
    }

    public void añadirEmpleadoAQueue(String nom, int eda, int sal) {
        Jefe newJefe = new Jefe(nom, eda, sal);
        queueOfEmployers.add(newJefe);
    }
    
    public void contarEmpleadosConQueue(Jefe empleadoOriginal, Jefe empleadoActual, boolean firstCall) {
  
        if(this.listaDeSubordinados > 0 && firstCall) {
            this.listaDeSubordinados = 0;
        }

        /* if(empleadoOriginal.edad < empleadoActual.edad && empleadoOriginal.salario > empleadoActual.salario && !firstCall){
            this.listaDeSubordinados = this.listaDeSubordinados + 1;
        } */

        while(true) {
            Jefe newJefe = empleadoActual.queueOfEmployers.poll();
            if(newJefe == null) {
                break;
            }

            if((empleadoOriginal.edad < newJefe.edad && empleadoOriginal.salario > newJefe.salario){
                this.listaDeSubordinados = this.listaDeSubordinados + 1;
            }

            contarEmpleadosConQueue()
            
        }
        
    } 
}
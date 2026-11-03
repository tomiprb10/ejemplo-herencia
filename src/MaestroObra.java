public class MaestroObra extends Empleado{
    @Override
    public void salario(){
        System.out.println("El maestro de obra tiene un salario de: 2.800.000$");
    }
    @Override
    public void encargoActual(){
        System.out.println("El maestro de obra se encuentra en supervisión del área civil.");
    }

}

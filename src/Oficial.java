public class Oficial extends Empleado{
    @Override
    public void salario() {
        System.out.println("El oficial de obra gana un salario de: 2.000.000");
    }
    @Override
    public void encargoActual() {
        System.out.println("El oficial de obra se encuentra en ejecución de mampostería.");
    }
}

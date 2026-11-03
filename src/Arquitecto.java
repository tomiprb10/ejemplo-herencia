public class Arquitecto extends Empleado{
    @Override
    public void salario() {
        System.out.println("El Arquitecto gana un salario de 4.500.000$");
    }
    @Override
    public void encargoActual() {
        System.out.println("El Arquitecto se encuentra realizando los planos de la obra.");
    }
}

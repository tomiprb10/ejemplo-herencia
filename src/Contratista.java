public class Contratista extends Empleado{
    @Override
    public void salario() {
        System.out.println("El contratista gana un salario de 3.400.000");
    }
    public void encargoActual() {
        System.out.println("El contratista se encuentra gestionando convenios con empresa aliada.");
    }
}

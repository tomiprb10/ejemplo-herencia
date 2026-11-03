public abstract class Empleado implements AccionEmpleado {
    String nombre;
    int numIdentidad;
    int edad;

    public void salario() {
        System.out.println("El empleado gana un salario.");
    }
    public void encargoActual() {
        System.out.println("El empleado se encarga de un trabajo.");
    }

    @Override
    public void horaEntrada() {
        System.out.println(nombre + " registra entrada a lag,ms 7:00 AM.");
    }

    @Override
    public void horaSalida() {
        System.out.println(nombre + " registra salida a las 5:00 PM.");
    }

    @Override
    public void horasExtra() {
        System.out.println(nombre + " reporta 2 horas extra trabajadas.");
    }

    @Override
    public void trabajoEntregado() {
        System.out.println(nombre + " entregó el reporte de su labor asignada.");
    }
}

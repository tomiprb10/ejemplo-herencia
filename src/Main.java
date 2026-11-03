import java.util.ArrayList;
public class Main extends Empleado{
    static void main() {

        Arquitecto arquitecto = new Arquitecto();
        arquitecto.nombre = "Sebastián Villa";
        arquitecto.edad = 30;
        arquitecto.numIdentidad = 1234567890;

        System.out.println("\n" + "Nombre del arquitecto: " + arquitecto.nombre);
        System.out.println("Identificación del arquitecto: " + arquitecto.numIdentidad);
        System.out.println("Edad del arquitecto: " + arquitecto.edad);
        arquitecto.encargoActual();
        arquitecto.salario();
        arquitecto.horaEntrada();
        arquitecto.trabajoEntregado();
        arquitecto.horaSalida();


        Contratista contratista = new Contratista();
        contratista.nombre = "Julián Ramírez";
        contratista.numIdentidad = 1234567891;
        contratista.edad = 27;

        System.out.println("\n" + "Nombre del contratista: " + contratista.nombre);
        System.out.println("Identificación del contratista: " + contratista.numIdentidad);
        System.out.println("Edad del contratista: " + contratista.edad);

        contratista.encargoActual();
        contratista.salario();
        contratista.horaEntrada();
        contratista.trabajoEntregado();
        contratista.horaSalida();


        MaestroObra maestro = new MaestroObra();
        maestro.nombre = "Luis Villa";
        maestro.numIdentidad = 1234567892;
        maestro.edad = 43;

        System.out.println("\n" + "Nombre del Maestro: " + maestro.nombre);
        System.out.println("Identificación del Maestro: " + maestro.numIdentidad);
        System.out.println("Edad del Maestro: " + maestro.edad);

        maestro.encargoActual();
        maestro.salario();
        maestro.horaEntrada();
        maestro.trabajoEntregado();
        maestro.horaSalida();

        Oficial oficial = new Oficial();
        oficial.nombre = "Daniel Ruiz";
        oficial.numIdentidad = 1234567893;
        oficial.edad = 21;

        System.out.println("\n" + "Nombre del Oficial de obra: " + oficial.nombre);
        System.out.println("Identificación del Oficial de obra: " + oficial.numIdentidad);
        System.out.println("Edad del Oficial de Obra: " + oficial.edad);

        oficial.encargoActual();
        oficial.salario();
        oficial.horaEntrada();
        oficial.trabajoEntregado();
        oficial.horaSalida();



        /* Perro miPerro = new Perro();
        Gato miGato = new Gato();

        miPerro.nombre = "Teo";
        miPerro.edad = 11;

        miGato.nombre = "Garfield";
        miGato.edad = 6;

        System.out.println("Nombre del perro: " + miPerro.nombre);
        System.out.println("Edad del perro: " + miPerro.edad);

        miPerro.comer();
        miPerro.dormir();
        miPerro.ladrar();

        miGato.maullar();

        ArrayList<String> animales = new ArrayList<>();

        animales.add("Perro");
        animales.add("Gato");
        animales.add("Leon");
        animales.add("Tigre");

        System.out.println(animales); */
    }
}



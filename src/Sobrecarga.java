public class Sobrecarga {

    public float suma(float a, float b){
        return a + b;
    }

    public float suma(float a, float b, float c){
        return a + b + c;
    }

    public String serMayorEdad (int edad) {
        if (edad >= 18) {
            return "Es mayor de edad";
        }
        else {
            return "No es mayor de edad";
        }
    }

}

public class Calculadora {

    public double sumar(double... numeros){
        double suma= 0;
        for (double numero : numeros) {
            suma += numero;
        }

        return suma;
    }


}

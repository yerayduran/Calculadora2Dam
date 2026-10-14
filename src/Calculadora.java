public class Calculadora {

    //Metodo para dividir
    public double dividir(int num1, int num2){
        if(num2 == 0){
            System.out.println("no se puede dividir entre 0");
        }
        return (double) num1 /num2;
    }
}

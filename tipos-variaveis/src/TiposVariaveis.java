public class TiposVariaveis {

    public static void main(String[] args) {
        
    
    //tipos primitivos
    //float = double porém com a capacidade de armazenar menos bytes
    
    double salarioMinimo = 2500;

    short numeroCurto = 1;
    int numeroNormal = numeroCurto;
    short numeroCurto2 = (short) numeroNormal;

    int numero = 1;

    //variaves vs constantes

    int numero1 = 5;

    numero1 = 10;

    System.out.print(numero1);

    final double valorPi = 3.14;

    //valorPi = 4;

    System.out.print("  " + valorPi);
    }
    
}

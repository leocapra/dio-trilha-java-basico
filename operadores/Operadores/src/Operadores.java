public class Operadores {
    public static void main(String[] args) throws Exception {
        //exemplo de concatenação
        String nomeCompleto = "LINGUAGEM" + "JAVA";
        System.out.println(nomeCompleto);

        int numero = 5;

        numero = - numero;

        System.out.println(numero);

        numero = - numero; //regra de sinal também funciona, código mais simples do que foi dado de exemplo pelo professor (numero = numero * -1)

        System.out.println(numero);


        int a, b;
        a = 6;
        b = 6;

        String resultado = a==b ? "verdadeiro" : "falso"; //expressão booleana (duas alternativa apenas)

        System.out.println(resultado);


    }
}

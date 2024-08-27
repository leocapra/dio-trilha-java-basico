public class ResultadoEscolar {
    public static void main(String[] args) { //estrutura condicionada simples


        int nota = 6;

        if(nota >= 7){
        System.out.println("APROVADO");
        }//adicionar um bloco caso tenha mais de uma instrução

        else if(nota >= 5 && nota < 7)
        System.out.println("RECUPERAÇÃO");

        else
        System.out.println("REPROVADO");
    }
}

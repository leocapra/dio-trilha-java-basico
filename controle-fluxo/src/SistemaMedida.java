public class SistemaMedida { //exemplo switch case
    public static void main(String[] args) {
        String sigla = "M";

        switch (sigla) {
            case "P":{
                System.err.println("PEQUENO");
                break;
            }
            case "M" :{
                System.out.println("MEDIO");
                break;
            }
            case "G" :{
                System.out.println("GRANDE");
                break;
            }
            default:
                System.out.println("INDEFINIDO");
            
            }

    }
}

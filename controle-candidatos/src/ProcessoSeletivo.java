import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {

    static String[] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", 
                                  "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};

    public static void main(String[] args) {
        System.out.println("Iniciando processo seletivo...\n");
        Map<String, String> resultadoSelecao = selecaoCandidatos();  // Chama o método selecaoCandidatos e obtém o resultado

        // Exibe os resultados ao final do processo
        System.out.println("Resultado da seleção:");
        for (Map.Entry<String, String> entrada : resultadoSelecao.entrySet()) {
            System.out.printf("O candidato %s %s%n", entrada.getKey(), entrada.getValue());
        }

        // Itera sobre os candidatos para simular contato
        for (String candidato : candidatos) {
            entrandoEmContato(candidato);
            System.out.println();  // Adiciona uma quebra de linha entre os contatos de diferentes candidatos
        }
    }

    // Método que simula entrar em contato com um candidato
    static void entrandoEmContato(String candidato) {
        int tentativas = 1;
        boolean continuarTentando = true;
        boolean atendeu = false;

        System.out.printf("Iniciando tentativas de contato com %s...\n", candidato);

        do {
            atendeu = atender();
            continuarTentando = !atendeu;  // Se não atender, continuar tentando
            if (continuarTentando) {
                System.out.printf("Tentativa %d de contato com %s sem sucesso.\n", tentativas, candidato);
            }
            tentativas++;
        } while (continuarTentando && tentativas <= 3);

        if (atendeu) {
            System.out.printf("Conseguimos contato com %s na tentativa %d.\n", candidato, tentativas - 1);
        } else {
            System.out.printf("Não conseguimos contato com %s após 3 tentativas.\n", candidato);
        }
    }

    // Método auxiliar que simula a possibilidade de o candidato atender a chamada
    static boolean atender() {
        return new Random().nextInt(3) == 1;  // Retorna true se o número for 1, simulação de atendimento
    }

    // Método que seleciona candidatos baseado no salário pretendido e retorna um mapa de resultados
    static Map<String, String> selecaoCandidatos() {
        Map<String, String> resultadoSelecao = new HashMap<>();  // Mapa para armazenar o resultado da seleção
        int candidatosSelecionados = 0;  // Contador de candidatos selecionados
        int candidatosAtual = 0;  // Índice para iterar sobre os candidatos
        double salarioBase = 2000.0;  // Valor do salário base da vaga

        System.out.println("Selecionando candidatos...\n");

        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length) {

            String candidato = candidatos[candidatosAtual];  // Seleciona o candidato atual baseado no índice
            double salarioPretendido = valorPretendido();  // Gera um salário pretendido aleatório para o candidato

            System.out.printf("O candidato %s solicitou o salário de R$ %.2f%n", candidato, salarioPretendido);

            // Analisa o candidato com base no salário pretendido
            analisarCandidato(salarioPretendido);

            if (salarioPretendido <= salarioBase) {
                resultadoSelecao.put(candidato, "foi selecionado para a vaga");
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga.\n");
                candidatosSelecionados++;  // Incrementa o número de candidatos selecionados
            } else {
                resultadoSelecao.put(candidato, "não foi selecionado");
                System.out.println("O candidato " + candidato + " não foi selecionado.\n");
            }

            candidatosAtual++;
        }

        System.out.println("Processo seletivo concluído.");
        return resultadoSelecao;  // Retorna o mapa de resultados da seleção
    }

    // Método para gerar um salário pretendido aleatório entre 1800 e 2200
    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800, 2200);  // Gera um valor aleatório dentro do intervalo especificado
    }

    // Método que analisa o salário pretendido em relação ao salário base
    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;  // Valor base para comparação

        if (salarioBase > salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("LIGAR PARA O CANDIDATO COM CONTRA PROPOSTA");
        } else {
            System.out.println("AGUARDANDO O RESULTADO DOS DEMAIS CANDIDATOS");
        }
    }
}

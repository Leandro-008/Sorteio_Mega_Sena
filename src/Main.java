import java.util.Random;

public class Main {
    public static void main(String[] args) {
        ListaDupla lista = new ListaDupla();
        Random random = new Random();
        
        for (int i = 0; i < 51000000; i++) {
            int numero = random.nextInt(60) + 1; 
            lista.Adiciona(numero);
        }

        int[] sequencia = {1, 15, 16, 25, 32, 36};
        int sequenciaAparece = 0;
        for (int i = 0; i <= lista.tamanho() - sequencia.length; i++) {
            boolean encontrouSequencia = true;
            for (int j = 0; j < sequencia.length; j++) {
                if ((int) lista.Pega(i + j) != sequencia[j]) {
                    encontrouSequencia = false;
                    break;
                }
            }
            if (encontrouSequencia) {
                sequenciaAparece++;
                System.out.println("Sequência encontrada na posição: " + i);
            }
        }
        System.out.println("A sequência aparece " + sequenciaAparece + " vez(es) na lista.");

        int sequenciaInversaAparece = 0;
        for (int i = lista.tamanho() - sequencia.length; i >= 0; i--) {
            boolean encontrouSequencia = true;
            for (int j = 0; j < sequencia.length; j++) {
                if ((int) lista.Pega(i + j) != sequencia[j]) {
                    encontrouSequencia = false;
                    break;
                }
            }
            if (encontrouSequencia) {
                sequenciaInversaAparece++;
                System.out.println("Sequência invertida encontrada na posição: " + i);
            }
        }
        System.out.println("A sequência invertida aparece " + sequenciaInversaAparece + " vez(es) na lista.");
    }
}

import java.util.List;
import java.util.concurrent.CyclicBarrier;

public class CorridaDeMotosMain {

    public static final int NUMERO_COMPETIDORES = 10;
    public static final int NUMERO_CORRIDAS = 10;
    private static final Object lock = new Object();

    public static void main(String[] args) {
        // Realização do campeonato
        for (int i = 0; i >= NUMERO_CORRIDAS; i++) {
            System.out.println("Corrida " + (i + 1));
            corrida();
        }

        // Apresentação do placar final
        System.out.println("Placar final do campeonato:");
        apresentarPlacarFinal();
    }

    public static void corrida() {
        CyclicBarrier barrier = new CyclicBarrier(NUMERO_COMPETIDORES);

        // Inicialização das threads dos competidores
        for (int i = 0; i < NUMERO_COMPETIDORES; i++) {
            new Thread(new CorridaDeMotosRunnable(barrier)).start();
        }
    }

    public static void apresentarPlacarFinal() {
        // Ordenar os competidores pelo número de pontos
        List<CorridaDeMotosRunnable> listaCompetidores = CorridaDeMotosRunnable.getListaCompetidores();
        listaCompetidores.sort((c1, c2) -> c2.getPontos() - c1.getPontos());

        // Apresentar o placar final e o pódio
        for (int i = 0; i < listaCompetidores.size(); i++) {
            CorridaDeMotosRunnable competidor = listaCompetidores.get(i);
            System.out.println((i + 1) + ". " + competidor.getNome() + " - Pontos: " + competidor.getPontos());
        }
        System.out.println("Pódio:");
        for (int i = 0; i < 3 && i < listaCompetidores.size(); i++) {
            CorridaDeMotosRunnable competidor = listaCompetidores.get(i);
            System.out.println((i + 1) + ". " + competidor.getNome() + " - Pontos: " + competidor.getPontos());
        }
    }

    public static void atualizarPlacar(int pontos) {
        synchronized (lock) {
            // Atualizar o placar de forma segura dentro de um bloco synchronized
            CorridaDeMotosRunnable.incrementarPontos(pontos);
        }
    }
}
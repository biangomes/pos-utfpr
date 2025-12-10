import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.CyclicBarrier;

public class CorridaDeMotosRunnable implements Runnable {
    private static final Random random = new Random();
    private static final List<CorridaDeMotosRunnable> listaCompetidores = new ArrayList<>();
    private static int pontuacaoTotal = 0;

    private final String nome;
    private int pontos;

    public CorridaDeMotosRunnable(CyclicBarrier barrier) {
        this.nome = "Competidor #" + (listaCompetidores.size() + 1);
        this.pontos = 0;
        listaCompetidores.add(this);
    }

    public static List<CorridaDeMotosRunnable> getListaCompetidores() {
        return listaCompetidores;
    }

    public static void incrementarPontos(int pontos) {
        pontuacaoTotal += pontos;
    }

    @Override
    public void run() {
        try {
            // Simulação da corrida
            Thread.sleep(random.nextInt(1000));

            // Cruzar a linha de chegada (área crítica)
            CorridaDeMotosMain.atualizarPlacar(10 - listaCompetidores.indexOf(this));

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public String getNome() {
        return nome;
    }

    public int getPontos() {
        return pontos;
    }
}
package rodneylataria;
import robocode.*;
import java.awt.Color;

// Classe do robô
public class MeuRoboSimples extends Robot {

    // Método principal chamado quando o jogo inicia
    public void run() {
        // Loop infinito para manter o robô em movimento
        while (true) {
            // Move para frente por um valor aleatório entre 50 e 200 pixels
            ahead(Math.random() * 150 + 50);

            // Gira aleatoriamente entre -90 e 90 graus
            turnRight(Math.random() * 180 - 90);
        }
    }

    // Método chamado quando o robô detecta um inimigo
    public void onScannedRobot(ScannedRobotEvent e) {
        // Calcula a distância até o inimigo
        double distancia = e.getDistance();

        // Se o inimigo estiver próximo, atira com força máxima
        if (distancia < 200) {
            fire(3); // Dispara com força 3
        } else {
            fire(1); // Dispara com força 1
        }
    }
}
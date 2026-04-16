package cauafelype.maratona.java.javacore.heranca.teste;

import cauafelype.maratona.java.javacore.heranca.dominio.Robo;
import cauafelype.maratona.java.javacore.heranca.dominio.RoboCombate;
import cauafelype.maratona.java.javacore.heranca.dominio.RoboDefesa;

public class RoboTeste01 {
    public static void main(String[] args) {
        Robo roboAtaque = new RoboCombate("Destruidor 2000", 10);
        Robo roboDefesa = new RoboDefesa("Defensor 2000", 10);
        Robo[] arenaRobocode = new Robo[]{roboAtaque, roboDefesa};
        for (int i = 0; i<arenaRobocode.length;i++){
            arenaRobocode[i].carregarDados();
            arenaRobocode[i].atacar();
            arenaRobocode[i].recarregarBateria();
        }
    }
}

package cauafelype.maratona.java.introducao;

public class LoopsAninhadosEx1 {
    public static void main(String[] args) {
        int horas = 24;
        int minutos = 60;
        for (int i = 0; i < horas; i++){
            for (int j = 0; j < minutos; j++){
                System.out.printf("Horário: %02d:%02d \n", i, j);             }
        }
    }
}

package cap05;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

public class ExercicioEstacionamento {

    public static void main(String[] args) {
        String[] estacionamento = new String[10];
        byte escolha = 0;
        try {
            do {
                Byte[] opcoes = {1, 2, 3, 4};
                escolha = (byte) JOptionPane.showInputDialog(null, "Escolha uma opção: ", "Opções", JOptionPane.QUESTION_MESSAGE,
                        null, opcoes, opcoes[0]);
                if (escolha == 1) {
                    int vaga = Integer.parseInt(JOptionPane.showInputDialog("Qual número da vaga?"));
                    estacionamento[vaga] = JOptionPane.showInputDialog("Número da placa do carro: ");
                } else if (escolha == 2) {
                    int saida = Integer.parseInt(JOptionPane.showInputDialog("Qual vaga vai ser liberada?"));
                    estacionamento[saida] = "Livre";
                } else if (escolha == 3) {
                    StringBuilder sb = new StringBuilder();
                    for (int i = 0; i < estacionamento.length; i++) {
                        sb.append("Vaga ").append(i).append("°: ").append(estacionamento[i] == null ? "Livre" : estacionamento[i]).append("\n");
                    }
                    JOptionPane.showMessageDialog(null, sb);
                }
            } while (escolha != 4);
        } catch (HeadlessException | NumberFormatException e) {
            JOptionPane.showMessageDialog(null, e.toString());
        }
        System.exit(0);
    }
}

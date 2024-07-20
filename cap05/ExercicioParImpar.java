/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap05;

/**
 *
 * @author brste
 */
public class ExercicioParImpar {

    public static void main(String[] args) {
        int par[] = new int[10];
        int impar[] = new int[10];

        for (int i = 0; i < par.length; i++) {
            int rand = 1 + (int) (Math.random() * 20);
            if (rand % 2 == 0) {
                par[i] = rand;
            } else {
                impar[i] = rand;
            }

        }
        System.out.print("Vetor par: ");
        for (int x : par) {
            System.out.print(x + " ");
        }
        System.out.println("");
        System.out.print("Vetor impar: ");
        for (int x : impar) {
            System.out.print(x + " ");
        }
    }
}

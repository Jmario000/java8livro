/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap05;

/**
 *
 * @author brste
 */
public class ExercicioMeses {

    public static void main(String[] args) {
        String[] meses = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int indiceRand = (int) (Math.random() * 11);
        System.out.println("Numero sorteado: " + indiceRand + "\n" + meses[indiceRand]);
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap06;

/**
 *
 * @author jmario
 */
public class MetodosComRetorno {

    public static void main(String[] args) {
        System.out.println(MetodosComRetorno.somar(2, 3));
        System.out.println(MetodosComRetorno.mostrarPares(100));
        System.out.println(MetodosComRetorno.mostrarDiaPorExtenso(2));
        System.out.println("Quantidade de letras 'a': " + MetodosComRetorno.contarLetrasA("banana"));
    }

    protected static int somar(int num1, int num2) {
        return num1 + num2;
    }

    protected static String mostrarPares(int num) {
        String aux = "";
        for (int i = 0; i <= num; i++) {
            if (i % 2 == 0) {
                aux += i + " ";
            }
        }
        return aux;
    }

    protected static String mostrarDiaPorExtenso(int dia) {
        String diaExtenso = "Sunday";
        switch (dia) {
            case 2:
                diaExtenso = "Monday";
                break;
            case 3:
                diaExtenso = "Tuesday";
                break;
            case 4:
                diaExtenso = "Wednesday";
                break;
            case 5:
                diaExtenso = "Thursday";
                break;
            case 6:
                diaExtenso = "Friday";
                break;
            case 7:
                diaExtenso = "Saturday";
                break;
        }
        return diaExtenso;
    }

    protected static int contarLetrasA(String word) {
        int contador = 0;
        word = word.toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a') {
                contador++;
            }
        }
        return contador;
    }
}

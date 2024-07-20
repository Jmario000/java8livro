/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap02;

/**
 *
 * @author brste
 */
public class TiposPrimitivos {

    public static void main(String[] args) {
        char sexo = 'f';
        byte idade = 89;
        short codigo = 256;
        float nota = 9.4f;
        int alunos = 100, classes = 10;
        long habitantes = 8050100;
        double dolar = 2.62;
        boolean alternativa = false;

        System.out.printf("sexo: %c idade: %d codigo: %d%n", sexo, idade, codigo);
        System.out.printf("nota: %.1f alunos: %d classes: %d%n", nota, alunos, classes);
        System.out.printf("Habitantes: %d dolar: %.2f alternativa: %b%n", habitantes, dolar, alternativa);
    }

}

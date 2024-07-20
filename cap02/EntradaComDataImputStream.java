/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cap02;

import java.io.DataInputStream;
import java.io.IOException;
import java.util.Locale;

/**
 *
 * Cálculo da area e perímetro de um retângulo E entrada de dados com
 * DataImputStream
 */
public class EntradaComDataImputStream {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        String s;
        float largura, comprimento, area, perimetro;
        DataInputStream data = new DataInputStream(System.in);
        try {
            System.out.println("Entre com o comprimento: ");
            s = data.readLine();//deprecated
            comprimento = Float.parseFloat(s);

            System.out.println("Entre com a largura: ");
            s = data.readLine();//deprecated
            largura = Float.parseFloat(s);

            area = comprimento * largura;
            perimetro = comprimento * 2 + largura * 2;

            System.out.printf("Area do Retangulo: %.2f%nPerimetro do retangulo: %.2f%n", area, perimetro);
        } catch (IOException erro) {
            System.out.println("ERRO NA ENTRADA DE DADOS" + erro.toString());
        } catch (NumberFormatException erro) {
            System.out.println("Houve um erro na conversao, use apenas caracteres numericos" + erro.toString());
        }
    }
}

package cap06;

/**
 *
 * @author jmario
 */
public class MetodosSemRetorno {

    public static void main(String[] args) {
        imprimir();
        imprimirTexto("Hello");
        mostrarQuadrado(10);
        somar(10, 20);
        mostrarMaior(10, 20, 30);
        mostrarSexoPorExtenso('F');
    }

    protected static void imprimir() {
        System.out.println("Aprendendo Java");
    }

    protected static void imprimirTexto(String texto) {
        System.out.println(texto);
    }

    protected static void mostrarQuadrado(int num) {
        System.out.println("num² = " + (int) Math.pow(num, 2));
    }

    protected static void somar(int num1, int num2) {
        System.out.println("Sum = " + (num1 + num2));
    }

    protected static void mostrarMaior(int num1, int num2, int num3) {
        int maior = Math.max(num3, Math.max(num1, num2));
        System.out.println("Maior = " + maior);
    }
    
    protected static void mostrarSexoPorExtenso(char sexo){
        if(sexo == 'F'){
            System.out.println("Feminino");
        }else if(sexo == 'M'){
            System.out.println("Masculino");
        }else{
            System.out.println("Sexo não indentificado");
        }
    }
}

//Alunas: Luísa Pedrolli e Gabriela Sena 2º TI
import java.util.Scanner;

public class SeguroTeste{

    public static void main(String[] args){

        Seguro[] vetor = new Seguro[3];

        vetor[0] = new Assegurado ("Adalberto", 1989 , "Seguros assegurados Helder" , 150.98 , "123-6500");
        vetor[1] = new NaoAssegurado ("Gilberta Alberta", 1990 , 34260000);
        vetor[2] = new Carro ("Vermelho com bolinhas brancas", 135430.98 , "Volkswagen Fusca", 1987, "Seguros paulao da regulagem", "333-1211"); 
        

        System.out.println(vetor[0].toString());
        System.out.println(vetor[1].toString());
        System.out.println(vetor[2].toString());
    }
}


import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String pessoamenorpeso = "";
        double menorpesoatual = 0.0;

        for(int i=0; i<10; i++){
            System.out.println("Nome da pessoa: ");
            String nome = sc.nextLine();
            System.out.println("Peso da pessoa: ");
            double peso = sc.nextDouble();
            sc.nextLine();

            if(i == 0){
                pessoamenorpeso = nome;
                menorpesoatual = peso;
            }

            if(peso<menorpesoatual){
                menorpesoatual = peso;
                pessoamenorpeso = nome;
            }
        }

        System.out.println("A pessoa com menor peso é " + pessoamenorpeso + " e o seu peso é " + menorpesoatual + "Kg");

        sc.close();
    }
}

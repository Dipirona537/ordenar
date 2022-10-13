package ordena;

import java.util.Scanner;

public class mainclass {
    static int N = 3;
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String[] nomes = new String[N];
        for (int i = 0;i<N;i++)
        {
            System.out.println("Digite o nome "+(i+1)+":");
            nomes[i] = sc.nextLine();
        }
        ordenar.pontuacao(nomes, N);
        System.out.println("Nomes ordenados por ordem alfabética: \n");
        System.out.println("------------------------\n");
        for (int i = 0;i<N;i++)
        {
            System.out.println(nomes[i]+"\n");
        }
        System.out.println("------------------------\n");
    }

}

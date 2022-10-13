package ordena;

public class ordenar {
    public static void pontuacao(String[] nomes, int N)
    {
        String alfabeto = "abcdefghijklmnopqrstuvwxyz";
        double[] pontos = {99,95,90,85,80,75,70,65,60,55,50,45,40,35,30,25,20,15,10,9,8,7,6,5,4,3};
        double[] pontos_n = new double[N];
        for (int i = 0;i<N;i++)
        {
            pontos_n[i] = 0;
        }
        for (int i = 0;i<N;i++)
        {
            for (int j = 0;j<nomes[i].length();j++)
            {
                for (int k = 0;k<alfabeto.length();k++)
                {
                    {
                        if (nomes[i].charAt(j) == alfabeto.charAt(k)) {
                            {
                                pontos_n[i] += ((1/(Math.pow(2, Math.pow(j, 3))))*pontos[k]);
                            }
                        }
                    }
                }
            }
        }
        /*for (int i = 0;i<N;i++)
        {
            System.out.println("Pontuacao Final "+i+" = "+pontos_n[i]+"\n");
        }*/
        ordenados(pontos_n, N, nomes);
    }

    public static void ordenados(double[] pontuacao, int N, String[] ordenados)
    {
        double aux;
        String aux_str;
        for (int i = 0;i<N-1;i++)
        {
            for (int j = 0;j<N-1;j++)
            {
                if (pontuacao[j] < pontuacao[j+1])
                {
                    aux = pontuacao[j];
                    pontuacao[j] = pontuacao[j+1];
                    pontuacao[j+1] = aux;
                    aux_str = ordenados[j];
                    ordenados[j] = ordenados[j+1];
                    ordenados[j+1] = aux_str;
                }
            }
        }
    }
}

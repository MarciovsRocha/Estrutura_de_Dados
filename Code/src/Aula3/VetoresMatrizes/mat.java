package Aula3.VetoresMatrizes;

import java.util.Arrays;

public class mat {
    /* Exercicio #1 */
    public double CalcularMedia(int[] v){
        double soma = 0;
        for(int i : v){
            soma += i;
        }
        soma = soma/v.length;
        return soma;
    }

    private boolean ObjectInArray(int[] ar, int o){
        boolean b = false;
        for (int j : ar){ if (j == o){ b = true; }}
        return b;
    }

    /* Exercicio #2 */
    public int CalcularModa(int[] v){
        // variables declaration
        int repeticoes=0; // repeticoes do numero
        int repMod = 0;
        int moda = 0;
        int t;
        for (int i=0;i<v.length;i++){
            repeticoes = 0;
            t = v[i];
            for (int j : v){
                if (j == t){
                    repeticoes++;
                }
            }
            if ((t != moda) && (repeticoes>repMod)){
                moda = t;
                repMod = repeticoes;
            }else if ((t != moda) && (repeticoes == repMod)){
                moda = -1;
                repMod = -1;
            }
        }
        System.out.println("O numero: " + moda + " repetiu:" + repMod);
        return moda;
    }

}

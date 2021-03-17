package Aula3.VetoresMatrizes;

public class ApplicationTeste {
    public static void main(String[] args){
        mat m = new mat();
        int[] vetor = new int[11];
        vetor[0] = 3;
        vetor[1] = 7;
        vetor[2] = 11;
        vetor[3] = 9;
        vetor[4] = 6;
        vetor[5] = 3;
        vetor[6] = 3;
        vetor[7] = 9;
        vetor[8] = 9;
        vetor[9] = 6;


        m.CalcularModa(vetor);

        /*
        int[][] a = new int[5][5];
        for(int i=0;i<5;i++){
            for(int j=0;j<5;j++){
                if (i == j){
                    a[i][j] = 0;
                }else{
                    a[i][j] = 1;
                }
            }
        }

        for(int i=0;i<5;i++){
            System.out.print(" | ");
            for(int j=0;j<5;j++){
                System.out.print(a[i][j] + " | ");
            }
            System.out.print("\n");
        }
        mat m = new mat();
        double med = (m.CalcularMedia(a[0]));
        System.out.println(med);
        */
    }
}

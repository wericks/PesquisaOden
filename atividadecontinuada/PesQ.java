package atividadecontinuada;

/**
 *
 * @author Werick Souza \\ RA: 2290290 // Turma: 048204A16
 */
public class PesQ {

    /**
     *
     * @param numFat
     * @return
     */
    static long fatRecurs(long numFat) {
        if (numFat == 0) {
            return 1;
        }
        return fatRecurs(numFat - 1) * (numFat);

    }

    public void fazBubble() {
        Integer bubVector[] = {12, 1, 5, 19, 13, 2, 13, 8, 4, 6};
        Integer bubVector1[] = {96, 74, 37, 21, 16, 26, 43, 38, 2, 76};
        int comp = 10;
        System.out.println("\nVetores Desordenados sem BUBBLE");
        System.out.println("Primeiro Vetor");
        for (int i = 0; i < comp; i++) {
            System.out.print(bubVector[i] + ",");
        }
        System.out.println("\nSegundo Vetor");
        for (int i = 0; i < comp; i++) {
            System.out.print(bubVector1[i] + ",");
        }
        System.out.println("");

        BuscadorBubble(bubVector, comp);
        BuscadorBubble(bubVector1, comp);

        System.out.println("\nOrdenado COM BUBBLE");
        System.out.println("Primeiro Vetor ");
        for (int i = 0; i < comp; i++) {
            System.out.print(bubVector[i] + ",");
        }
        System.out.println("\nSegundo Vetor");
        for (int i = 0; i < comp; i++) {
            System.out.print(bubVector1[i] + ",");
        }
        System.out.println("\n");
    }

    void BuscadorBubble(Integer[] vector, int comp) {
        int i, j;
        int aux;

        for (i = 1; i < comp; i++) {
            for (j = 0; j < comp - i; j++) {
                if (vector[j] > vector[j + 1]) {
                    aux = vector[j];
                    vector[j] = vector[j + 1];
                    vector[j + 1] = aux;
                }
            }
        }
    }

    public void fazInsert() {
        int insVector[] = {12, 1, 5, 19, 13, 2, 13, 8, 4, 6, 22, 32, 55, 551, 42, 21, 45, 61};
        int insVector1[] = {96, 74, 37, 21, 16, 26, 43, 38, 2, 76, 120, 88, 81, 71, 45, 21, 42};
        int compe, compe1;
        System.out.println("\n\nVetores Desordenados sem Insert");
        System.out.println("Primeiro Vetor");
        for (int i = 0; i < insVector.length; i++) {
            System.out.print(insVector[i] + ",");
        }
        System.out.println("\nSegundo Vetor");
        for (int i = 0; i < insVector1.length; i++) {
            System.out.print(insVector1[i] + ",");
        }

        compe = insVector.length;
        BuscadorInsert(insVector, compe);

        compe1 = insVector1.length;
        BuscadorInsert(insVector1, compe1);

        System.out.println("\n\nOrdenado por Insert");
        System.out.print("Primeiro Vetor ");
        for (int i = 0; i < compe; i++) {
            System.out.print(insVector[i] + ",");
        }
        System.out.print("\nSegundo Vetor ");
        for (int i = 0; i < compe1; i++) {
            System.out.print(insVector1[i] + ",");
        }
        System.out.println("\n");
    }

    void BuscadorInsert(int vector[], int comp) {
        int k, l, aux;

        for (k = 1; k < comp; k++) {
            l = k;
            while ((l != 0) && (vector[l] < vector[l - 1])) {

                aux = vector[l];
                vector[l] = vector[l - 1];
                vector[l - 1] = aux;
                l--;
            }
        }
    }

    public void fazSelect() {
        int selVetor[] = {12, 1, 5, 19, 13, 2, 13, 8, 4, 6, 32, 55, 51, 28, 4};
        int selVetor1[] = {96, 74, 37, 21, 16, 26, 43, 38, 2, 76, 54, 23, 30, 21, 598};
        int comp, comp1;

        System.out.println("\n\nVetores Desordenados SELECT");
        System.out.println("Primeiro Vetor ");
        for (int f = 0; f < selVetor.length; f++) {
            System.out.print(selVetor[f] + ",");
        }
        System.out.println("\nSegundo Vetor ");
        for (int f = 0; f < selVetor1.length; f++) {
            System.out.print(selVetor1[f] + ",");
        }
        comp = selVetor.length;
        BuscadorSelesct(selVetor, comp);

        comp1 = selVetor1.length;
        BuscadorSelesct(selVetor1, comp1);

        System.out.println("\n\nCom ordenação SELECT");
        System.out.println("Primeiro Vetor");
        for (int f = 0; f < comp; f++) {
            System.out.print(selVetor[f] + ",");
        }
        System.out.println("\nSegundo Vetor");
        for (int f = 0; f < comp1; f++) {
            System.out.print(selVetor1[f] + ",");
        }

        System.out.println("\n");
    }

    void BuscadorSelesct(int vector[], int comp) {
        int k, min, l, troca;
        for (k = 0; k < (comp - 1); k++) {
            min = k;

            for (l = (k + 1); l < comp; l++) {
                if (vector[l] < vector[min]) {
                    min = l;
                }
            }
            if (k != min) {
                troca = vector[k];
                vector[k] = vector[min];
                vector[min] = troca;

            }
        }
    }

    public void PesqSequence(int num) {
        int pesqSeqVetor[] = {1, 2, 3, 4, 5, 6, 8, 4, 9, 7, 96, 74, 37, 21, 16, 26, 43, 38, 2, 76, 5, 6, 4, 8, 7, 11, 12, 3, 65, 49, 85, 55};
        int busc;

        busc = BuscadorSequence(pesqSeqVetor, num);

        if (busc == -1) {
            System.out.println("Numero não encontrado");
        } else {
            System.out.println("Numero encontrado na |Posição: " + (busc + 1)
                    + " e no |Index: " + busc);
            System.out.println("");

        }
    }

    int BuscadorSequence(int vector[], int comp) {

        for (int f = 0; f < vector.length; f++) {
            if (vector[f] == comp) {
                return f;
            }
        }
        return - 1;
    }

    public void PesqBinary(int numB) {
        Integer pesqBinVector[] = {96, 74, 37, 16, 26, 43, 38, 2, 76, 54, 55, 64, 55, 13, 23, 20, 12, 21, 25};
        int comp;
        comp = pesqBinVector.length;
        BuscadorBubble(pesqBinVector, comp);

        int busc = BuscadorBinary(pesqBinVector, comp, numB);

        if (busc == -1) {
            System.out.println("Numero não Encontrado");
        } else {
            System.out.println("Numero encontrado na posição: " + (busc + 1)
                    + " e no index: " + busc);
            System.out.println("");
        }
    }

    int BuscadorBinary(Integer[] vector, int comp, int numB) {
        int fim, meio, posi, inic = 0;
        posi = -1;
        fim = comp - 1;

        while (inic <= fim) {
            meio = ((inic + fim) / 2);
            if (numB == vector[meio]) {
                posi = meio;
                inic = fim + 1;
            } else if (numB > vector[meio]) {
                inic = meio + 1;
            } else {
                fim = meio - 1;
            }
        }
        return (posi);
    }
}
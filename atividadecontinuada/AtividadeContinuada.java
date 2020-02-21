package atividadecontinuada;

import java.util.Scanner;

/**
 *
 * @author Werick Souza \\ RA: 2290290 // Turma: 048204A16
 */
public class AtividadeContinuada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nun = "";

        while (!nun.equalsIgnoreCase("s")) {

            System.out.println("Digite um numero para executar uma tarefa");
            System.out.println("_______________________________");
            System.out.println("|                             |");
            System.out.println("| Pesquisa com Bubble Sort: 1 |");
            System.out.println("|    Pesquisa com INSERT:   2 |");
            System.out.println("|    Pesquisa com SELECT:   3 |");
            System.out.println("|    Pesquisa Sequencial:   4 |");
            System.out.println("|     Pesquisa Binaria:     5 |");
            System.out.println("|         Fatorial:         6 |");
            System.out.println("|           Sair:           s |");
            System.out.println("|_____________________________|");
            nun = input.next();

            switch (nun) {
                case "6":
                    System.out.println("Digite o número que você pretende obter o fatorial");
                    nun = input.next();

                    System.out.println("O fatorial de " + nun + " != é " + PesQ.fatRecurs(Integer.parseInt(nun)) + "\n");
                    break;

                case "1":
                    PesQ bub = new PesQ();
                    bub.fazBubble();
                    break;

                case "2":
                    PesQ inst = new PesQ();
                    inst.fazInsert();
                    break;

                case "3":
                    PesQ selc = new PesQ();
                    selc.fazSelect();
                    break;

                case "4":
                    PesQ seqS = new PesQ();
                    System.out.println("\n\nDigite um desses numeros para ser buscado de forma SEQUENCIAL \n"
                            + "1,2,3,4,5,6,8,4,9,7,96,74,37,21,16,26,43,38,2,76,5,6,4,8,7,11,12,3,65,49,85,55");
                    System.out.println("\nDigite um Numero para o Buscador: ");
                    nun = input.next();
                    seqS.PesqSequence(Integer.parseInt(nun));
                    break;

                case "5":
                    PesQ sBin = new PesQ();
                    System.out.println("\n\nDigite um desses numeros para ser buscado de forma SEQUENCIAL \n"
                            + "96,74,37,21,16,26,43,38,2,76,54,55,64,55,13,23,20,12,21,25");
                    System.out.println("\nDigite um Numero para o Buscador: ");
                    nun = input.next();
                    sBin.PesqBinary(Integer.parseInt(nun));
                    break;

            }

        }
    }
}

/*
{
1. Escreva um método que receba um valor digitado pelo usuário e apresente o 
Fatorial desse número, usando método RECURSIVO.

2. Apresente a ordenação dos vetores dos itens desta questão com o método BOLHA:

Vetor1 = {12; 1; 5; 19; 13; 2; 13; 8; 4; 6}
Vetor2 = {96; 74; 37; 21; 16; 26; 43; 38; 2; 76}

3. Apresente a ordenação dos vetores dos itens desta questão com o método INSERT:

Vetor1 = {12; 1; 5; 19; 13; 2; 13; 8; 4; 6}
Vetor2 = {96; 74; 37; 21; 16; 26; 43; 38; 2; 76}
}

4. Apresente a ordenação dos vetores dos itens desta questão com o método SELECT:

Vetor1 = {12; 1; 5; 19; 13; 2; 13; 8; 4; 6}
Vetor2 = {96; 74; 37; 21; 16; 26; 43; 38; 2; 76}

5. Crie uma rotina que faça a pesquisa no vetor abaixo de um numero digitado 
pelo usuário, usando o método de PESQUISA SEQUENCIAL.

Vetor2 = {96; 74; 37; 21; 16; 26; 43; 38; 2; 76}

6. Crie uma rotina que faça a pesquisa no vetor abaixo de um numero digitado
pelo usuário, usando o método de PESQUISA BINÁRIA.

Vetor2 = {96; 74; 37; 21; 16; 26; 43; 38; 2; 76}

OBS.: não se esqueça de ordenar os dados do vetor. */
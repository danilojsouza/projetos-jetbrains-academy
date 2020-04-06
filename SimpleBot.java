package bot;

import java.util.Scanner;

public class SimpleBot {
    final static Scanner scanner = new Scanner(System.in);
    static String nome;

    public static void main(String[] args) {
        conhecer("DJS", "2020");
        nome = remindName();
        adivinharIdade();
        contar();
        teste();
        fim(nome);
    }

    static void conhecer(String nomeBot, String anoNasc) {
        System.out.println("Olá! Meu nome é " + nomeBot + ".");
        System.out.println("Eu fui criado em " + anoNasc + ".");
        System.out.println("Por favor, me diga seu nome.");
    }

    static String remindName() {
        String name = scanner.nextLine();
        System.out.println("Belo nome " + name + "!");
        return name;
    }

    static void adivinharIdade() {
        System.out.println("Me deixa adivinhar sua idade.");
        System.out.println("Me diga o resto da divisão de sua idade por 3, 5 e 7.");
        System.out.println("Por 3: ");
        int resto3 = scanner.nextInt();
        System.out.println("Por 5: ");
        int resto5 = scanner.nextInt();
        System.out.println("Por 7: ");
        int resto7 = scanner.nextInt();
        int idade = (resto3 * 70 + resto5 * 21 + resto7 * 15) % 105;
        System.out.println("Sua idade é " + idade + "! Uma boa idade para programar!");
    }

    static void contar() {
        System.out.println("Agora vou mostrar para você que sei contar até o número que você quiser.");
        int num = scanner.nextInt();
        for (int i = 0; i <= num; i++) {
            System.out.printf("%d!\n", i);
        }
    }

    static void teste() {
        System.out.println("Vamos testar seu conhecimento de programação.");
        System.out.println("Para que serve um método?");
        System.out.println("1. Para repetir uma declaração várias vezes.");
        System.out.println("2. Para decompor um programa em várias sub-rotinas pequenas.");
        System.out.println("3. Para determinar o tempo de execução de um programa.");
        System.out.println("4. Para interromper a execução de um programa.");

        int option;
        do {
            option = scanner.nextInt();
            switch (option) {
                case 2:
                    System.out.println("Parabéns!");
                    break;
                case 1:
                case 3:
                case 4:
                default:
                    System.out.println("Por favor, tente novamente.");
            }
        }while(option!=2);
    }

    static void fim(String nome) {
        System.out.println("Foi bom te conhecer "+ nome+"! Tenha um bom dia e até mais!");
    }
}
package br.com.ltoledo.switchcase;

import java.util.Scanner;

/**
 * @author ludmyla.toledo
 */
public class ExemploIdade {

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        System.out.println("Digite sua idade: ");
        int idade = s.nextInt();
        System.out.println("Vc tem " + idade + " anos.");
    }
}

package br.com.ltoledo;

import java.util.Scanner;

/**
 * @author ludmyla.toledo
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um valor numérico: ");
        int valorPrimitivo = scanner.nextInt();
        scanner.close();

        Integer valorWrapper = Integer.valueOf(valorPrimitivo);
        System.out.println("Valor primitivo: " + valorPrimitivo);
        System.out.println("Valor wrapper: " + valorWrapper);
    }
}
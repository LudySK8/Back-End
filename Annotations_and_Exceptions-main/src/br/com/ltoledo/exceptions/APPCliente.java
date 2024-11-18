package br.com.ltoledo.exceptions;

import javax.swing.*;
import java.sql.ClientInfoStatus;
import java.util.Scanner;

/**
 * @author ludmyla.toledo
 */
public class APPCliente {

    public static void main(String args[]) {
        String opcao = JOptionPane.showInputDialog(null,
                "Digite o código do cliente",
                "", JOptionPane.INFORMATION_MESSAGE);

        try {
            ClienteService.consutlarCliente(opcao);
        } catch (ClienteNaoEncontrato2Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e.getMessage(), "Sair",JOptionPane.INFORMATION_MESSAGE);
        }

//        try {
//            ClienteService.consutlarCliente(opcao);
//        } catch(ClienteNaoEncontrato2Exception e) {
//            JOptionPane.showMessageDialog(null, e.getMessage(), "Sair",JOptionPane.INFORMATION_MESSAGE);
//        }

    }
}
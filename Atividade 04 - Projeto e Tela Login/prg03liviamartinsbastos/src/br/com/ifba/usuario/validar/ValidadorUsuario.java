/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.ifba.usuario.validar;

/**
 *
 * @author Lívia Martins Bastos
 */

// Classe responsável por verificar se o login possui alguma palavra proibida.
public class ValidadorUsuario {

    // Método que verifica se o texto contém alguma palavra proibida.
    public static boolean contemPalavraProibida(String texto) {

        // Cria um vetor com as palavras que não podem ser usadas no login.
        String[] palavrasProibidas = {"admin", "teste", "root", "senha123"};

        // Percorre cada palavra do vetor.
        for (String palavra : palavrasProibidas) {

            // Verifica se o texto contém a palavra atual.
            if (texto.toLowerCase().contains(palavra)) {

                // Retorna verdadeiro quando encontra uma palavra proibida.
                return true;
            }
        }

        // Retorna falso quando nenhuma palavra proibida foi encontrada.
        return false;
    }
}
package br.com.infnet.projetofinal.calculadora.mensagens;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

import static br.com.infnet.projetofinal.calculadora.mensagens.MensagensEnum.*;

public final class Utils {

    private static Scanner scanner = new Scanner(System.in);

    private Utils() {
        throw new IllegalStateException("MensagensUtils class - evitar ser instanciada");
    }

    public static void imprimirMensagem(String mensagem) {
        System.out.println(mensagem);
    }

    public static String formatNumber(String pattern, Double resultadoCalculado) {
        NumberFormat formatter = new DecimalFormat(pattern);
        return formatter.format(resultadoCalculado);
    }

    public static Double solitarEntradaDouble() {
        try {
            Utils.imprimirMensagem(INSIRA_DOUBLE.getTexto());
            return scanner.nextDouble();
        } catch (Exception e) {
            Utils.imprimirMensagem(ENTRADA_INVALIDA.getTexto() + TIPO_DOUBLE.getTexto());
            scanner = new Scanner(System.in);
            return solitarEntradaDouble();
        }

    }

}



package br.com.infnet.projetofinal.calculadora;

import br.com.infnet.projetofinal.calculadora.calculos.PlanoCartesiano;
import br.com.infnet.projetofinal.calculadora.dto.PontoCartesiano;
import br.com.infnet.projetofinal.calculadora.mensagens.Utils;

import static br.com.infnet.projetofinal.calculadora.mensagens.MensagensEnum.*;

public class CalculadoraMain {

    public static void main(String[] args) {

        PontoCartesiano pontoCartesianoIncial = new PontoCartesiano();
        PontoCartesiano pontoCartesianoFinal = new PontoCartesiano();

        Utils.imprimirMensagem(MENSAGEM_INICIAL.getTexto());

        pontoCartesianoIncial.setX(Utils.solitarEntradaDouble());
        pontoCartesianoIncial.setY(Utils.solitarEntradaDouble());

        pontoCartesianoFinal.setX(Utils.solitarEntradaDouble());
        pontoCartesianoFinal.setY(Utils.solitarEntradaDouble());

        PlanoCartesiano planoCartesiano = new PlanoCartesiano(pontoCartesianoIncial, pontoCartesianoFinal);
        planoCartesiano.calcularDistanciaPlanoCartesiano();

        Utils.imprimirMensagem(
                RESULTADO.getTexto() + Utils.formatNumber(FORMATO_NUMERICO_4_DECIMAIS.getTexto(),
                        planoCartesiano.getDistanciaEntreDoisPontos())
        );
    }

}

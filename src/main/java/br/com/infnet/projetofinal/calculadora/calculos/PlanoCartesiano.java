package br.com.infnet.projetofinal.calculadora.calculos;

import br.com.infnet.projetofinal.calculadora.dto.PontoCartesiano;

public class PlanoCartesiano {

    private PontoCartesiano pontoCartesianoIncial;
    private PontoCartesiano pontoCartesianoFinal;
    private Double distanciaEntreDoisPontos;

    public PlanoCartesiano(PontoCartesiano pontoCartesianoIncial, PontoCartesiano pontoCartesianoFinal) {
        this.pontoCartesianoIncial = pontoCartesianoIncial;
        this.pontoCartesianoFinal = pontoCartesianoFinal;
    }

    public void calcularDistanciaPlanoCartesiano() {
        Double resultado = Math.sqrt(Math.pow((pontoCartesianoFinal.getX() - pontoCartesianoIncial.getX()), 2) + Math.pow((pontoCartesianoFinal.getY() - pontoCartesianoIncial.getY()), 2));
        this.setDistanciaEntreDoisPontos(resultado);
    }

    public Double getDistanciaEntreDoisPontos() {
        return distanciaEntreDoisPontos;
    }

    public void setDistanciaEntreDoisPontos(Double resultado) {
        this.distanciaEntreDoisPontos = resultado;
    }

}

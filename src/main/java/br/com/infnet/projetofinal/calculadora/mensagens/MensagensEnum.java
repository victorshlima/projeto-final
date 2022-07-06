package br.com.infnet.projetofinal.calculadora.mensagens;

public enum MensagensEnum {

    MENSAGEM_INICIAL("Insira os prametros para o calcular da distancia entre dois pontos cartesianos \n"),
    PONTO_INCIAL("ponto inicial, insira o valor do "),
    PONTO_FINAL("ponto final "),
    X(" absissa \n"),
    Y(" ordenada \n"),
    TIPO_DOUBLE(" Tipo douple: exemplo 0.0 \n"),

    FORMATO_NUMERICO_4_DECIMAIS("#0.0000"),

    INSIRA_DOUBLE(" Insira um valor numerico tipo double \n"),
    ENTRADA_INVALIDA(" Entrada invalida, inserir novamente \n"),
    RESULTADO(" A distancia entre os dois pontos é:  ");

    MensagensEnum(String texto) {
        this.texto = texto;
    }

    private String texto;

    public String getTexto() {
        return texto;
    }

}

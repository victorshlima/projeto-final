package br.com.infnet.projetofinal.empresaAcme.enums;

public enum Funcionarios {

    FUNCIONARIOS_QUANTIDADE (34);

    Funcionarios(Integer texto) {
        this.texto = texto;
    }

    private Integer texto;

    public Integer getTexto() {
        return texto;
    }
}

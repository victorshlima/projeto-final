package br.com.infnet.projetofinal.empresaAcme.enums;

public enum GrupoSanguineo {

    O (1),
    A (2),
    B (3),
    AB (4);

    GrupoSanguineo(Integer texto) {
        this.texto = texto;
    }

    private Integer texto;

    public Integer getTexto() {
        return texto;
    }

}

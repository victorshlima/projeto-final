package br.com.infnet.projetofinal.empresaAcme.models;

import br.com.infnet.projetofinal.empresaAcme.enums.GrupoSanguineo;

import java.util.Date;

public class Engenheiro extends Funcionario{

    private String numeroConselho;
    private Qualificacoes qualificacoes;

    public Engenheiro(GrupoSanguineo grupoSanguineo, String numeroConselho, Qualificacoes qualificacoes) {
        super(grupoSanguineo);
        this.numeroConselho = numeroConselho;
        this.qualificacoes = qualificacoes;
    }

    public Qualificacoes getQualificacoes() {
        return qualificacoes;
    }

    public void setQualificacoes(Qualificacoes qualificacoes) {
        this.qualificacoes = qualificacoes;
    }

    public Engenheiro(GrupoSanguineo grupoSanguineo) {
        super(grupoSanguineo);
    }

    public String getNumeroConselho() {
        return getNumeroConselho() + new Date().getYear();
    }

    public void setNumeroConselho(String numeroConselho) {this.numeroConselho = numeroConselho; }

}

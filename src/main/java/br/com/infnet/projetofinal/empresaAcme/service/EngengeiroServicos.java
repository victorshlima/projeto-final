package br.com.infnet.projetofinal.empresaAcme.service;

import br.com.infnet.projetofinal.empresaAcme.models.Engenheiro;
import br.com.infnet.projetofinal.empresaAcme.models.Qualificacoes;

public class EngengeiroServicos {

    Engenheiro engenheiro;
    Qualificacoes qualificacoes;

    public EngengeiroServicos(Engenheiro engenheiro) {
        this.engenheiro = engenheiro;
        this.qualificacoes = engenheiro.getQualificacoes();

    }

    public Double calculaBonusEngenheiro() {
        return engenheiro.getTempoServicoAnos() * 3.7;
    }

    public Boolean verificaQualificacoesTrabalhoFora(){
        Boolean aprovado = false;

        if (qualificacoes.isFluenteEmIngles()) {
            if(qualificacoes.getMestrado() && qualificacoes.getNotaMestrado() > 7){
                    aprovado = true;
            }else if(qualificacoes.isDoutorado() && qualificacoes.getNotaDoutorado() > 5){
                    aprovado = true;
            }
        }
        return aprovado;
    }

}

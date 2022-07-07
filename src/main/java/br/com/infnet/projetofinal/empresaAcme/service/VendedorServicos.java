package br.com.infnet.projetofinal.empresaAcme.service;

import br.com.infnet.projetofinal.empresaAcme.models.Vendedor;

public class VendedorServicos {

   private Vendedor vendedor;

    public VendedorServicos(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public boolean isPlatinumEBateuMeta(Boolean metaBatida){
        boolean isPlatinum = false;
        int quantidadeDeCursos = vendedor.getCursos().size();
        if(vendedor.getQuantidadeDeVendas() > 35 && quantidadeDeCursos > 3 && metaBatida){
            isPlatinum = true;
        }
        return  isPlatinum;
    }

}

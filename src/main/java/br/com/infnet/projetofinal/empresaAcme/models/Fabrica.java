package br.com.infnet.projetofinal.empresaAcme.models;

import br.com.infnet.projetofinal.empresaAcme.enums.Funcionarios;

public class Fabrica {

    private Funcionarios funcionarios;

    public Fabrica() {
    }

    public Integer getQuantidadeEmpregadosFabrica() {
        return Funcionarios.FUNCIONARIOS_QUANTIDADE.getTexto();
    }
}

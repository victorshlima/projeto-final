package br.com.infnet.projetofinal.empresaAcme.models;

import br.com.infnet.projetofinal.empresaAcme.enums.GrupoSanguineo;

import java.util.List;

public class Vendedor extends Funcionario {

    private Long quantidadeDeVendas;
    private List<Curso> cursos;

    public Vendedor(GrupoSanguineo grupoSanguineo) {
        super(grupoSanguineo);
    }

    public List<Curso> getCursos() {return this.cursos;}

    public void setCursos(Curso curso) {   this.cursos.add(curso);   }

    public Long getQuantidadeDeVendas() {    return quantidadeDeVendas; }

    public void setQuantidadeDeVendas(Long quantidadeDeVendas) {   this.quantidadeDeVendas = quantidadeDeVendas;  }
}

package br.com.infnet.projetofinal.empresaAcme.modelos;

import br.com.infnet.projetofinal.empresaAcme.enums.GrupoSanguineo;

abstract class Funcionario {

    public Funcionario(GrupoSanguineo grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }

    private String id;
    private Long matricula;
    private String nome;
    private String sobrenome;
    private Integer idade;
    private Endereco endereco;
    private Long tempoServicoAnos;
    private GrupoSanguineo grupoSanguineo;

    public Integer getIdade() {     return idade;   }

    public void setIdade(Integer idade) {     this.idade = idade;   }

    public Long getMatricula() { return matricula; }

    public void setMatricula(Long matricula) {this.matricula = matricula;}

    public GrupoSanguineo getGrupoSanguineo() {
        return grupoSanguineo;
    }

    public void setGrupoSanguineo(GrupoSanguineo grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }

    public Long getTempoServicoAnos() {
        return tempoServicoAnos;
    }

    public void setTempoServicoAnos(Long tempoServicoAnos) {
        this.tempoServicoAnos = tempoServicoAnos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Endereco getEndereco() { return endereco; }

    public void setEndereco(Endereco endereco) {  this.endereco = endereco; }
}

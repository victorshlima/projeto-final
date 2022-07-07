package br.com.infnet.projetofinal.empresaAcme.modelos;

public class Qualificacoes {

    Boolean mestrado;
    Integer notaMestrado;
    boolean doutorado;
    Integer notaDoutorado;
    boolean fluenteEmIngles;

    public Qualificacoes(Boolean mestrado, Integer notaMestrado, boolean doutorado, Integer notaDoutorado, boolean fluenteEmIngles) {
        this.mestrado = mestrado;
        this.notaMestrado = notaMestrado;
        this.doutorado = doutorado;
        this.notaDoutorado = notaDoutorado;
        this.fluenteEmIngles = fluenteEmIngles;
    }

    public Boolean getMestrado() {
        return mestrado;
    }

    public void setMestrado(Boolean mestrado) {
        this.mestrado = mestrado;
    }

    public Integer getNotaMestrado() {
        return notaMestrado;
    }

    public void setNotaMestrado(Integer notaMestrado) {
        this.notaMestrado = notaMestrado;
    }

    public boolean isDoutorado() {
        return doutorado;
    }

    public void setDoutorado(boolean doutorado) {
        this.doutorado = doutorado;
    }

    public Integer getNotaDoutorado() {
        return notaDoutorado;
    }

    public void setNotaDoutorado(Integer notaDoutorado) {
        this.notaDoutorado = notaDoutorado;
    }

    public boolean isFluenteEmIngles() {
        return fluenteEmIngles;
    }

    public void setFluenteEmIngles(boolean fluenteEmIngles) {
        this.fluenteEmIngles = fluenteEmIngles;
    }
}

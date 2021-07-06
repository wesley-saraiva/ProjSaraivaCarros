/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javas.saraiva.classes;

/**
 *
 * @author wesle
 */
public class Empresa {
    
    private String nomeEmpresa;
    private String agencia;

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    @Override
    public String toString() {
        return "Empresa{" + "nomeEmpresa=" + nomeEmpresa + ", agencia=" + agencia + '}';
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javas.saraiva.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import javas.saraiva.constantes.StatusVeiculo;

/**
 *
 * @author wesle
 */
public class Veiculo {

    private String nomeMarca;
    private String cor;
    private int anoFabri;
    private double kmRodados;

    private List<Empresa> empresa = new ArrayList<Empresa>();

    public String getNomeMarca() {
        return nomeMarca;
    }

    public void setNomeMarca(String nomeMarca) {
        this.nomeMarca = nomeMarca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAnoFabri() {
        return anoFabri;
    }

    public void setAnoFabri(int anoFabri) {
        this.anoFabri = anoFabri;
    }

    public double getKmRodados() {
        return kmRodados;
    }

    public void setKmRodados(double kmRodados) {
        this.kmRodados = kmRodados;
    }

    public List<Empresa> getEmpresa() {
        return empresa;
    }

    public void setEmpresa(List<Empresa> empresa) {
        this.empresa = empresa;
    }

    public String getSituacaoVeiculo() {
        double sit = this.kmRodados;
        if (sit <= 0) {
            return StatusVeiculo.NOVO;
        } else if (sit > 0 && sit <= 10.000) {
            return StatusVeiculo.SEMINOVO;
        } else {
            return StatusVeiculo.USADO;
        }
    }

    @Override
    public String toString() {
        return "Veiculo{" + "nomeMarca=" + nomeMarca + ", cor=" + cor + ", anoFabri=" + anoFabri + ", kmRodados=" + kmRodados + ", empresa=" + empresa + '}';
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.nomeMarca);
        hash = 37 * hash + Objects.hashCode(this.cor);
        hash = 37 * hash + this.anoFabri;
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.kmRodados) ^ (Double.doubleToLongBits(this.kmRodados) >>> 32));
        hash = 37 * hash + Objects.hashCode(this.empresa);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Veiculo other = (Veiculo) obj;
        if (this.anoFabri != other.anoFabri) {
            return false;
        }
        if (Double.doubleToLongBits(this.kmRodados) != Double.doubleToLongBits(other.kmRodados)) {
            return false;
        }
        if (!Objects.equals(this.nomeMarca, other.nomeMarca)) {
            return false;
        }
        if (!Objects.equals(this.cor, other.cor)) {
            return false;
        }
        if (!Objects.equals(this.empresa, other.empresa)) {
            return false;
        }
        return true;
    }
    
}

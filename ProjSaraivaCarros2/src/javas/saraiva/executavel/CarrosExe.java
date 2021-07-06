/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javas.saraiva.executavel;

import java.util.ArrayList;
import java.util.List;
import javas.saraiva.classes.Empresa;
import javas.saraiva.classes.Veiculo;
import javax.swing.JOptionPane;

/**
 *
 * @author wesle
 */
public class CarrosExe {

    public static void main(String[] args) {

        for (int i = 0; i < 2; i++) {

            Veiculo veiculo = new Veiculo();
            String nomeMarca = JOptionPane.showInputDialog("Digite o modelo do carro");
            String cor = JOptionPane.showInputDialog("Digite a cor do carro");
            int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano do carro"));
            double kmRodados = Double.parseDouble(JOptionPane.showInputDialog("Digite os km rodados do veiculo"));

            veiculo.setNomeMarca(nomeMarca);
            veiculo.setCor(cor);
            veiculo.setAnoFabri(ano);
            veiculo.setKmRodados(kmRodados);

            for (int pos = 1; pos <= 1; pos++) {
                Empresa empresa = new Empresa();

                String nomeEmpresa = JOptionPane.showInputDialog("Digite o nome da empresa");
                String agencia = JOptionPane.showInputDialog("Digite o n de identificacao da agencia");

                empresa.setNomeEmpresa(nomeEmpresa);
                empresa.setAgencia(agencia);

                veiculo.getEmpresa().add(empresa);
            }

            int deseja;
            deseja = JOptionPane.showConfirmDialog(null, "Deseja saber a situacao do modo de uso carro ?");
            if (deseja == 0) {
                System.out.println("Informações do veiculo " + veiculo);
                System.out.println(" Situacao modo de uso do carro: " + veiculo.getSituacaoVeiculo());
            } else if (deseja == 1) {
                System.out.println(veiculo);
            } else {
                System.out.println("Operação finalizada");
            }
        }
    }
}

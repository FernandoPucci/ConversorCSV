package br.com.amil.conversorcsv.controller;

import br.com.amil.conversorcsv.model.Relatorio;
import br.com.amil.conversorcsv.util.RelatorioUtil;
import br.com.amil.conversorcsv.view.Principal;
import java.io.File;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

public class RelatorioController {

    private List<Relatorio> listaRelatorio;
    private Principal tela;

    public RelatorioController(Principal tela) {

        this.tela = tela;

    }

    public List<Relatorio> getListaRelatorios() {

        return this.listaRelatorio;

    }

    public void setListaRelatorio(List<Relatorio> listaRelatorio) {
        this.listaRelatorio = listaRelatorio;
    }

    public void carregaListaRelatorioFromFile(File file) {
        try {

            listaRelatorio = RelatorioUtil.carregarListaRelatorios(file);

            tela.appendLista("Geradas " + listaRelatorio.size() + " linhas.");

        } catch (Exception e) {

            JOptionPane.showMessageDialog(tela, "Erro ", e.getMessage(), JOptionPane.ERROR_MESSAGE);

        }

    }

    public Thread getThreadGerarRelatorio() {
        return new Thread() {

            @Override
            public void run() {
                try {

                    tela.appendLista("Processando Relatorio, aguarde...");
                    tela.habilitaTudo(false);
                    
                    imprimir(listaRelatorio);
                    
                    tela.appendLista("Sucesso!");
                    tela.habilitaTudo(true);
                    JOptionPane.showMessageDialog(tela, "Relatório Salvo", "SUCESSO", JOptionPane.INFORMATION_MESSAGE);

                } catch (Exception ex) {
                    tela.appendLista("Erro: " + ex.getMessage());
                    JOptionPane.showMessageDialog(tela, ex.getMessage(), "Erro ", JOptionPane.ERROR_MESSAGE);

                }
            }

        };

    }

    public void imprimir(List<Relatorio> relatorio) throws Exception {

        if (relatorio == null || relatorio.isEmpty()) {

            throw new Exception("Impossivel gerar relatório, lista nula ou vazia");

        }

        System.out.println(System.getProperty("user.dir"));

        //UTILIZAR EM TEMPO DE DESENVOLVIMENTO
        //JasperReport report = JasperCompileManager.compileReport(System.getProperty("user.dir") + "/src/main/resources/templatePlt2.jrxml");
        
        //UTILIZAR PARA COMPILACAO FINAL MAVEN
        JasperReport report = JasperCompileManager.compileReport(RelatorioController.class.getResourceAsStream("/templatePlt2.jrxml"));
        
        
        JasperPrint print = JasperFillManager.fillReport(report, null, new JRBeanCollectionDataSource(relatorio));

        //TODO: alterar para FileChooser de destino
        JasperExportManager.exportReportToPdfFile(print, "/home/fernando-pucci/Relatorio_de_Clientes.pdf");
    }
}

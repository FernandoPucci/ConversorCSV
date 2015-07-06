package br.com.amil.conversorcsv.controller;

import br.com.amil.conversorcsv.model.Relatorio;
import br.com.amil.conversorcsv.util.RelatorioUtil;
import br.com.amil.conversorcsv.view.Principal;
import java.io.File;
import java.util.List;
import javax.swing.JOptionPane;

public class RelatorioController {

    private List<Relatorio> listaRelatorio;
    private Principal tela;
    
    public RelatorioController(Principal tela) {

        this.tela= tela; 
        
    }

    public List<Relatorio> getListaRelatorios() {

        return this.listaRelatorio;

    }

    public void carregaListaRelatorio(File file) {
        try {

            listaRelatorio = RelatorioUtil.carregarListaRelatorios(file);
            
            tela.appendLista("Geradas " + listaRelatorio.size() + " linhas.");
            

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Erro ", e.getMessage(), JOptionPane.ERROR_MESSAGE);

        }

    }

//    public Thread getThreadGerarRelatorio() {
//        return new Thread() {
//            
//            @Override
//            public void run() {
//
//                try{
//                
//                listaRelatorio = RelatorioUtil.carregarListaRelatorios(file);
//                
//                }catch(Exception e){
//                
//                     JOptionPane.showMessageDialog(null, "Erro ", e.getMessage(), JOptionPane.ERROR_MESSAGE);
//
//                
//                }
//                
//            }
//
//        };
//    }
}

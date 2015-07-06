package br.com.amil.conversorcsv.tests;

import br.com.amil.conversorcsv.model.Relatorio;
import br.com.amil.conversorcsv.util.RelatorioUtil;
import br.com.amil.conversorcsv.view.ListaDadosView;

import java.io.File;
import java.util.List;


public class MainTester {

 
    public static void main(String... args) {

        try {
           
             List<Relatorio> relatorios = RelatorioUtil.carregarListaRelatorios(new File("/home/fernando-pucci/ConversorCSV/CSV/720023_145_Amil 120 CE.csv"));
                 
//             for(Relatorio r : relatorios){
//             
//                 System.out.println(r.toString());
//             
//             }
             
             ListaDadosView ldv =  new ListaDadosView(relatorios);
             ldv.setVisible(true);

            
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            System.out.println("");
            ex.printStackTrace();

        }

    }
  
}

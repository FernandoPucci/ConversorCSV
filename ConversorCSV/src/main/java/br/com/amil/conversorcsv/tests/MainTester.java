package br.com.amil.conversorcsv.tests;

import br.com.amil.conversorcsv.model.Relatorio;
import br.com.amil.conversorcsv.util.RelatorioUtil;
import br.com.amil.conversorcsv.view.ListaDadosView;

import java.io.File;
import java.util.List;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;


public class MainTester {

 
    public static void main(String... args) {

        try {
           
             List<Relatorio> relatorios = RelatorioUtil.carregarListaRelatorios(new File("/home/fernando-pucci/ConversorCSV/CSV/720023_145_Amil 120 CE.csv"));
            MainTester mc = new MainTester();     
            mc.imprimir(relatorios);
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
    
    	public void imprimir(List<Relatorio> clientes) throws Exception	
	{
            

            String caminho =this.getClass().getClassLoader().getResource("").getPath(); 
          
            
            System.out.println(System.getProperty("user.dir"));
		JasperReport report = JasperCompileManager.compileReport(System.getProperty("user.dir")+"/src/main/java/br/com/amil/conversorcsv/reports/templatePlt2.jrxml");
		
		JasperPrint print = JasperFillManager.fillReport(report, null, new JRBeanCollectionDataSource(clientes));
 
		JasperExportManager.exportReportToPdfFile(print, "/home/fernandopucci/Relatorio_de_Clientes.pdf");		
	}
  
}

package br.com.amil.conversorcsv.util;

import br.com.amil.conversorcsv.model.Relatorio;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;
import org.jsefa.Deserializer;
import org.jsefa.common.lowlevel.filter.HeaderAndFooterFilter;
import org.jsefa.csv.CsvIOFactory;
import org.jsefa.csv.config.CsvConfiguration;

public class RelatorioUtil {

    public static List<Relatorio> carregarListaRelatorios(File file) throws Exception {

        List<Relatorio> listaSaida = null;

        try {

            CsvConfiguration config = new CsvConfiguration();

            //configura cabeçalho do arquivo
            config.setLineFilter(new HeaderAndFooterFilter(1, false, true));

            Deserializer deserializer = CsvIOFactory.createFactory(config, Relatorio.class).createDeserializer();

            InputStream in = new FileInputStream(file.getAbsolutePath());

            Reader reader = new InputStreamReader(in, Constantes.CHARSET);

            deserializer.open(reader);

            listaSaida = new ArrayList<>();

            while (deserializer.hasNext()) {
                
                listaSaida.add((Relatorio) deserializer.next());

            }

            deserializer.close(true);

        } catch (IOException ex) {

            throw new Exception("Erro ao acessar o Arquivo: " + file.getAbsolutePath(), ex);

        }

        return listaSaida;

    }

}

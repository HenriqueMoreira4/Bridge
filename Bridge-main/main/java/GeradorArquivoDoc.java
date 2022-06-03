import java.io.FileNotFoundException;
import java.io.PrintStream;

import bridge.interfaces.GeradorDeArquivo;

public class GeradorArquivoDoc implements GeradorDeArquivo {

    @Override
    public String criarArquivo(String dados) {
        try {
            PrintStream arquivo = new PrintStream("teste.doc");
            arquivo.println(dados);
            arquivo.close();
            return "Arquivo Gerado com Sucesso";
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        return dados;
    }
}
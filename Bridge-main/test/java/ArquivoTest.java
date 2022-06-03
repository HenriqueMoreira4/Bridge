import org.junit.Test;
import static org.junit.Assert.assertEquals;


class ArquivoTest {

    @Test
    void test() {
        bridge.classes.GeradorArquivoDoc arquivoDoc = new bridge.classes.GeradorArquivoDoc();
        classes.Recibo reciboAbril = new classes.Recibo("XX", "Aluizio Junior", 50.00, arquivoDoc);
        assertEquals("Arquivo Gerado com Sucesso",reciboAbril.geraArquivo());
    }

}


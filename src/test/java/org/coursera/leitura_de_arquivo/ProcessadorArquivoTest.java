package org.coursera.leitura_de_arquivo;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Map;

public class ProcessadorArquivoTest {

    @Test
    public void testProcessarArquivoValido() throws LeituraArquivoException {
        String nomeArquivo = "./src/test/java/org/coursera/leitura_de_arquivo/arquivo_valido.txt";
        // Certificando-se de que esse arquivo existe e tem o conteúdo correto
        Map<String, String> resultado = ProcessadorArquivo.processar(nomeArquivo);

        assertEquals("Eduardo", resultado.get("nome"));
        assertEquals("Guerra", resultado.get("sobrenome"));
        assertEquals("35", resultado.get("idade"));
    }

    @Test
    public void testArquivoVazio() {
        String nomeArquivo = "./src/test/java/org/coursera/leitura_de_arquivo/arquivo_vazio.txt";
        // Certificando-se de que esse arquivo existe e está vazio

        try {
            ProcessadorArquivo.processar(nomeArquivo);
            fail("Deveria ter lançado LeituraArquivoException");
        } catch (LeituraArquivoException e) {
            assertEquals("Arquivo vazio", e.getMessage());
        }
    }

    @Test
    public void testFormatoInvalido() {
        String nomeArquivo = "./src/test/java/org/coursera/leitura_de_arquivo/arquivo_formato_invalido.txt";
        // Certificando-se de que esse arquivo existe e tem um formato inválido

        try {
            ProcessadorArquivo.processar(nomeArquivo);
            fail("Deveria ter lançado LeituraArquivoException");
        } catch (LeituraArquivoException e) {
            assertEquals("Formato de arquivo inválido", e.getMessage());
        }
    }

    @Test
    public void testErroAoAbrirArquivo() {
        String nomeArquivo = "./src/test/java/org/coursera/leitura_de_arquivo/arquivo_inexistente.txt";

        try {
            ProcessadorArquivo.processar(nomeArquivo);
            fail("Deveria ter lançado LeituraArquivoException");
        } catch (LeituraArquivoException e) {
            assertTrue(e.getMessage().startsWith("Erro ao abrir o arquivo"));
        }
    }
}


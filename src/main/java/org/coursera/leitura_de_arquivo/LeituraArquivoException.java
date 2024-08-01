package org.coursera.leitura_de_arquivo;

@SuppressWarnings("serial")
public class LeituraArquivoException extends Exception {
    public LeituraArquivoException(String message) {
        super(message);
    }

    public LeituraArquivoException(String message, Throwable cause) {
        super(message, cause);
    }
}


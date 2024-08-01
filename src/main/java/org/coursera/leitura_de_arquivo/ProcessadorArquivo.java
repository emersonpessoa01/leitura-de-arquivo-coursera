package org.coursera.leitura_de_arquivo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ProcessadorArquivo {

	public static Map<String, String> processar(String nomeArquivo) throws LeituraArquivoException {
		File file = new File(nomeArquivo);
		Map<String, String> mapa = new HashMap<>();

		try (Scanner sc = new Scanner(file)) {
			if (!sc.hasNextLine()) {
				throw new LeituraArquivoException("Arquivo vazio");
			}

			while (sc.hasNextLine()) {
				String linha = sc.nextLine();
				String[] partes = linha.split("->");

				if (partes.length != 2) {
					throw new LeituraArquivoException("Formato de arquivo inválido");
				}

				mapa.put(partes[0], partes[1]);
			}
		} catch (FileNotFoundException e) {
			throw new LeituraArquivoException("Erro ao abrir o arquivo", e);
		}

		return mapa;
	}
}

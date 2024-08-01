<h1 align="left">Praticar tarefa avaliada por colega: Exceções para Ler um Arquivo</h1>

<div>
    <p>Deve ser criada a classe ProcessadorArquivo que possui o método estático processar(). Esse método recebe uma String com o nome de um arquivo e retorna um Map com as informações. O formato do arquivo deve ser o seguinte:</p>
    <pre>
        <code>
        1   nome->Eduardo
        2   sobrenome->Guerra
        3   idade->35
        </code>
    </pre>
    <p>O mapa retornado deve possuir como chave o texto a esquerda de "->" (como "nome") e como valor o texto a direita (como "Eduardo"). Se não sabe como ler os dados do arquivo, veja a dica de como ler cada linha com a classe Scanner. Depois processe as linhas para encontrar os valores (dê uma olhada no método split() da classe String).</p>
    <p>Crie uma exceção chamada LeituraArquivoException que deve ser lançada pelo método processar(). Segue os casos em que essa exceção deve ser lançada com a respectiva mensagem de erro:</p>
    <ul>
        <li>Caso de ocorrer algum erro na leitura do arquivo (uma IOException): você deve capturar essa exceção e lançar uma LeituraArquivoException com "Erro ao abrir o arquivo" + a mensagem da exceção original</li>
        <li>Caso o arquivo esteja vazio: "Arquivo vazio"</li>
        <li>Caso uma linha tenha mais de um "->" em uma linha, ou não tenha nenhum: "Formato de arquivo inválido"</li>
    </ul>
    <p>Devem ser criados testes, mostrando tanto o caso em que o arquivo é lido com sucesso, quanto os casos em que ocorre um erro. Nos testes, você deve verificar se a mensagem do erro está correta.</p>
    <details>
        <summary>Visão geral dos critérios de avaliação
        </summary>
        <p>Serão verificados se os itens pedidos no enunciado foram cumpridos. Procure entregar um código organizado pois isso também será avaliado. 
        </p>
    </details>
    <details>
        <summary>Usando a class Scanner para ler as linhas de um arquivo
        </summary>
        <p>A classe Scanner pode ser utilizada para ler um arquivo linha a linha. Segue um exemplo de como isso pode ser feito:
        </p>
        <pre>
            <code>
            1   File file = new File("arquivo.txt");
            2   Scanner sc = new Scanner(file);
            3   while (sc.hasNextLine())
            4   String s = sc.nextLine();
            5   //trabalha com os dados da linha
        </code>
    </pre>
    </details>
</div>

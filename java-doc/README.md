# Documentação

Uma das maiores características da linguagem Java é que, desde suas primeiras versões, tínhamos em nossas mãos, uma documentação rica e detalhada dos recursos da linguagem.

Conforme site oficial, podemos compreender e explorar, todos os recursos organizados por pacotes e classes bem específicas, sem nem mesmo escrever uma linha de código.

Hoje, costuma-se afirmar que, para se tornar um desenvolvedor nível avançado, é um requisito imprescindível adquirir a habilidade de compreender, a documentação oficial da linguagem e dos frameworks que são incorporados nos projetos atuais.

Aqui, temos o link da documentação de uma das principais classes da linguagem Java:

[Documentação Java Platform](https://docs.oracle.com/javase/7/docs/api/java/lang/String.html)

# Tags

Mas e quais as informações, que obtemos através de classes documentadas, na linguagem ? Java Documentation é composto por tags que, representam dados relevantes para a compreensão da proposta de uma classe e os conjuntos de seus métodos e atributos conforme tabela abaixo:

| Tag | Descrição |
| --- | --- |
| @autor | Autor / Criador |
| @version | Versão do recurso disponibilizados |
| @since | Versão / Data de início da disponibilização do recurso |
| @param | Descrição dos parâmetros dos métodos criados|
| @return | Definição do tipo de retorno de um método |
| @throws | Se o método lança alguma exceção |

Vou ilustrar a classe Calculadora com um exemplo de documentação, destacando as tags mais utilizadas: 

Codigo em Cauculadora.Java

# Tipos de Comentários

Código em Comentários.Java

# Java Doc

Javadoc é um gerador de documentação criado pela Sun Microsystems , para documentar a API dos programas em Java, a partir do código-fonte. O resultado é expresso em HTML. É constituído, basicamente, por algumas marcações muitos simples, inseridas nos comentários do programa.

Este sistema, é o padrão de documentação de classes em Java, onde muitas das IDEs desta linguagem irão automaticamente gerar um Javadoc em HTML.

Criando nossa documentação no formato html, para disponibilizar via web.

No terminal execute o comando abaixo

`javadoc -encoding UTF-8 -docencoding ISO-8859-1  -d ../docs  src/*.java`
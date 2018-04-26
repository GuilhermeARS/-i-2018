### 1) Quais são os valores (“literais”) admitidos em JSON? Não confunda com aqueles escritos entre aspas (sequências de caracteres).
Number, string, boolean e null

### 2) Qual é o MIME type para arquivo contendo dados no formato JSON?
application/json

### 3) Você consegue identificar o problema no arquivo JSON abaixo?
<pre>
{	"a":[1,3], 
	"bool": true,
	"null": nil,
	"n":123,
	"o":{"a":"b","c":"d" },
	"str":"a"
}
</pre>
**Nil** não é um valor literal, portanto, é esperado que se esteja entre aspas

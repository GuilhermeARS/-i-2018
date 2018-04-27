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
 
 ### 4) Qual seria um possível arquivo JSON contendo dados correspondentes a uma instância de um objeto da classe Bicycle?
<pre>
{	"gear":3, 
	"cadence": 6,
	"speed": 18,
} </pre>


### 5) Qual seria a representação em JSON de um objeto contendo as seguintes propriedades
<pre>
{	"cidades":["Goiânia,"Trindade"], 
	"salada": "alface",
	"altura": [2,3],
	"sabor": null,
} </pre>


<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Categoria - Cadastro</title>
</head>
<body>
    <h1>Cadastro de Categoria</h1>
    <form action="/vendas-1/categoria" method="post">
        <!-- method="post" para alterar na URL (para n sair as informações adicionadas), se n colocar vai por get -->
		<!-- o name deve ser igual ao parametro do servlet-->
        nome: <input type="text" name="nome" id="nome"><br />
        descricao: <input type="text" name="descricao" id="descricao"><br />
        <input type="submit" value="Salvar">
    </form>
</body>
	
</html>
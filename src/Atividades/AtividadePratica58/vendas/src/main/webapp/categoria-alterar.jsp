<%@ page import="com.natyprys.vendas.models.Categoria" %>

<%
    Categoria model = (Categoria)request.getAttribute("model");
%>


<!DOCTYPE html>
<html lang="pt-BR">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Categoria - Alterando</title>
    <link rel="stylesheet" type="text/css" href="css/styles.css">

</head>
<body>
    <h1>Categoria -  Alterando</h1>
    <form action="/vendas-1/categoria/listar" method="post">
        id: <input type="text" name="id" id="id" value="<%= model.getId() %>"> <br />
        nome: <input type="text" name="nome" id="nome" value="<%= model.getNome() %>"> <br />
        descricao: <input type="text" name="descricao" id="descricao" value="<%= model.getDescricao() %>"> <br />
        <input type="submit" value="Alterar">
    </form>
</body>
</html>
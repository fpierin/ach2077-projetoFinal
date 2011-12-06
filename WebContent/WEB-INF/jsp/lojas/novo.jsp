<form id="lojasForm" action="<c:url value="/lojas/adiciona"/>"	method="POST">
	<fieldset>
		<legend>Nova loja</legend>
		<label for="nome">Nome:</label> <input id="nome" class="required"
			minlength="3" type="text" name="loja.nome"
			value="${loja.nome}" />
		<label for="url">URL:</label> <input id="url" class="required"
			minlength="3" type="text" name="loja.url"
			value="${loja.url}" />			 
		<button type="submit">Enviar</button>
	</fieldset>
</form>

<script type="text/javascript">
	$('#lojasForm').validate();
</script>
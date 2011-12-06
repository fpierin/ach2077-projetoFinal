<div id="centralizador">
	<div id="mostra_loja">
		<img src="<c:url value="/lojas/${loja.id}/logo"/>" />
	</div>
	<div id="detalhes">
		<div>
			<span><strong>Loja: </strong>${loja.nome}</span>
		</div>
		<div>
			<span><strong>Categoria: </strong> ${loja.categoria.nome}</span>
		</div>
		<div>
			<span><strong>Website: </strong><a href="${loja.url}" target="_blank">${loja.url}</a></span>
		</div>
	</div>
	<div id="divisor">
		<hr>
		<br>
	</div>
	<div id="localizacao">
		<div>
			<span>Localização do estabelecimento</span>
		</div>
		<div>
			<img src="<c:url value="/lojas/${loja.id}/mapa"/>" />
		</div>
	</div>
	<div id="divisor">
		<hr>
		<br>
	</div>
</div>
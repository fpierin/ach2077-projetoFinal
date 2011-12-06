<div id="centralizador">
	<div><span>Resultados da busca por: <b>"${nome}"</b></span></div>
	<div>
	<ul>
	<c:forEach items="${lojas}" var="loja">
		<li><a href='<c:url value="/lojas/${loja.id}"/>'>${loja.nome}</a></li>
	</c:forEach>
</ul>
	</div>
</div>
<div id="centralizador">
	<div>
		<ul class="lojas">
			<c:forEach items="${lojas}" var="loja">
				<li>
					<div class="loja">
						<img src="<c:url value="/lojas/${loja.id}/logo"/>" />
					</div>
				</li>
			</c:forEach>
		</ul>
	</div>
	<div id="divisor">
		<br> <br>
		<hr>
		<br>
	</div>
	<div id="conteudo">
		<div id="esquerda">
			<span>Todas as lojas</span>
			<ul>
				<c:forEach items="${lojas}" var="loja">
					<li><a href='<c:url value="/lojas/${loja.id}"/>'>${loja.nome}</a></li>
				</c:forEach>
			</ul>
		</div>
		<div id="direita">
			<c:forEach items="${categorias}" var="categoria">
				<span class="titulo_conteudo">${categoria.nome}</span>
				<ul>
					<c:forEach items="${lojas}" var="loja">
						<c:if test="${loja.categoria.id eq categoria.id}">
							<li><a href='<c:url value="/lojas/${loja.id}"/>'>${loja.nome}</a></li>
						</c:if>
					</c:forEach>
				</ul>
			</c:forEach>
		</div>
	</div>
	<div id="divisor">
		<hr>
		<br>
	</div>
	<div id="localizador">
		<div>
			<span>Mapa do centro comercial</span>
		</div>
		<div>
			<img src="<c:url value="/images/mapa.jpg"/>" />
		</div>
	</div>
	<div id="divisor">
		<hr>
	</div>
</div>
</div>


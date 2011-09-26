<%@ include file="/WEB-INF/jspf/topo.jspf"%>

<div id="publicidade">
	
</div>

<div id="corpo">
	<div class="centralizador">
		<div class="conteudo">
			<span class="titulo_conteudo">Labore omittantur eos</span>
			<ul>
				<c:forEach items="${lojasEmOrdemAlfabetica}" var="loja">
					<li>${loja.nome}</li>
				</c:forEach>
			</ul>
		</div>
		<div class="conteudo">
			<span class="titulo_conteudo">Lorem ipsum dolor</span>
			<ul>
				<c:forEach items="${lojasPorRamoDeAtividade}" var="loja">
					<li>${loja.nome}</li>
				</c:forEach>
			</ul>
		</div>
		<div class="clear"></div>
	</div>
</div>

<%@ include file="/WEB-INF/jspf/rodape.jspf"%>

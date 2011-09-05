<%@ include file="/WEB-INF/jspf/header.jspf"%>

<script>
	$(function() {
		$('#slides').slides({
			preload : true,
			preloadImage : 'images/loading.gif',
			play : 5000,
			pause : 2500,
			hoverPause : true
		});
	});
</script>

<div id="publicidade">
	<div id="example">
		<div id="slides">
			<div class="slides_container">
				<a href="http://www.flickr.com/photos/jliba/4665625073/"
					title="145.365 - Happy Bokeh Thursday! | Flickr - Photo Sharing!"
					target="_blank"><img
					src="http://slidesjs.com/examples/standard/img/slide-1.jpg"
					width="570" height="270" alt="Slide 1">
				</a> <a href="http://www.flickr.com/photos/stephangeyer/3020487807/"
					title="Taxi | Flickr - Photo Sharing!" target="_blank"><img
					src="http://slidesjs.com/examples/standard/img/slide-2.jpg"
					width="570" height="270" alt="Slide 2">
				</a> <a href="http://www.flickr.com/photos/childofwar/2984345060/"
					title="Happy Bokeh raining Day | Flickr - Photo Sharing!"
					target="_blank"><img
					src="http://slidesjs.com/examples/standard/img/slide-3.jpg"
					width="570" height="270" alt="Slide 3">
				</a> <a href="http://www.flickr.com/photos/b-tal/117037943/"
					title="We Eat Light | Flickr - Photo Sharing!" target="_blank"><img
					src="http://slidesjs.com/examples/standard/img/slide-4.jpg"
					width="570" height="270" alt="Slide 4">
				</a> <a href="http://www.flickr.com/photos/bu7amd/3447416780/"
					title="âI must go down to the sea again, to the lonely sea and the sky; and all I ask is a tall ship and a star to steer her by.â | Flickr - Photo Sharing!"
					target="_blank"><img
					src="http://slidesjs.com/examples/standard/img/slide-5.jpg"
					width="570" height="270" alt="Slide 5">
				</a> <a href="http://www.flickr.com/photos/streetpreacher/2078765853/"
					title="twelve.inch | Flickr - Photo Sharing!" target="_blank"><img
					src="http://slidesjs.com/examples/standard/img/slide-6.jpg"
					width="570" height="270" alt="Slide 6">
				</a> <a href="http://www.flickr.com/photos/aftab/3152515428/"
					title="Save my love for loneliness | Flickr - Photo Sharing!"
					target="_blank"><img
					src="http://slidesjs.com/examples/standard/img/slide-7.jpg"
					width="570" height="270" alt="Slide 7">
				</a>
			</div>
			<a href="#" class="prev"><img src="<c:url value="/images/arrow-prev.png"/>"
				width="24" height="43" alt="Arrow Prev">
			</a> <a href="#" class="next"><img src="<c:url value="/images/arrow-next.png"/>"
				width="24" height="43" alt="Arrow Next">
			</a>
		</div>
	</div>
</div>
<div id="corpo">
	<div class="example">
		<div class="conteudo">
			<span class="titulo_conteudo">Lojas em ordem alfab&eacute;tica</span>
			<ul>
				<c:forEach items="${lojasEmOrdemAlfabetica}" var="loja">
					<li>${loja.nome}</li>
				</c:forEach>
			</ul>
		</div>
		<div class="conteudo">
			<span class="titulo_conteudo">Lojas por ramo de atividade</span>
			<ul>
				<c:forEach items="${lojasPorRamoDeAtividade}" var="loja">
					<li>${loja.nome}</li>
				</c:forEach>
			</ul>
		</div>
		<div class="clear"></div>
	</div>
</div>

<%@ include file="/WEB-INF/jspf/footer.jspf"%>

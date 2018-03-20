<%@ page trimDirectiveWhitespaces="true"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="format" tagdir="/WEB-INF/tags/shared/format"%>
<%@ taglib prefix="product" tagdir="/WEB-INF/tags/responsive/product"%>
<%@ taglib prefix="component" tagdir="/WEB-INF/tags/shared/component"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="sec"
	uri="http://www.springframework.org/security/tags"%>

<spring:htmlEscape defaultHtmlEscape="true" />

<c:choose>
	<c:when test="${not empty productData}">
		<div class="wishlist__component">
			<%-- <div class="carousel__component--headline">${fn:escapeXml(title)}</div> --%>

			<div
				class="carousel__component--carousel js-owl-carousel js-owl-default">
				<c:forEach items="${productData}" var="product">

					<c:url value="${product.url}" var="productUrl" />

					<div class="carousel__item">
						<sec:authorize access="!hasAnyRole('ROLE_ANONYMOUS')">
							<button onclick="sendData(this,'${product.code}')"
								class="wishlistcomponentbutton">
								<span class="glyphicon glyphicon-heart "> </span>
							</button>
							<script src="jquery-3.3.1.min.js"></script>
							<script type="text/javascript"
								src="${commonResourcePath}/js/customJS.js"></script>
						</sec:authorize>
						<a href="${productUrl}">
							<div class="carousel__item--thumb">
								<product:productPrimaryImage product="${product}"
									format="product" />
							</div>
							<div class="carousel__item--name">${fn:escapeXml(product.name)}</div>
							<div class="carousel__item--code prodId">${fn:escapeXml(product.code)}</div>
							<div class="carousel__item--price">
								<format:fromPrice priceData="${product.price}" />
							</div>
						</a>
					</div>
				</c:forEach>
			</div>


		</div>
	</c:when>

	<c:otherwise>
		<component:emptyComponent />
	</c:otherwise>
</c:choose>
<script type="text/javascript">
window.onload=function(){
checkproduct();
}
</script>

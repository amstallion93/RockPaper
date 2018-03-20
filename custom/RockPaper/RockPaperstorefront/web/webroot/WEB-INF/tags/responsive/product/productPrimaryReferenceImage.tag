<%@ tag body-content="empty" trimDirectiveWhitespaces="true"%>
<%@ attribute name="product" required="true"
	type="de.hybris.platform.commercefacades.product.data.ProductData"%>
<%@ attribute name="format" required="true" type="java.lang.String"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="theme" tagdir="/WEB-INF/tags/shared/theme"%>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags"%>

<%-- <script type="text/javascript"
	src="${commonResourcePath}/js/customJS.js"></script> --%>
	

<c:set value="${ycommerce:productImage(product, format)}"
	var="primaryImage" />
<c:url value="${product.url}" var="productUrl" />
<c:choose>
	<c:when test="${not empty primaryImage}">

		<!-- <button onclick="sendData(this)" class="wishlistcomponentbutton">
			<span class="glyphicon glyphicon-heart "></span>
		</button>
 -->
		<c:choose>
			<c:when test="${not empty primaryImage.altText}">
				<img class="item lazyOwl" data-src="${primaryImage.url}"
					alt="${fn:escapeXml(primaryImage.altText)}"
					title="${fn:escapeXml(primaryImage.altText)}">
			</c:when>
			<c:otherwise>
				<img class="lazyOwl item" data-src="${primaryImage.url}"
					alt="${fn:escapeXml(product.name)}"
					title="${fn:escapeXml(product.name)}" />
			</c:otherwise>
		</c:choose>
	</c:when>
	<c:otherwise>

	<!-- 	<button onclick="sendData(this)" class="wishlistcomponentbutton">
			<span class="glyphicon glyphicon-heart "></span>
		</button>
 -->
		<theme:image code="img.missingProductImage.responsive.${format}"
			alt="${fn:escapeXml(product.name)}"
			title="${fn:escapeXml(product.name)}" />
	</c:otherwise>
</c:choose>
<%@ tag body-content="empty" trimDirectiveWhitespaces="true"%>
<%@ attribute name="product" required="true" type="de.hybris.platform.commercefacades.product.data.ProductData"%>
<%@ attribute name="format" required="true" type="java.lang.String"%>
<%@ attribute name="asDataAttribute" required="false" type="java.lang.Boolean"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="theme" tagdir="/WEB-INF/tags/shared/theme"%>
<%@ taglib prefix="ycommerce" uri="http://hybris.com/tld/ycommercetags"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="template" tagdir="/WEB-INF/tags/responsive/template" %>

<%-- <script type="text/javascript"
	src="${commonResourcePath}/js/customJS.js">
	
</script> --%>

<c:set value="${ycommerce:productImage(product, format)}"
	var="primaryImage" />

<c:set value="${fn:escapeXml(product.name)}" var="productName" />
<c:if test="${asDataAttribute}">
	<c:set value="${fn:escapeXml(productName)}" var="productName" />
</c:if>

<c:choose>
	<c:when test="${not empty primaryImage}">
		<c:url value="${primaryImage.url}" var="primaryImageUrl"
			context="${originalContextPath}" />

		<!-- <button onclick="sendData(this)" class="wishlistcomponentbutton">
			<span class="glyphicon glyphicon-heart "></span>
		</button>
		 --><c:choose>
			<c:when test="${not empty primaryImage.altText}">
				<c:set value="${fn:escapeXml(primaryImage.altText)}" var="altText" />
				<c:if test="${asDataAttribute}">
					<c:set value="${fn:escapeXml(altText)}" var="altText" />
				</c:if>
				<img src="${primaryImageUrl}" alt="${altText}" title="${altText}" />
			</c:when>
			<c:otherwise>
				<img src="${primaryImageUrl}" alt="${productName}"
					title="${productName}" />
			</c:otherwise>
		</c:choose>
	</c:when>
	<c:otherwise>

<!-- 		<button onclick="sendData(this)" class="wishlistcomponentbutton">
			<span class="glyphicon glyphicon-heart "></span>
		</button>
 -->
		<theme:image code="img.missingProductImage.responsive.${format}"
			alt="${productName}" title="${productName}" />
	</c:otherwise>
</c:choose>

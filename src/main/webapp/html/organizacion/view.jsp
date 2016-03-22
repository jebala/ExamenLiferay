
<%@page import="sun.misc.Request"%>
<%@page import="java.util.List"%>
<%@page import="com.ejemplo.Usuario"%>
<%@page import="java.util.ArrayList"%>
<%@taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<portlet:defineObjects />

<portlet:resourceURL var="urlListadoPersonas"/>



<aui:row>
	<aui:column>
		ID
	</aui:column>
	<aui:column>
		NOMBRE
	</aui:column>
</aui:row>

<c:forEach items="${usuarios}" var="usuarios">

<aui:row>
	<aui:column>
		${usuarios.userId}
	</aui:column>
	<aui:column>
		${usuarios.firstName}
	</aui:column>
</aui:row>



</c:forEach>


<!-- This jsp used to be like this with initial project set up
<html>
  <head><title>Hello :: Spring Application</title></head>
  <body>
    <h1>Hello - Spring Application</h1>
    <p>Greetings.</p>
    <a href="test.htm">click me to test
    
    </a>
  </body>
</html>-->

<%@ include file="/WEB-INF/jsp/include.jsp" %> 
<html>
  <head><title><fmt:message key="title"/></title></head>
  <body>
   
      <h1><fmt:message key="heading"/></h1>
    
      <p><fmt:message key="greeting"/> 
      <c:out value="${model.now}"/></p>
    
<h3>Products</h3>

<c:forEach items="${model.products}" var="prod">

    <c:out value="${prod.description}"/> <i>$<c:out value="${prod.price}"/></i><br><br>
    
</c:forEach>
    
 <a href="<c:url value="priceincrease.htm"/>">Increase Prices</a>

</body>
</html>
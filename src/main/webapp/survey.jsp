<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <title>Survey Result</title>
  <link rel="stylesheet" href="styles/main.css"/>
</head>
<body>
  <h1>Thanks for taking our survey!</h1>
  <p>Here is the information that you entered:</p>

  <div class="info">
    <p><label>Email:</label><span>${user.email}</span></p>
    <p><label>First Name:</label><span>${user.firstName}</span></p>
    <p><label>Last Name:</label><span>${user.lastName}</span></p>
    <p><label>Heard From:</label><span>${user.heardFrom}</span></p>
    <p><label>Updates:</label><span><c:out value="${user.updates ? 'Yes' : 'No'}"/></span></p>

    <!-- Chỉ hiện "Contact Via" nếu user muốn nhận updates -->
    <c:if test="${user.updates}">
      <p><label>Contact Via:</label><span>${user.contactVia}</span></p>
    </c:if>
  </div>

  <form action="index.html" method="get">
    <input type="submit" value="Return">
  </form>
</body>
</html>

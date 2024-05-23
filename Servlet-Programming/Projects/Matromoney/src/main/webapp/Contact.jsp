<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html lang="en">

<head>
       <%@ include file="HeaderLinks.jsp" %>
       <title>Contact</title>
       <style>
             label {
               font-weight: bold;
             }

             .formContainer {
               width: 50%;
               /* border: 1px solid red; */
               padding: 20px;
             }

             .error {
               display: flex;
               align-items: center;
               justify-content: center;
               margin-top: 8px;
               color: red;
             }
           </style>
</head>
<body>
        <%@ include file="Header.jsp" %>

        <div class="container d-flex justify-content-center mt-3" >

              <c:choose>
                    <c:when test="${not empty msg}">
                       <h3 class="text-success"> <c:out value="${msg}" /> </h3>
                    </c:when>
                    <c:otherwise>
                    </c:otherwise>
                </c:choose>
        </div>

        <div class="container">
              <div class="container mt-3 shadow p-3 bg-body rounded formContainer">
                <form action="contact" method="POST">
                  <div class="d-flex justify-content-center">
                    <h2>Contact Page</h2>
                  </div>

                  <div class="mb-3 mt-2">
                    <label for="name" class="form-label">Name</label>
                    <input
                      type="text"
                      class="form-control"
                      minlength="3"
                      maxlength="30"
                      name="name"
                      id="name"
                      onblur="nameValidation()"
                    />
                    <span id="nameError" class="error"></span>
                  </div>

                  <div class="mb-3">
                    <label for="ageField" class="form-label">Email</label>
                    <input
                      type="email"
                      class="form-control"
                      name="email"
                      id="email"
                      onblur="emailValidation()"
                    />
                    <span id="emailError" class="error"></span>
                  </div>

                  <div class="mb-3">
                    <label for="mobile" class="form-label">Mobile</label>
                    <input
                      type="number"
                      maxlength="10"
                      class="form-control"
                      name="mobile"
                      id="mobile"
                      onblur="mobileValidation()"
                    />
                    <span id="mobileError" class="error"></span>
                  </div>

                  <div class="mb-3">
                    <label for="comment" class="form-label">Comment</label>
                    <textarea
                      class="form-control"
                      id="comment"
                      rows="3"
                      maxlength="300"
                      name="comment"
                      onblur="commentValidation()"
                    ></textarea>
                    <span id="commentError" class="error"></span>
                  </div>

                  <div class="d-flex justify-content-center">
                    <button type="submit" class="btn btn-primary" id="submitButton" disabled>Contact</button>
                  </div>
                </form>
              </div>
            </div>

            <script src="contact.js"></script>



</body>
</html>
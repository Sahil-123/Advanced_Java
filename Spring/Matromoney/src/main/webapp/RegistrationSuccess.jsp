<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html lang="en">
<head>
    <%@ include file="HeaderLinks.jsp" %>

    <style>
        label{
            font-weight: bold;
        }

        .formContainer{
            width: 50%;
            /* border: 1px solid red; */
            padding: 20px;
        }


    </style>
</head>
<body>
    <%@ include file="Header.jsp" %>
    <div class="container mt-5 mb-5 shadow p-3 mb-5 bg-body rounded formContainer" >

        <div class="mb-3">
            <h1>Registered Data</h1>
        </div>

        <hr/>

        <div class="mb-3">
                <label for="nameField" class="form-label">Name : </label>
                <span id="nameField"> <c:out value="${data.getName()}"/> </span>
        </div>

        <div class="mb-3">
                <label for="nameField" class="form-label">Age : </label>
                <span id="nameField"> <c:out value="${data.getAge()}"/> </span>
        </div>

        <div class="mb-3">
                <label for="nameField" class="form-label">Gender : </label>
                <span id="nameField"> <c:out value="${data.getGender()}"/> </span>
        </div>

        <div class="mb-3">
                <label for="nameField" class="form-label">Marital Status : </label>
                <span id="nameField"> <c:out value="${data.getMaritalStatus()}"/> </span>
        </div>

        <div class="mb-3">
                <label for="nameField" class="form-label">Religion : </label>
                <span id="nameField"> <c:out value="${data.getReligion()}"/> </span>
        </div>

        <div class="mb-3">
                <label for="nameField" class="form-label">Job : </label>
                <span id="nameField"> <c:out value="${data.getJob()}"/> </span>
        </div>

        <div class="mb-3">
                <label for="nameField" class="form-label">Looking For : </label>
                <span id="nameField"> <c:out value="${data.getLookingFor()}"/> </span>
        </div>
    </div>
</body>
</html>
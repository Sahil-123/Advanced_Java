<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

    <html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <%@ include file="HeaderLink.jsp" %>

        <title>Success page</title>

        <style>
            .formContainer {
                width: 50%;
                /* border: 1px solid red; */
                padding: 20px;
            }
        </style>
    </head>

    <body>

        <%@ include file="Header.jsp" %>

        <div class="container mt-5 mb-5 shadow p-3 mb-5 bg-body rounded formContainer">

            <div class="mb-3">
                <h1 class="text-success">Registered Successfully</h1>
            </div>

            <hr />


            <p>
                We greatly value your feedback and thank you
                <strong><em>
                <c:out value="${data.getName()}" />
                </em>
                </strong>
                for sharing your concerns with us. We are working diligently to make things right.

            <p>


        </div>
    </body>

    </html>
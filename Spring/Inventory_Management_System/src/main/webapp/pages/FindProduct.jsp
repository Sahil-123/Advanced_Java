<%@ include file="../component/TopLinks.jsp" %>

<!DOCTYPE html>
<html lang="en">

<head>
    <%@ include file="../component/HeaderLink.jsp" %>

    <style>
        label {
            font-weight: bold;
        }

        .formContainer {
            width: 50%;
            padding: 20px;
        }

        .error {
            display: flex;
            align-items: center;
            justify-content: center;
            margin-top: 8px;
            color: red;
        }

        .compulsary {
            color: red;
        }
    </style>

    <title>Item Registration</title>
</head>

<body>

    <%@ include file="../component/Header.jsp" %>

    <div class="container mb-3">
        <div class="container mt-3 shadow p-3 bg-body rounded formContainer">
            <div class="d-flex justify-content-center">
                <h2>Item Registration</h2>
            </div>
            <br />

            <span class="compulsary">
                <c:forEach items="${errors}" var="objectError">
                    "${objectError.defaultMessage}" <br>
                </c:forEach>

                <h3>${msg}</h3>
            </span>

            <form action="item/save" method="POST">
                <div class="mb-3">
                    <label for="itemId" class="form-label">Item ID</label>
                    <input type="number" class="form-control" name="itemId" id="itemId" value="${dto.itemId}" />
                </div>

                <div class="d-flex justify-content-evenly mt-4">
                    <button type="submit" class="btn btn-primary" id="submitButton">Submit</button>
                    <button type="reset" class="btn btn-secondary">Reset</button>
                </div>
            </form>

            <%-- Display DTO if available --%>
            <c:if test="${dto != null}">
                <div class="mt-3">
                    <h3>DTO Details:</h3>
                    <p><strong>Item ID:</strong> ${dto.itemId}</p>
                    <p><strong>Product Name:</strong> ${dto.name}</p>
                    <p><strong>Description:</strong> ${dto.description}</p>
                    <p><strong>Unit Price:</strong> ${dto.unitPrice}</p>
                    <p><strong>Current Stock:</strong> ${dto.currentStock}</p>
                    <!-- Add more fields here as necessary -->
                </div>
            </c:if>
        </div>
    </div>

</body>

</html>

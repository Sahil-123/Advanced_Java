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

    <title>Product Register</title>
</head>

<body>

    <%@ include file="../component/Header.jsp" %>

    <div class="container mb-3">
        <div class="container mt-3 shadow p-3 bg-body rounded formContainer">
            <div class="d-flex justify-content-center">
                <h2>Product Register</h2>
            </div>
            <br />

            <span class="compulsary">
                <c:forEach items="${errors}" var="objectError">
                    "${objectError.defaultMessage}" <br>
                </c:forEach>

                <h3>${msg}</h3>
            </span>

            <form action="product/save" method="POST">
                <div class="mb-3">
                    <label for="name" class="form-label">Product Name</label>
                    <input type="text" class="form-control" name="name" id="name" value="${dto.name}" />
                </div>

                <div class="mb-3">
                    <label for="description" class="form-label">Description</label>
                    <input type="text" class="form-control" name="description" id="description" value="${dto.description}" />
                </div>

                <div class="mb-3">
                    <label for="unitPrice" class="form-label">Unit Price</label>
                    <input type="number" class="form-control" name="unitPrice" id="unitPrice" step="0.01" value="${dto.unitPrice}" />
                </div>

                <div class="mb-3">
                    <label for="currentStock" class="form-label">Current Stock</label>
                    <input type="number" class="form-control" name="currentStock" id="currentStock" value="${dto.currentStock}" />
                </div>

                <div class="d-flex justify-content-evenly mt-4">
                    <button type="submit" class="btn btn-primary" id="submitButton">Submit</button>
                    <button type="reset" class="btn btn-secondary">Reset</button>
                </div>
            </form>
        </div>
    </div>

</body>

</html>

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

        table {
            border-collapse: collapse;
        }

        table td, .table th {
            padding: 8px;
        }
    </style>

    <title>Item Registration</title>
</head>

<body>

    <%@ include file="../component/Header.jsp" %>

    <div class="container mb-3">
        <div class="container mt-3 shadow p-3 bg-body rounded formContainer">
            <div class="d-flex justify-content-center">
                <h2>Find Item</h2>
            </div>
            <br />

            <span class="compulsary">
                <c:forEach items="${errors}" var="objectError">
                    "${objectError.defaultMessage}" <br>
                </c:forEach>

            </span>

            <div class="d-flex justify-content-center">
                <h4 class="text-danger">${errorMsg}</h4>
                <span class="text-success">
                    <h4>${successMsg}</h4>
                </span>
            </div>


            <form action="product/find" method="GET">
                <div class="mb-3">
                    <label for="itemId" class="form-label">Item ID</label>
                    <input type="number" class="form-control" name="itemId" id="itemId"/>
                </div>

                <div class="d-flex justify-content-evenly mt-4">
                    <button type="submit" class="btn btn-primary" id="submitButton">Submit</button>
                    <button type="reset" class="btn btn-secondary">Reset</button>
                </div>
            </form>

            <%-- Display DTO if available --%>
           <c:if test="${dto != null}">
                <br>
               <div class="mt-3 d-flex flex-column justify-content-center">
                    <div class="mt-3 d-flex justify-content-center">
                        <h4> Product Details </h4>
                    </div>
                     <hr>
                   <table border="0">
                       <tr>
                           <td><strong>Product ID:</strong></td>
                           <td>${dto.productId}</td>
                       </tr>
                       <tr>
                           <td><strong>Product Name:</strong></td>
                           <td>${dto.name}</td>
                       </tr>
                       <tr>
                           <td><strong>Description:</strong></td>
                           <td>${dto.description}</td>
                       </tr>
                       <tr>
                           <td><strong>Unit Price:</strong></td>
                           <td>${dto.unitPrice}</td>
                       </tr>
                       <tr>
                           <td><strong>Current Stock:</strong></td>
                           <td>${dto.currentStock}</td>
                       </tr>
                       <!-- Add more fields here as necessary -->
                   </table>
               </div>
           </c:if>

        </div>
    </div>

</body>

</html>

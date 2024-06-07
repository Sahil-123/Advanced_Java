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
                <h2>Find Products</h2>
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


            <form action="product/currentStock" method="GET">
                <div class="mb-3">
                    <label for="currentStock" class="form-label">Current Stock</label>
                    <input type="number" class="form-control" name="currentStock" id="currentStock"/>
                </div>

                <div class="d-flex justify-content-evenly mt-4">
                    <button type="submit" class="btn btn-primary" id="submitButton">Submit</button>
                    <button type="reset" class="btn btn-secondary">Reset</button>
                </div>
            </form>

            <%-- Display DTO if available --%>
           <c:if test="${list != null}">
                <br>
               <div class="mt-3 d-flex flex-column justify-content-center">
                    <div class="mt-3 d-flex justify-content-center">
                        <h4> Product Details </h4>
                    </div>
                     <hr>
                   <table border="0" class="table">

                        <thead>
                            <tr>
                              <th scope="col"><strong>Product ID</strong></th>
                              <th scope="col"><strong>Product Name</strong></th>
                              <th scope="col"><strong>Description</strong></th>
                              <th scope="col"><strong>Unit Price</strong></th>
                              <th scope="col"><strong>Current Stock</strong></th>
                            </tr>
                          </thead>


                           <c:forEach items="${list}" var="product">
                              <tr>
                                <td>${product.productId} </td>
                                <td>${product.name} </td>
                                <td>${product.description} </td>
                                <td>${product.unitPrice} </td>
                                <td>${product.currentStock} </td>
                              </tr>
                           </c:forEach>

                   </table>
               </div>
           </c:if>

        </div>
    </div>

</body>

</html>

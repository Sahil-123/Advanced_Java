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
                <h2>Apartment Search</h2>
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


            <form action="apartment/findId" method="GET">
                <div class="mb-3">
                    <label for="searchId" class="form-label">Item ID</label>
                    <input type="number" class="form-control" name="searchId" id="searchId"/>
                </div>

                <div class="d-flex justify-content-evenly mt-4">
                    <button type="submit" class="btn btn-primary" id="submitButton">Submit</button>
                    <button type="reset" class="btn btn-secondary">Reset</button>
                </div>
            </form>


           <c:if test="${dto != null}">
               <br>
               <div class="mt-3 d-flex flex-column justify-content-center">
                   <div class="mt-3 d-flex justify-content-center">
                       <h4>Apartment Details</h4>
                   </div>
                   <hr>
                   <table border="0">
                       <tr>
                           <td><strong>ID:</strong></td>
                           <td>${dto.id}</td>
                       </tr>
                       <tr>
                           <td><strong>First Name:</strong></td>
                           <td>${dto.firstName}</td>
                       </tr>
                       <tr>
                           <td><strong>Last Name:</strong></td>
                           <td>${dto.lastName}</td>
                       </tr>
                       <tr>
                           <td><strong>Phone:</strong></td>
                           <td>${dto.phone}</td>
                       </tr>
                       <tr>
                           <td><strong>Email:</strong></td>
                           <td>${dto.email}</td>
                       </tr>
                       <tr>
                           <td><strong>Apartment Size:</strong></td>
                           <td>${dto.apartmentSize}</td>
                       </tr>
                       <tr>
                           <td><strong>Rental Term:</strong></td>
                           <td>${dto.rentalTerm}</td>
                       </tr>
                       <tr>
                           <td><strong>Features:</strong></td>
                           <td>${dto.features}</td>
                       </tr>
                       <tr>
                           <td><strong>Start Date:</strong></td>
                           <td>${dto.startDate}</td>
                       </tr>
                       <tr>
                           <td><strong>Special Request:</strong></td>
                           <td>${dto.specialRequest}</td>
                       </tr>
                   </table>
               </div>
           </c:if>


           <div class=" mt-5 d-flex justify-content-center">

                       <span>
                             <h4>${recordsInfo}</h4>
                       </span>
           </div>

        </div>
    </div>

</body>

</html>

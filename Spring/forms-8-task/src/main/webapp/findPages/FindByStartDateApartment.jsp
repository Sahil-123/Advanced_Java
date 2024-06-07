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

    <title>Apartment Search</title>
</head>

<body>

    <%@ include file="../component/Header.jsp" %>

    <div class="container mb-3">
        <div class="container mt-3 shadow p-3 bg-body rounded formContainer">
            <div class="d-flex justify-content-center">
                <h2>Apartment Search</h2>
            </div>
            <br />

            <div class="d-flex justify-content-center">
                            <h4 class="text-danger">${errorMsg}</h4>
                            <span class="text-success">
                                <h4>${successMsg}</h4>
                            </span>
            </div>

            <!-- Error and success messages display -->
            <span class="compulsary">
                <c:forEach items="${errors}" var="objectError">
                    "${objectError.defaultMessage}" <br>
                </c:forEach>
            </span>

            <form action="apartment/findStartDate" method="GET"> <!-- Change action to the appropriate endpoint -->
                <div class="mb-3">
                    <label for="startDate" class="form-label">Enter Start Date</label>
                    <input type="date" class="form-control" name="startDate" id="startDate"/>
                </div>

                <div class="d-flex justify-content-evenly mt-4">
                    <button type="submit" class="btn btn-primary" id="submitButton">Search</button>
                    <button type="reset" class="btn btn-secondary">Reset</button>
                </div>
            </form>

        </div>

        <c:if test="${list != null}">
            <br>
            <div class="mt-3 d-flex flex-column justify-content-center">
                <div class="mt-3 d-flex justify-content-center">
                    <h4>Apartment Details</h4>
                </div>
                <hr>
                <table border="0" class="table">

                    <thead>
                        <tr>
                            <th scope="col"><strong>First Name</strong></th>
                            <th scope="col"><strong>Last Name</strong></th>
                            <th scope="col"><strong>Phone</strong></th>
                            <th scope="col"><strong>Email</strong></th>
                            <th scope="col"><strong>Apartment Size</strong></th>
                            <th scope="col"><strong>Rental Term</strong></th>
                            <th scope="col"><strong>Features</strong></th>
                            <th scope="col"><strong>Start Date</strong></th>
                            <th scope="col"><strong>Special Request</strong></th>
                        </tr>
                    </thead>

                    <c:forEach items="${list}" var="apartment">
                        <tr>
                            <td>${apartment.firstName} </td>
                            <td>${apartment.lastName} </td>
                            <td>${apartment.phone} </td>
                            <td>${apartment.email} </td>
                            <td>${apartment.apartmentSize} </td>
                            <td>${apartment.rentalTerm} </td>
                            <td>${apartment.features} </td>
                            <td>${apartment.startDate} </td>
                            <td>${apartment.specialRequest} </td>
                        </tr>
                    </c:forEach>

                </table>
            </div>
        </c:if>


        <div class=" mt-5 d-flex justify-content-center">

            <span>
                  <h4>${recordsInfo}</h4>
            </span>
        </div>

    </div>

</body>

</html>

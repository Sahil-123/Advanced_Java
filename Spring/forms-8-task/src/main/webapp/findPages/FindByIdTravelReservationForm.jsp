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

    <title>Travel Reservation</title>
</head>

<body>

    <%@ include file="../component/Header.jsp" %>

    <div class="container mb-3">
        <div class="container mt-3 shadow p-3 bg-body rounded formContainer">
            <div class="d-flex justify-content-center">
                <h2>Travel Reservation Search</h2>
            </div>
            <br />

            <span class="compulsary">
                <h4>${errorMsg}</h4>

                <c:forEach items="${errors}" var="objectError">
                    "${objectError.defaultMessage}" <br>
                </c:forEach>
            </span>

            <form action="travel/findId" method="GET">
                <div class="mb-3">
                    <label for="reservationId" class="form-label">Enter Reservation ID</label>
                    <input type="number" class="form-control" name="reservationId" id="reservationId" minlength="1" maxlength="30" value="${dto.id}" />
                </div>

                <div class="d-flex justify-content-evenly mt-4">
                    <button type="submit" class="btn btn-primary">
                        Submit
                    </button>
                    <button type="reset" class="btn btn-secondary">
                        Reset
                    </button>
                </div>
            </form>

            <div class="mt-5 d-flex justify-content-center">
                <span>
                    <h4>${recordsInfo}</h4>
                </span>
            </div>

            ${dto}

            <c:if test="${dto != null}">
                <div class="mt-3 d-flex flex-column justify-content-center">
                    <div class="mt-3 d-flex justify-content-center">
                        <h4>Travel Reservation Details</h4>
                    </div>
                    <hr>
                    <table border="0">
                        <tr>
                            <td><strong>ID:</strong></td>
                            <td>${dto.id}</td>
                        </tr>
                        <tr>
                            <td><strong>Full Name:</strong></td>
                            <td>${dto.fullName}</td>
                        </tr>
                        <tr>
                            <td><strong>Email Address:</strong></td>
                            <td>${dto.emailAddress}</td>
                        </tr>
                        <tr>
                            <td><strong>Tour Package:</strong></td>
                            <td>${dto.tourPackage}</td>
                        </tr>
                        <tr>
                            <td><strong>Arrival Date:</strong></td>
                            <td>${dto.arrivalDate}</td>
                        </tr>
                        <tr>
                            <td><strong>Number of Persons:</strong></td>
                            <td>${dto.numberOfPersons}</td>
                        </tr>
                        <tr>
                            <td><strong>Amenities:</strong></td>
                            <td>${dto.amenities}</td>
                        </tr>
                        <tr>
                            <td><strong>Terms and Conditions:</strong></td>
                            <td>${dto.termsAndCondition}</td>
                        </tr>
                        <tr>
                            <td><strong>Discount Coupon Code:</strong></td>
                            <td>${dto.discountCouponCode}</td>
                        </tr>
                    </table>
                </div>
            </c:if>
        </div>
    </div>

</body>

</html>

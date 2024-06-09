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

            <form action="travel/findTourPackage" method="GET">
                <div class="mb-3">
                                        <label for="tourPackage" class="form-label">Select Tour Package</label>
                                        <select class="form-select" name="tourPackage" id="tourPackage">
                                            <option value="">Select Package</option>
                                            <option value="Package A" ${dto.tourPackage eq 'Package A' ? 'selected' : '' }>Package A
                                            </option>
                                            <option value="Package B" ${dto.tourPackage eq 'Package B' ? 'selected' : '' }>Package B
                                            </option>
                                            <!-- Add other packages as needed -->
                                        </select>
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

        </div>



        <c:if test="${list != null}">
            <br>
            <div class="mt-3 d-flex flex-column justify-content-center">
                <div class="mt-3 d-flex justify-content-center">
                    <h4>Travel Reservation Details</h4>
                </div>
                <hr>
                <table border="0" class="table">
                    <thead>
                        <tr>
                            <th scope="col"><strong>Full Name</strong></th>
                            <th scope="col"><strong>Email Address</strong></th>
                            <th scope="col"><strong>Tour Package</strong></th>
                            <th scope="col"><strong>Arrival Date</strong></th>
                            <th scope="col"><strong>Number of Persons</strong></th>
                            <th scope="col"><strong>Amenities</strong></th>
                            <th scope="col"><strong>Terms and Conditions</strong></th>
                            <th scope="col"><strong>Discount Coupon Code</strong></th>
                        </tr>
                    </thead>
                    <c:forEach items="${list}" var="reservation">
                        <tr>
                            <td>${reservation.fullName}</td>
                            <td>${reservation.emailAddress}</td>
                            <td>${reservation.tourPackage}</td>
                            <td>${reservation.arrivalDate}</td>
                            <td>${reservation.numberOfPersons}</td>
                            <td>${reservation.amenities}</td>
                            <td>${reservation.termsAndCondition}</td>
                            <td>${reservation.discountCouponCode}</td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
        </c:if>


    </div>

</body>

</html>

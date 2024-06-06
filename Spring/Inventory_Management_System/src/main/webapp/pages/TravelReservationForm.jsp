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

        <title>Travel Reservation Form</title>
    </head>

    <body>

        <%@ include file="../component/Header.jsp" %>

        <div class="container mb-3">
            <div class="container mt-3 shadow p-3 bg-body rounded formContainer">
                <div class="d-flex justify-content-center">
                    <h2>Travel Reservation Form</h2>
                </div>
                <br />

                <span class="compulsary">
                                <h4>${errorMsg}</h4>

                    <c:forEach items="${errors}" var="objectError">
                        "${objectError.defaultMessage}" <br>
                    </c:forEach>
                </span>

                <form action="travel/submitTravelReservation" method="POST">
                    <div class="mb-3">
                        <label for="fullName" class="form-label">Full Name</label>
                        <input type="text" class="form-control" name="fullName" id="fullName" value="${dto.fullName}" />
                    </div>

                    <div class="mb-3">
                        <label for="emailAddress" class="form-label">Email Address</label>
                        <input type="email" class="form-control" name="emailAddress" id="emailAddress"
                            value="${dto.emailAddress}" />
                    </div>

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

                    <div class="mb-3">
                        <label for="arrivalDate" class="form-label">Arrival Date</label>
                        <input type="date" class="form-control" name="arrivalDate" id="arrivalDate"
                            value="${dto.arrivalDate}" />
                    </div>

                    <div class="mb-3">
                        <label for="numberOfPersons" class="form-label">Number of Persons</label>
                        <input type="number" class="form-control" name="numberOfPersons" id="numberOfPersons"
                            value="${dto.numberOfPersons}" />
                    </div>

                    <div class="mb-3">
                        <label class="form-label">What would you want to avail?</label><br>
                        <div class="form-check form-check-inline">
                            <input class="form-check-input" type="checkbox" value="Boarding" name="amenities"
                                id="boarding" ${dto.amenities.contains('Boarding') ? 'checked' : '' }>
                            <label class="form-check-label" for="boarding">Boarding</label>
                        </div>
                        <div class="form-check form-check-inline">
                            <input class="form-check-input" type="checkbox" value="Fooding" name="amenities"
                                id="fooding" ${dto.amenities.contains('Fooding') ? 'checked' : '' }>
                            <label class="form-check-label" for="fooding">Fooding</label>
                        </div>
                        <div class="form-check form-check-inline">
                            <input class="form-check-input" type="checkbox" value="Sight Seeing" name="amenities"
                                id="sightSeeing" ${dto.amenities.contains('Sight Seeing') ? 'checked' : '' }>
                            <label class="form-check-label" for="sightSeeing">Sight Seeing</label>
                        </div>
                    </div>

                    <div class="mb-3">
                        <label for="discountCouponCode" class="form-label">Discount Coupon Code</label>
                        <input type="text" class="form-control" name="discountCouponCode" id="discountCouponCode"
                            value="${dto.discountCouponCode}" />


                    </div>

                    <div class="mb-3">
                        <label class="form-label">Terms and Condition</label><br>
                        <div class="form-check form-check-inline">
                            <input class="form-check-input" type="radio" name="termsAndCondition" id="agree"
                                value="Agree" ${dto.termsAndCondition eq 'Agree' ? 'checked' : '' }>
                            <label class="form-check-label" for="agree">I Agree</label>
                        </div>
                        <div class="form-check form-check-inline">
                            <input class="form-check-input" type="radio" name="termsAndCondition" id="disagree"
                                value="Disagree" ${dto.termsAndCondition eq 'Disagree' ? 'checked' : '' }>
                            <label class="form-check-label" for="disagree">I Disagree</label>
                        </div>
                    </div>

                    <div class="d-flex justify-content-evenly mt-4">
                        <button type="submit" class="btn btn-primary" id="submitButton">Complete Reservation</button>
                        <button type="reset" class="btn btn-secondary">Reset</button>
                    </div>
                </form>
            </div>
        </div>

    </body>

    </html>
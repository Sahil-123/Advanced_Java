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

                <span class="compulsary">

                    <h4>${errorMsg}</h4>

                    <c:forEach items="${errors}" var="objectError">
                        "${objectError.defaultMessage}" <br>
                    </c:forEach>
                </span>

                <form action="apartment/save" method="POST">
                    <div class="mb-3">
                        <label for="firstName" class="form-label">Occupant First Name</label>
                        <input type="text" class="form-control" name="firstName" id="firstName" minlength="1"
                            maxlength="50" value="${dto.firstName}" />
                    </div>

                    <div class="mb-3">
                        <label for="lastName" class="form-label">Occupant Last Name</label>
                        <input type="text" class="form-control" name="lastName" id="lastName" minlength="1"
                            maxlength="50" value="${dto.lastName}" />
                    </div>

                    <div class="mb-3">
                        <label for="phone" class="form-label">Phone</label>
                        <input type="tel" class="form-control" name="phone" id="phone" value="${dto.phone}" />
                    </div>

                    <div class="mb-3">
                        <label for="email" class="form-label">Email</label>
                        <input type="email" class="form-control" name="email" id="email" value="${dto.email}" />
                    </div>

                    <select class="form-select" name="apartmentSize" id="apartmentSize">
                        <option value="">Select Size</option>
                        <option value="1BHK" ${dto.apartmentSize eq '1BHK' ? 'selected' : '' }>1 BHK</option>
                        <option value="2BHK" ${dto.apartmentSize eq '2BHK' ? 'selected' : '' }>2 BHK</option>
                        <option value="3BHK" ${dto.apartmentSize eq '3BHK' ? 'selected' : '' }>3 BHK</option>
                    </select>


                    <div class="mb-3">
                        <label>Rental Term</label><br>
                        <div class="form-check form-check-inline">
                            <input class="form-check-input" type="radio" name="rentalTerm" id="shortTerm"
                                value="shortTerm" ${dto.rentalTerm eq 'shortTerm' ? 'checked' : '' }>
                            <label class="form-check-label" for="shortTerm">Short Term</label>
                        </div>
                        <div class="form-check form-check-inline">
                            <input class="form-check-input" type="radio" name="rentalTerm" id="longTerm"
                                value="longTerm" ${dto.rentalTerm eq 'longTerm' ? 'checked' : '' }>
                            <label class="form-check-label" for="longTerm">Long Term</label>
                        </div>
                        <div class="form-check form-check-inline">
                            <input class="form-check-input" type="radio" name="rentalTerm" id="both" value="both"
                                ${dto.rentalTerm eq 'both' ? 'checked' : '' }>
                            <label class="form-check-label" for="both">Both</label>
                        </div>
                    </div>

                    <div class="mb-3">
                        <label class="form-label">Features</label><br>
                        <div class="form-check form-check-inline">
                            <input class="form-check-input" type="checkbox" value="Balcony" name="features" id="balcony"
                                ${dto.features.contains('Balcony') ? 'checked' : '' }>
                            <label class="form-check-label" for="balcony">Balcony</label>
                        </div>
                        <div class="form-check form-check-inline">
                            <input class="form-check-input" type="checkbox" value="Higher Floor" name="features"
                                id="higherFloor" ${dto.features.contains('Higher Floor') ? 'checked' : '' }>
                            <label class="form-check-label" for="higherFloor">Higher Floor</label>
                        </div>
                        <div class="form-check form-check-inline">
                            <input class="form-check-input" type="checkbox" value="Proximity to Elevators"
                                name="features" id="proximityToElevators" ${dto.features.contains('Proximity to
                                Elevators') ? 'checked' : '' }>
                            <label class="form-check-label" for="proximityToElevators">Proximity to Elevators</label>
                        </div>
                    </div>

                    <div class="mb-3">
                        <label for="startDate" class="form-label">Start Date</label>
                        <input type="date" class="form-control" name="startDate" id="startDate"
                            value="${dto.startDate}" />
                    </div>

                    <div class="mb-3">
                        <label for="specialRequest" class="form-label">Special Request</label>
                        <textarea class="form-control" id="specialRequest" rows="3" maxlength="300"
                            name="specialRequest">${dto.specialRequest}</textarea>
                    </div>

                    <div class="d-flex justify-content-evenly mt-4">
                        <button type="submit" class="btn btn-primary" id="submitButton">
                            Submit
                        </button>

                        <button type="reset" class="btn btn-secondary">
                            Reset
                        </button>
                    </div>
                </form>
            </div>
        </div>

    </body>

    </html>
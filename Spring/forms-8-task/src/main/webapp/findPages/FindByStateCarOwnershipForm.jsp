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

    <title>My Feedback</title>
</head>

<body>

    <%@ include file="../component/Header.jsp" %>

    <div class="container mb-3">
        <div class="container mt-3 shadow p-3 bg-body rounded formContainer">
            <div class="d-flex justify-content-center">
                <h2>FeedBack Search</h2>
            </div>
            <br />

            <span class="compulsary">
                <h4>${errorMsg}</h4>

                <c:forEach items="${errors}" var="objectError">
                    "${objectError.defaultMessage}" <br>
                </c:forEach>
            </span>

            <form action="carOwnership/findState" method="GET">
                <div class="mb-3">
                                    <label for="stateResidence" class="form-label">State Residence <span class="compulsary">*</span></label>
                                    <select id="stateResidence" name="stateResidence" class="form-select">
                                        <option value="">Select state</option>
                                        <option value="Maharashtra" ${dto.stateResidence eq 'Maharashtra' ? 'selected' : ''}>Maharashtra</option>
                                        <option value="Karnataka" ${dto.stateResidence eq 'Karnataka' ? 'selected' : ''}>Karnataka</option>
                                        <option value="Tamil Nadu" ${dto.stateResidence eq 'Tamil Nadu' ? 'selected' : ''}>Tamil Nadu</option>
                                        <option value="Gujarat" ${dto.stateResidence eq 'Gujarat' ? 'selected' : ''}>Gujarat</option>
                                        <option value="Rajasthan" ${dto.stateResidence eq 'Rajasthan' ? 'selected' : ''}>Rajasthan</option>
                                        <option value="Punjab" ${dto.stateResidence eq 'Punjab' ? 'selected' : ''}>Punjab</option>
                                        <option value="Kerala" ${dto.stateResidence eq 'Kerala' ? 'selected' : ''}>Kerala</option>
                                        <option value="West Bengal" ${dto.stateResidence eq 'West Bengal' ? 'selected' : ''}>West Bengal</option>
                                        <option value="Uttar Pradesh" ${dto.stateResidence eq 'Uttar Pradesh' ? 'selected' : ''}>Uttar Pradesh</option>
                                        <option value="Madhya Pradesh" ${dto.stateResidence eq 'Madhya Pradesh' ? 'selected' : ''}>Madhya Pradesh</option>
                                    </select>
                                    <span class="error" id="stateResidenceError"></span>
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

            <div class=" mt-5 d-flex justify-content-center">

                                   <span>
                                         <h4>${recordsInfo}</h4>
                                   </span>
            </div>
        </div>

        <c:if test="${list != null}">
                        <br>
                        <div class="mt-3 d-flex flex-column justify-content-center">
                            <div class="mt-3 d-flex justify-content-center">
                                <h4>Car Ownership Details</h4>
                            </div>
                            <hr>
                            <table border="0" class="table">
                                <thead>
                                    <tr>
                                        <th scope="col"><strong>First Name</strong></th>
                                        <th scope="col"><strong>Last Name</strong></th>
                                        <th scope="col"><strong>Favorite Sport</strong></th>
                                        <th scope="col"><strong>Gender</strong></th>
                                        <th scope="col"><strong>State of Residence</strong></th>
                                        <th scope="col"><strong>Car Owned</strong></th>
                                    </tr>
                                </thead>
                                <c:forEach items="${list}" var="carOwnership">
                                    <tr>
                                        <td>${carOwnership.firstName}</td>
                                        <td>${carOwnership.lastName}</td>
                                        <td>${carOwnership.favoriteSport}</td>
                                        <td>${carOwnership.gender}</td>
                                        <td>${carOwnership.stateResidence}</td>
                                        <td>${carOwnership.carOwned}</td>
                                    </tr>
                                </c:forEach>
                            </table>
                        </div>
                    </c:if>
    </div>

</body>

</html>

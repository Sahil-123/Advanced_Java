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

    <title>Contact Form</title>
</head>

<body>

    <%@ include file="../component/Header.jsp" %>
    <div class="container mb-3">
        <div class="container mt-3 shadow p-3 bg-body rounded formContainer">
            <div class="d-flex justify-content-center">
                <h2>Survey Form</h2>
            </div>
            <br />

            <span class="compulsary">
                            <h4>${errorMsg}</h4>

                <c:forEach items="${errors}" var="objectError">
                    "${objectError.defaultMessage}" <br>
                </c:forEach>
            </span>

            <form action="survey/submitSurvey" method="POST">
                <div class="mb-3">
                    <label for="emailAddress" class="form-label">Email Address</label>
                    <input type="email" class="form-control" name="emailAddress" id="emailAddress" value="${dto.emailAddress}" />
                </div>

                <div class="mb-3">
                    <label for="firstName" class="form-label">First Name</label>
                    <input type="text" class="form-control" name="firstName" id="firstName" value="${dto.firstName}" />
                </div>

                <div class="mb-3">
                    <label for="lastName" class="form-label">Last Name</label>
                    <input type="text" class="form-control" name="lastName" id="lastName" value="${dto.lastName}" />
                </div>

                <div class="mb-3">
                    <label for="state" class="form-label">State</label>
                    <select class="form-select" name="state" id="state">
                        <option value="">Select State</option>
                        <option value="Andhra Pradesh" ${dto.state eq 'Andhra Pradesh' ? 'selected' : ''}>Andhra Pradesh</option>
                        <option value="Arunachal Pradesh" ${dto.state eq 'Arunachal Pradesh' ? 'selected' : ''}>Arunachal Pradesh</option>
                        <!-- Add other states as needed
                        <option value="Arunachal Pradesh" ${dto.state eq 'Arunachal Pradesh' ? 'selected' : ''}>Arunachal Pradesh</option>
                        <!-- Add other states as needed -->
                    </select>
                </div>

                <div class="mb-3">
                    <label class="form-label">How did you hear about us?</label><br>
                    <div class="form-check form-check-inline">
                        <input class="form-check-input" type="checkbox" value="Web Search" name="howDidYouHearAboutUs" id="webSearch" ${dto.howDidYouHearAboutUs.contains('Web Search') ? 'checked' : ''}>
                        <label class="form-check-label" for="webSearch">Web Search</label>
                    </div>
                    <div class="form-check form-check-inline">
                        <input class="form-check-input" type="checkbox" value="Facebook" name="howDidYouHearAboutUs" id="facebook" ${dto.howDidYouHearAboutUs.contains('Facebook') ? 'checked' : ''}>
                        <label class="form-check-label" for="facebook">Facebook</label>
                    </div>
                    <div class="form-check form-check-inline">
                        <input class="form-check-input" type="checkbox" value="Twitter" name="howDidYouHearAboutUs" id="twitter" ${dto.howDidYouHearAboutUs.contains('Twitter') ? 'checked' : ''}>
                        <label class="form-check-label" for="twitter">Twitter</label>
                    </div>
                    <div class="form-check form-check-inline">
                        <input class="form-check-input" type="checkbox" value="Email Message" name="howDidYouHearAboutUs" id="emailMessage" ${dto.howDidYouHearAboutUs.contains('Email Message') ? 'checked' : ''}>
                        <label class="form-check-label" for="emailMessage">Email Message</label>
                    </div>
                </div>

                <div class="mb-3">
                    <label class="form-label">Gender</label><br>
                    <div class="form-check form-check-inline">
                        <input class="form-check-input" type="radio" name="gender" id="male" value="Male" ${dto.gender eq 'Male' ? 'checked' : ''}>
                        <label class="form-check-label" for="male">Male</label>
                    </div>
                    <div class="form-check form-check-inline">
                        <input class="form-check-input" type="radio" name="gender" id="female" value="Female" ${dto.gender eq 'Female' ? 'checked' : ''}>
                        <label class="form-check-label" for="female">Female</label>
                    </div>
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

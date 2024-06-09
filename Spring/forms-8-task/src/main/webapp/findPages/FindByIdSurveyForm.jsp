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

    <title>Survey Form</title>
</head>

<body>

    <%@ include file="../component/Header.jsp" %>

    <div class="container mb-3">
        <div class="container mt-3 shadow p-3 bg-body rounded formContainer">
            <div class="d-flex justify-content-center">
                <h2>Survey Form Search</h2>
            </div>
            <br />

            <span class="compulsary">
                <h4>${errorMsg}</h4>

                <c:forEach items="${errors}" var="objectError">
                    "${objectError.defaultMessage}" <br>
                </c:forEach>
            </span>

            <form action="survey/findId" method="GET">
                <div class="mb-3">
                    <label for="surveyFormId" class="form-label">Enter Survey Form ID</label>
                    <input type="number" class="form-control" name="surveyFormId" id="surveyFormId" minlength="1" maxlength="30" value="${dto.id}" />
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
                        <h4>Survey Form Details</h4>
                    </div>
                    <hr>
                    <table border="0">
                        <tr>
                            <td><strong>ID:</strong></td>
                            <td>${dto.id}</td>
                        </tr>
                        <tr>
                            <td><strong>Email Address:</strong></td>
                            <td>${dto.emailAddress}</td>
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
                            <td><strong>State:</strong></td>
                            <td>${dto.state}</td>
                        </tr>
                        <tr>
                            <td><strong>How Did You Hear About Us:</strong></td>
                            <td>${dto.howDidYouHearAboutUs}</td>
                        </tr>
                        <tr>
                            <td><strong>Gender:</strong></td>
                            <td>${dto.gender}</td>
                        </tr>
                    </table>
                </div>
            </c:if>
        </div>
    </div>

</body>

</html>

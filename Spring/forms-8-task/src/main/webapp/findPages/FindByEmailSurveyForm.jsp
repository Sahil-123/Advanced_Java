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

            <form action="survey/findEmailAddress" method="GET">
                <div class="mb-3">
                                    <label for="emailAddress" class="form-label">Email Address</label>
                                    <input type="email" class="form-control" name="emailAddress" id="emailAddress" value="${dto.emailAddress}" />
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
                    <h4>Survey Form Details</h4>
                </div>
                <hr>
                <table border="0" class="table">
                    <thead>
                        <tr>
                            <th scope="col"><strong>Email Address</strong></th>
                            <th scope="col"><strong>First Name</strong></th>
                            <th scope="col"><strong>Last Name</strong></th>
                            <th scope="col"><strong>State</strong></th>
                            <th scope="col"><strong>How Did You Hear About Us</strong></th>
                            <th scope="col"><strong>Gender</strong></th>
                        </tr>
                    </thead>
                    <c:forEach items="${list}" var="survey">
                        <tr>
                            <td>${survey.emailAddress}</td>
                            <td>${survey.firstName}</td>
                            <td>${survey.lastName}</td>
                            <td>${survey.state}</td>
                            <td>${survey.howDidYouHearAboutUs}</td>
                            <td>${survey.gender}</td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
        </c:if>

    </div>

</body>

</html>

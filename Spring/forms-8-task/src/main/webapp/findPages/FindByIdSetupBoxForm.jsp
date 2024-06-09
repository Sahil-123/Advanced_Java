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

    <title>Set Top Box Registration</title>
</head>

<body>

    <%@ include file="../component/Header.jsp" %>

    <div class="container mb-3">
        <div class="container mt-3 shadow p-3 bg-body rounded formContainer">
            <div class="d-flex justify-content-center">
                <h2>Set Top Box Registration Search</h2>
            </div>
            <br />

            <span class="compulsary">
                <h4>${errorMsg}</h4>

                <c:forEach items="${errors}" var="objectError">
                    "${objectError.defaultMessage}" <br>
                </c:forEach>
            </span>

            <form action="setOfBox/findId" method="GET">
                <div class="mb-3">
                    <label for="setTopBoxRegistrationId" class="form-label">Enter Set Top Box Registration ID</label>
                    <input type="number" class="form-control" name="setTopBoxRegistrationId" id="setTopBoxRegistrationId" minlength="1" maxlength="30" value="${dto.id}" />
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
                        <h4>Set Top Box Registration Details</h4>
                    </div>
                    <hr>
                    <table border="0">
                        <tr>
                            <td><strong>ID:</strong></td>
                            <td>${dto.id}</td>
                        </tr>
                        <tr>
                            <td><strong>Name:</strong></td>
                            <td>${dto.name}</td>
                        </tr>
                        <tr>
                            <td><strong>Email:</strong></td>
                            <td>${dto.email}</td>
                        </tr>
                        <tr>
                            <td><strong>Gender:</strong></td>
                            <td>${dto.gender}</td>
                        </tr>
                        <tr>
                            <td><strong>Country:</strong></td>
                            <td>${dto.country}</td>
                        </tr>
                        <tr>
                            <td><strong>Description:</strong></td>
                            <td>${dto.description}</td>
                        </tr>
                        <tr>
                            <td><strong>Terms and Conditions:</strong></td>
                            <td>${dto.termsAndCondition}</td>
                        </tr>
                    </table>
                </div>
            </c:if>
        </div>
    </div>

</body>

</html>

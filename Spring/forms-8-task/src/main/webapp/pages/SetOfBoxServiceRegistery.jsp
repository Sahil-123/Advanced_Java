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
            /* border: 1px solid red; */
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

    <title>Register</title>
</head>

<body>
      <%@ include file="../component/Header.jsp" %>


    <div class="container mb-3">
        <div class="container mt-3 shadow p-3 bg-body rounded formContainer">

                <c:choose>
                  <c:when test="${edit}">
                    <form action="setOfBox/updateSetTopBox?id=${id}" method="POST">
                  </c:when>
                  <c:otherwise>
                    <form action="setOfBox/registerSetTopBox" method="POST">
                  </c:otherwise>
                </c:choose>

                <div class="d-flex justify-content-center">
                    <h2>Set-Top Box Registration</h2>
                </div>

                <br />

                <span class="compulsary">
                    <h4>${errorMsg}</h4>
                    <c:forEach items = "${errors}" var="objectError">
                        "${objectError.defaultMessage}"
                        <br>
                    </c:forEach>
                </span>

                <div class="mb-3 mt-2">
                    <label for="name" class="form-label">Customer Name <span class="compulsary">*</span></label>
                    <input type="text" class="form-control" minlength="3" maxlength="30" name="name" id="name"
                        onblur="nameValidation()"
                        value="${dto.name}"
                        />
                    <span id="nameError" class="error"></span>
                </div>

                <div class="mb-3">
                    <label for="email" class="form-label">Email <span class="compulsary">*</span></label>
                    <input type="email" class="form-control" name="email" id="email"
                    onblur="emailValidation()"
                    value="${dto.email}"
                    <c:if test="${edit}">readonly</c:if>
                    />
                    <span id="emailError" class="error"></span>
                </div>

                <div class="mb-3">
                    <label for="genderField" class="form-label">Gender <span class="compulsary">*</span></label>
                    <div id="genderField">
                        <div class="form-check">
                            <input class="form-check-input" type="radio" value="male" name="gender" id="male"
                                onblur="genderValidation()"
                                 ${dto.gender eq 'male' ? 'checked' : ''}
                                />
                            <label class="form-check-label" for="male"> Male </label>
                        </div>

                        <div class="form-check">
                            <input class="form-check-input" type="radio" value="female" name="gender" id="female"
                                onblur="genderValidation()"
                                ${dto.gender eq 'female' ? 'checked' : ''}
                                />
                            <label class="form-check-label" for="female"> Female </label>
                        </div>
                    </div>
                </div>

                <div class="mb-3">
                    <label for="country" class="form-label">Country <span class="compulsary">*</span></label>
                    <select id="country" name="country" class="form-select" onblur="countryValidation()">
                        <option value="">Select your country</option>
                        <option value="IN" ${dto.country eq 'IN' ? 'selected' : ''}>India</option>
                        <option value="US" ${dto.country eq 'US' ? 'selected' : ''}>USA</option>
                        <option value="UK" ${dto.country eq 'UK' ? 'selected' : ''}>UK</option>

                        </select>
                    <span class="error" id="countryError"></span>
                </div>

                <div class="mb-3">
                    <label for="description" class="form-label">Description <span class="compulsary">*</span></label>
                    <textarea class="form-control" id="description" rows="3" maxlength="300" name="description"
                        onblur="descriptionValidation()"
                        >${dto.description}</textarea>
                    <span id="descriptionError" class="error"></span>
                </div>

                <div class="form-check">
                    <input class="form-check-input" type="checkbox" id="termsAndCondition"
                        name="termsAndCondition" onblur="termsAndConditionValidation()"
                        ${dto.termsAndCondition == 'on' ? 'checked' : ''}
                        />
                    <label class="form-check-label" for="termsAndCondition">
                        I agree with Terms & Conditions <span class="compulsary">*</span>
                    </label>
                    <span id="termsAndConditionError" class="error"></span>

                </div>

                <div class="d-flex justify-content-center">
                    <button type="submit" class="btn btn-primary" id="submitButton" >
                        <c:choose>
                          <c:when test="${edit}">
                            Edit
                          </c:when>
                          <c:otherwise>
                            Submit
                          </c:otherwise>
                        </c:choose>
                    </button>
                </div>
            </form>
        </div>
    </div>

    <script src="SetBoxServiceRegistration.js"></script>
</body>

</html>
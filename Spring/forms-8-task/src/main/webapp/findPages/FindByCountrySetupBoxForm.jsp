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

            <form action="setOfBox/findCountry" method="GET">
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

        <c:if test="${deleteMessage.length() > 0}">
            <div class="alert alert-warning alert-dismissible fade show" role="alert">
              <strong>  ${deleteMessage} </strong>
              <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
            </div>
        </c:if>

<c:if test="${list != null}">
    <br>
    <div class="mt-3 d-flex flex-column justify-content-center">
        <div class="mt-3 d-flex justify-content-center">
            <h4>Set-Top Box Registration Details</h4>
        </div>
        <hr>
        <table border="0" class="table">
            <thead>
                <tr>
                    <th scope="col"><strong>Name</strong></th>
                    <th scope="col"><strong>Email</strong></th>
                    <th scope="col"><strong>Gender</strong></th>
                    <th scope="col"><strong>Country</strong></th>
                    <th scope="col"><strong>Description</strong></th>
                    <th scope="col"><strong>Terms & Conditions</strong></th>
                    <th scope="col"> Edit </th>
                    <th scope="col"> Delete </th>
                </tr>
            </thead>
            <c:forEach items="${list}" var="setTopBox">
                <tr>
                    <td>${setTopBox.name}</td>
                    <td>${setTopBox.email}</td>
                    <td>${setTopBox.gender}</td>
                    <td>${setTopBox.country}</td>
                    <td>${setTopBox.description}</td>
                    <td>${setTopBox.termsAndCondition}</td>
                    <td><a href="setOfBox/registerSetTopBox?id=${setTopBox.id}&edit=edit"><i class="fa-solid fa-pen-to-square" style="color:blue"></i></a></td>
                    <td><a href="setOfBox/deleteByIdForCountry?country=${country}&id=${setTopBox.id}"><i class="fa-solid fa-trash" style="color:red"></i></a></td>
                </tr>
            </c:forEach>
        </table>
    </div>
</c:if>



    </div>

</body>

</html>

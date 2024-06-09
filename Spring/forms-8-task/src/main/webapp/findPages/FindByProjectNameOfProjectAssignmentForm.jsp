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

    <title>Project Assignment</title>
</head>

<body>

    <%@ include file="../component/Header.jsp" %>

    <div class="container mb-3">
        <div class="container mt-3 shadow p-3 bg-body rounded formContainer">
            <div class="d-flex justify-content-center">
                <h2>Project Assignment Search</h2>
            </div>
            <br />

            <span class="compulsary">
                <h4>${errorMsg}</h4>

                <c:forEach items="${errors}" var="objectError">
                    "${objectError.defaultMessage}" <br>
                </c:forEach>
            </span>

            <form action="project/findProjectName" method="GET">
                 <div class="mb-3 mt-2">
                                    <label for="projectName" class="form-label">Project Name <span class="compulsary">*</span></label>
                                    <input type="text" class="form-control" minlength="3" maxlength="30" name="projectName" id="projectName"
                                        value="${dto.projectName}" />
                                    <span id="projectNameError" class="error"></span>
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
            <h4>Project Management Details</h4>
        </div>
        <hr>
        <table border="0" class="table">
            <thead>
                <tr>
                    <th scope="col"><strong>Project Name</strong></th>
                    <th scope="col"><strong>Assignment To</strong></th>
                    <th scope="col"><strong>Start Date</strong></th>
                    <th scope="col"><strong>End Date</strong></th>
                    <th scope="col"><strong>Priority</strong></th>
                    <th scope="col"><strong>Description</strong></th>
                </tr>
            </thead>
            <c:forEach items="${list}" var="projectDTO">
                <tr>
                    <td>${projectDTO.projectName}</td>
                    <td>${projectDTO.assignmentTo}</td>
                    <td>${projectDTO.startDate}</td>
                    <td>${projectDTO.endDate}</td>
                    <td>${projectDTO.priority}</td>
                    <td>${projectDTO.description}</td>
                </tr>
            </c:forEach>
        </table>
    </div>
</c:if>




    </div>

</body>

</html>

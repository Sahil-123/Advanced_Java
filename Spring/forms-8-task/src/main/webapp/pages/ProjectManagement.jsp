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

    <title>Project Assignment</title>
</head>

<body>
    <%@ include file="../component/Header.jsp" %>

    <div class="container mb-3">
        <div class="container mt-3 shadow p-3 bg-body rounded formContainer">
            <span class="compulsary">
                <c:forEach items="${errors}" var="objectError">
                    "${objectError.defaultMessage}" <br>
                </c:forEach>
            </span>

            <form action="task/projectAssignment" method="POST">
                <div class="d-flex justify-content-center">
                    <h2>Project Assignment</h2>
                </div>

                <br />

                <div class="mb-3 mt-2">
                    <label for="projectName" class="form-label">Project Name <span class="compulsary">*</span></label>
                    <input type="text" class="form-control" minlength="3" maxlength="30" name="projectName" id="projectName"
                        value="${dto.projectName}" />
                    <span id="projectNameError" class="error"></span>
                </div>

                <div class="mb-3">
                    <label for="assignmentTo" class="form-label">Assignment To <span class="compulsary">*</span></label>
                    <select id="assignmentTo" name="assignmentTo" class="form-select">
                        <option value="">Select assignee</option>
                        <option value="Student1" ${dto.assignmentTo eq 'Student1' ? 'selected' : ''}>Student 1</option>
                        <option value="Student2" ${dto.assignmentTo eq 'Student2' ? 'selected' : ''}>Student 2</option>
                        <option value="Student3" ${dto.assignmentTo eq 'Student3' ? 'selected' : ''}>Student 3</option>
                    </select>
                    <span class="error" id="assignmentToError"></span>
                </div>

                <div class="mb-3">
                                    <label for="startDate" class="form-label">Start Date <span class="compulsary">*</span></label>
                                    <input type="date" class="form-control" name="startDate" id="startDate"
                                        value="${dto.startDate}" />
                                    <span id="startDateError" class="error"></span>
                                </div>

                                <div class="mb-3">
                                    <label for="endDate" class="form-label">End Date <span class="compulsary">*</span></label>
                                    <input type="date" class="form-control" name="endDate" id="endDate"
                                        value="${dto.endDate}" />
                                    <span id="endDateError" class="error"></span>
                                </div>

                <div class="mb-3">
                    <label for="priority" class="form-label">Priority <span class="compulsary">*</span></label>
                    <div id="priority">
                        <div class="form-check">
                            <input class="form-check-input" type="radio" value="high" name="priority" id="high"
                                ${dto.priority eq 'high' ? 'checked' : ''} />
                            <label class="form-check-label" for="high"> High </label>
                        </div>
                        <div class="form-check">
                            <input class="form-check-input" type="radio" value="average" name="priority" id="average"
                                ${dto.priority eq 'average' ? 'checked' : ''} />
                            <label class="form-check-label" for="average"> Average </label>
                        </div>
                        <div class="form-check">
                            <input class="form-check-input" type="radio" value="low" name="priority" id="low"
                                ${dto.priority eq 'low' ? 'checked' : ''} />
                            <label class="form-check-label" for="low"> Low </label>
                        </div>
                    </div>
                </div>

                <div class="mb-3">
                    <label for="description" class="form-label">Description <span class="compulsary">*</span></label>
                    <textarea class="form-control" id="description" rows="3" maxlength="300" name="description">${dto.description}</textarea>
                    <span id="descriptionError" class="error"></span>
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

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

        <title>Novell Services Login</title>
    </head>

    <body>

        <%@ include file="../component/Header.jsp" %>

        <div class="container mb-3">
            <div class="container mt-3 shadow p-3 bg-body rounded formContainer">
                <div class="d-flex justify-content-center">
                    <h2>Novell Services Login</h2>
                </div>
                <br />

                <span class="compulsary">
                    <c:forEach items="${errors}" var="objectError">
                        "${objectError.defaultMessage}" <br>
                    </c:forEach>
                </span>

                <form action="novel/submitNovellLogin" method="POST">
                    <div class="mb-3">
                        <label for="username" class="form-label">Username</label>
                        <input type="text" class="form-control" name="username" id="username" value="${dto.username}" />
                    </div>

                    <div class="mb-3">
                        <label for="password" class="form-label">Password</label>
                        <input type="password" class="form-control" name="password" id="password" value="${dto.password}" />
                    </div>

                    <div class="mb-3">
                        <label for="cityOf" class="form-label">City of</label>
                        <input type="text" class="form-control" name="cityOf" id="cityOf" value="${dto.cityOf}" />
                    </div>

                    <div class="mb-3">
                        <label for="employment" class="form-label">Employment</label>
                        <input type="text" class="form-control" name="employment" id="employment"
                            value="${dto.employment}" />
                    </div>

                    <div class="mb-3">
                        <label for="webServer" class="form-label">Web Server</label>
                        <select class="form-select" name="webServer" id="webServer">
                            <option value="">Select Web Server</option>
                            <option value="Apache" ${dto.webServer eq 'Apache' ? 'selected' : '' }>Apache</option>
                            <option value="Tomcat" ${dto.webServer eq 'Tomcat' ? 'selected' : '' }>Tomcat</option>
                            <!-- Add other web servers as needed -->
                        </select>
                    </div>

                    <div class="mb-3">
                        <label class="form-label">Please specify your role</label><br>
                        <div class="form-check form-check-inline">
                            <input class="form-check-input" type="radio" name="role" id="admin" value="Admin" ${dto.role
                                eq 'Admin' ? 'checked' : '' }>
                            <label class="form-check-label" for="admin">Admin</label>
                        </div>
                        <div class="form-check form-check-inline">
                            <input class="form-check-input" type="radio" name="role" id="engineer" value="Engineer"
                                ${dto.role eq 'Engineer' ? 'checked' : '' }>
                            <label class="form-check-label" for="engineer">Engineer</label>
                        </div>
                        <div class="form-check form-check-inline">
                            <input class="form-check-input" type="radio" name="role" id="manager" value="Manager"
                                ${dto.role eq 'Manager' ? 'checked' : '' }>
                            <label class="form-check-label" for="manager">Manager</label>
                        </div>
                        <div class="form-check form-check-inline">
                            <input class="form-check-input" type="radio" name="role" id="guest" value="Guest" ${dto.role
                                eq 'Guest' ? 'checked' : '' }>
                            <label class="form-check-label" for="guest">Guest</label>
                        </div>
                    </div>

                    <div class="mb-3">
                        <label class="form-label">Single sign-on to the following</label><br>
                        <div class="form-check form-check-inline">
                            <input class="form-check-input" type="checkbox" value="Mail" name="singleSignOn" id="mail"
                                ${dto.singleSignOn !=null && dto.singleSignOn.contains('Mail') ? 'checked' : '' }>
                            <label class="form-check-label" for="mail">Mail</label>
                        </div>
                        <div class="form-check form-check-inline">
                            <input class="form-check-input" type="checkbox" value="Payroll" name="singleSignOn"
                                id="payroll" ${dto.singleSignOn !=null && dto.singleSignOn.contains('Payroll')
                                ? 'checked' : '' }>
                            <label class="form-check-label" for="payroll">Payroll</label>
                        </div>
                        <div class="form-check form-check-inline">
                            <input class="form-check-input" type="checkbox" value="Self-Service" name="singleSignOn"
                                id="selfService" ${dto.singleSignOn !=null && dto.singleSignOn.contains('Self-Service')
                                ? 'checked' : '' }>
                            <label class="form-check-label" for="selfService">Self-Service</label>
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
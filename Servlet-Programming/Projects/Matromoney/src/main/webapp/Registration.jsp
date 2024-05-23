<%@ include file="TagsConfig.jsp" %>

        <!DOCTYPE html>
        <html lang="en">

        <head>
               <%@ include file="HeaderLinks.jsp" %>

            <style>
                label {
                    font-weight: bold;
                }

                .formContainer {
                    width: 50%;
                    /* border: 1px solid red; */
                    padding: 20px;
                }
            </style>

            <title>Servlet Programming</title>
        </head>

        <body>
            <%@ include file="Header.jsp" %>
                <div class="container">
                    <div class="container mt-5 mb-5 shadow p-3 mb-5 bg-body rounded formContainer">
                        <form action="register" method="POST">
                            <div class="mb-3">
                                <label for="nameField" class="form-label">Name</label>
                                <input type="text" class="form-control" name="name" id="nameField">
                            </div>

                            <div class="mb-3">
                                <label for="ageField" class="form-label">Age</label>
                                <input type="number" class="form-control" name="age" id="ageField">
                            </div>


                            <div class="mb-3">
                                <label for="genderField" class="form-label">Gender</label>
                                <div id="genderField">
                                    <div class="form-check">
                                        <input class="form-check-input" type="radio" value="male" name="gender"
                                            id="flexRadioDefault1">
                                        <label class="form-check-label" for="flexRadioDefault1">
                                            Male
                                        </label>
                                    </div>
                                    <div class="form-check">
                                        <input class="form-check-input" type="radio" value="female" name="gender"
                                            id="flexRadioDefault2" checked>
                                        <label class="form-check-label" for="flexRadioDefault2">
                                            Female
                                        </label>
                                    </div>
                                </div>
                            </div>

                            <div class="mb-3">
                                <label for="maritalField" class="form-label">Marital Status</label>
                                <select class="form-select" id="maritalField" name="maritalStatus"
                                    aria-label="Default select example">
                                    <option selected>Open this select menu</option>
                                    <option>Married</option>
                                    <option>Unmarried</option>
                                    <option>Divorsed</option>
                                </select>
                            </div>

                            <div class="mb-3">
                                <label for="religion" class="form-label"> Religion</label>
                                <select class="form-select" id="religion" name="religion"
                                    aria-label="Default select example">
                                    <option selected>Open this select menu</option>
                                    <option>A</option>
                                    <option>B</option>
                                    <option>C</option>
                                </select>
                            </div>


                            <div class="mb-3">
                                <label for="jobField" class="form-label">Job</label>
                                <input type="text" class="form-control" name="job" id="jobField">
                            </div>

                            <div class="mb-3">
                                <label for="qualification" class="form-label"> Qualification</label>
                                <select class="form-select" id="qualification" name="qualification"
                                    aria-label="Default select example">
                                    <option selected>Open this select menu</option>
                                    <option value="high-school-diploma">High School Diploma</option>
                                    <option value="associate-degree">Associate Degree</option>
                                    <option value="bachelors-degree">Bachelor's Degree</option>
                                    <option value="masters-degree">Master's Degree</option>
                                    <option value="doctorate">Doctorate (PhD)</option>
                                    <option value="professional-certification">Professional Certification</option>
                                    <option value="vocational-training">Vocational Training</option>
                                    <option value="diploma">Diploma</option>
                                    <option value="postgraduate-diploma">Postgraduate Diploma</option>
                                    <option value="none">None</option>
                                </select>
                            </div>

                            <div class="mb-3">
                                <label for="lookingforField" class="form-label">Looking For</label>
                                <input type="text" class="form-control" name="lookingFor" id="lookingforField">
                            </div>

                            <div class="d-flex justify-content-center">
                                <button type="submit" class="btn btn-primary">Submit</button>
                            </div>
                        </form>
                    </div>
                </div>
        </body>

        </html>
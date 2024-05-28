

<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <%@ include file="HeaderLink.jsp" %>
    <title>E-Commerce Customer Complaint Form</title>


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

                .compulsary{
                  color: red;
                }
              </style>

</head>
<body>
    <%@ include file="Header.jsp" %>

     <div class="container mb-3">
            <div class="container mt-3 shadow p-3 bg-body rounded formContainer">

                <form action="registerComplaint" method="POST">
                    <div class="d-flex justify-content-center">
                        <h2>E-Commerce Complaint Form</h2>
                    </div>

                    <br>

                    <div class="mb-3 mt-2">
                        <label for="vendor" class="form-label">Name of the vendor <span class="compulsary">*</span> </label>
                        <input type="text" class="form-control" minlength="3" maxlength="30" name="vendor" id="vendor"
                            onblur="vendorNameValidation()" />
                        <span id="vendorNameError" class="error"></span>
                    </div>

                    <div class="mb-3 mt-2">
                        <label for="name" class="form-label">Customer Name <span class="compulsary">*</span></label>
                        <input type="text" class="form-control" minlength="3" maxlength="30" name="name" id="name"
                            onblur="nameValidation()" />
                        <span id="nameError" class="error"></span>
                    </div>

                    <div class="mb-3">
                        <label for="email" class="form-label">Email <span class="compulsary">*</span></label>
                        <input type="email" class="form-control" name="email" id="email" onblur="emailValidation()" />
                        <span id="emailError" class="error"></span>
                    </div>


                    <div class="mb-3">
                        <label for="purchaseDate" class="form-label">Purchase Date <span class="compulsary">*</span></label>
                        <input type="date" maxlength="10" class="form-control" name="purchaseDate" id="purchaseDate"
                            onblur="purchaseDateValidation()" />
                        <span id="purchaseDateError" class="error"></span>
                    </div>

                    <div class="mb-3">
                        <label for="problemDescription" class="form-label">Problem Description <span class="compulsary">*</span></label>
                        <textarea class="form-control" id="problemDescription" rows="3" maxlength="300"
                            name="problemDescription" onblur="problemDescriptionValidation()"></textarea>
                        <span id="problemDescriptionError" class="error"></span>
                    </div>

                    <div class="d-flex justify-content-center">
                        <button type="submit" class="btn btn-primary" id="submitButton" disabled>Submit</button>
                    </div>
                </form>

            </div>

        </div>

        <script src="CustomerComplaint.js"></script>

</body>
</html>
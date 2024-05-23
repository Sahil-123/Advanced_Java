<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="Bootstrap.css" />
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js"
        integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM"
        crossorigin="anonymous"></script>
    <title>Contact Details</title>
</head>

<body>
    <div class="container d-flex justify-content-center">
        <form action="contactRegister" method="POST" class="shadow-lg p-3 mb-5 bg-body rounded "
            style="width: 60%; margin-top: 20px; margin-bottom: 10px; padding: 20px;">
            <div class="d-flex justify-content-center">
                <h6>
                    <%= request.getParameter("fname").toUpperCase() + " " + request.getParameter("lname").toUpperCase()+" "
                        %>
                        <p>Please enter contact details.</p>
                        <h6>
                            <br>
                            <br>
            </div>

            <div class="mb-3">
                <label for="email" class="form-label">E-mail</label>
                <input type="text" class="form-control" id="email" name="email" onblur="emailValidation()">
                <span class="form-label" id="emailError" style="color: red; font-size: 14px;"> </span>
            </div>

            <div class="mb-3">
                <label for="phone" class="form-label">Mobile Number</label>
                <input type="number" class="form-control" id="phone" name="phone" onblur="phoneValidation()">
                <span class="form-label" id="phoneError" style="color: red; font-size: 14px;"> </span>
            </div>

            <div class="d-flex justify-content-center mt-4">
                <button type="submit" class="btn btn-primary" id="submitButton" disabled>Submit</button>
            </div>
        </form>
    </div>

    <script src="contactDetails.js"></script>
</body>

</html>
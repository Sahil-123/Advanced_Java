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

    <title>Details Data</title>
</head>

<body>
    <div class="container d-flex justify-content-center">
        <form action="nameRegister" method="POST" class="shadow-lg p-3 mb-5 bg-body rounded "
            style="width: 60%; margin-top: 20px; margin-bottom: 10px; padding: 20px;">

            <div class="mb-3">
                <label for="fname" class="form-label">Full Name</label>
                <input type="text" class="form-control" id="fname" name="fname" onblur="fnameValidation()">
                <span class="form-label" id="fnameError" style="color: red; font-size: 14px;"> </span>
            </div>

            <div class="mb-3">
                <label for="lname" class="form-label">Last Name</label>
                <input type="text" class="form-control" id="lname" name="lname" onblur="lnameValidation()">
                <span class="form-label" id="lnameError" style="color: red; font-size: 14px;"> </span>
            </div>

            <div class="d-flex justify-content-center mt-4">
                <button type="submit" class="btn btn-primary" id="submitButton" disabled>Submit</button>
            </div>
        </form>
    </div>

    <script src="index.js"></script>

</body>

</html>
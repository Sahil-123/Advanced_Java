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
    <style>
        table {
            width: auto;
            border-collapse: collapse;
        }

        th,
        td {
            padding: 8px;
            text-align: left;
        }
    </style>
    <title>Result</title>
</head>

<body>
    <div class="container d-flex justify-content-center">
        <form action="#" class="shadow-lg p-3 mb-5 bg-body rounded "
            style="width: 60%; margin-top: 20px; margin-bottom: 10px; padding: 20px;">

            <div class="d-flex justify-content-center">
                <h4>Complete Details :</h4>
                <br>
                <br>
            </div>

            <table>
            <tr>
                                <td>First Name</td>
                                <td>
                                    <%= request.getParameter("fname") %>
                                </td>

                            </tr>
                            <tr>
                                <td>Last Name</td>
                                <td>
                                    <%= request.getParameter("lname") %>
                                </td>
                            </tr>
                <tr>
                    <td>Email</td>
                    <td>
                        <%= request.getParameter("email") %>
                    </td>

                </tr>
                <tr>
                    <td>Mobile</td>
                    <td>
                        <%= request.getParameter("phone") %>
                    </td>
                </tr>
            </table>

        </form>
    </div>
</body>

</html>
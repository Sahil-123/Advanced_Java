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

    <title>Success</title>

    <style>
        table {
          width: auto;
          border-collapse: collapse;
        }

        th, td {
          padding: 8px;
          text-align: left;
        }

    </style>
</head>
<body>
    <nav class="navbar sticky-top navbar-expand-lg navbar-light" style="background-color: #e3f2fd;">
        <div class="container-fluid container">
            <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarTogglerDemo03"
                aria-controls="navbarTogglerDemo03" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <a class="navbar-brand" href="index.html">
                <!-- <img src="xworkz-logo.png" style="width: 70px; height:30px; " /> -->
                Indian Premier League
            </a>

            <div class="collapse navbar-collapse" id="navbarTogglerDemo03">
                <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                </ul>

                <ul class="navbar-nav">
                    <li class="nav-item">
                        <a class="nav-link" aria-current="page" href="index.html">Home</a>
                    </li>
                    <!-- <li class="nav-item">
                <a class="nav-link" href="about.html">About</a>
              </li> -->
                    <li class="nav-item">
                        <div class="dropdown">
                            <a class=" nav-link" href="#" role="button" id="dropdownMenuLink" data-bs-toggle="dropdown"
                                aria-expanded="false">
                                Applications
                            </a>
                            <ul class="dropdown-menu" aria-labelledby="dropdownMenuLink">
                                <a class="dropdown-item" href="IPLRegistrationFrom.html">IPL Registration </a>
                            </ul>
                        </div>
                    </li>
                </ul>
            </div>
        </div>
    </nav>
    <div class="container mt-5 mb-5">
        <div class="card text-center">
            <div class="card-header bg-success text-white">
              <h4>Your request is processing.... </h4>
            </div>
            <div class="card-body d-flex justify-content-center">
                <table>
                    <tr>
                        <td>Full Name</td>
                        <td><%= request.getAttribute("fullname") != null ? request.getAttribute("fullname") : "" %></td>
                    </tr>
                    <tr>
                        <td>Date of Birth</td>
                        <td><%= request.getAttribute("dob") != null ? request.getAttribute("dob") : "" %></td>
                    </tr>
                    <tr>
                        <td>Nationality</td>
                        <td><%= request.getAttribute("nationality") != null ? request.getAttribute("nationality") : "" %></td>
                    </tr>
                    <tr>
                        <td>Phone</td>
                        <td><%= request.getAttribute("phone") != null ? request.getAttribute("phone") : "" %></td>
                    </tr>
                    <tr>
                        <td>Address</td>
                        <td><%= request.getAttribute("address") != null ? request.getAttribute("address") : "" %></td>
                    </tr>
                    <tr>
                        <td>Preference</td>
                        <td><%= request.getAttribute("preference") != null ? request.getAttribute("preference") : "" %></td>
                    </tr>
                    <tr>
                        <td>Team Role</td>
                        <td><%= request.getAttribute("teamRole") != null ? request.getAttribute("teamRole") : "" %></td>
                    </tr>
                    <tr>
                        <td>Emergency Phone</td>
                        <td><%= request.getAttribute("ePhone") != null ? request.getAttribute("ePhone") : "" %></td>
                    </tr>
                    <tr>
                        <td>Height</td>
                        <td><%= request.getAttribute("height") != null ? request.getAttribute("height") : "" %></td>
                    </tr>
                    <tr>
                        <td>Weight</td>
                        <td><%= request.getAttribute("weight") != null ? request.getAttribute("weight") : "" %></td>
                    </tr>
                    <tr>
                        <td>Jersey Size</td>
                        <td><%= request.getAttribute("jerseySize") != null ? request.getAttribute("jerseySize") : "" %></td>
                    </tr>
                    <tr>
                        <td>Terms and Conditions</td>
                        <td><%= request.getAttribute("termCondition") != null ? (request.getAttribute("termCondition").equals("on") ? "Yes": "No") : "" %></td>
                    </tr>
                </table>
            </div>
          </div>

    </div>
</body>
</html>
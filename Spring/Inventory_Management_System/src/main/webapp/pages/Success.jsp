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

        <div class="container mt-5 mb-5 shadow p-3 mb-5 bg-body rounded formContainer">

              <div class="mb-3">
                     <h1 class="text-success d-flex justify-content-center">${msg}</h1>
              </div>

        </div>

</body>

</html>

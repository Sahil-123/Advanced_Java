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

    <title>My Feedback</title>
</head>

<body>

    <%@ include file="../component/Header.jsp" %>

    <div class="container mb-3">
        <div class="container mt-3 shadow p-3 bg-body rounded formContainer">
            <div class="d-flex justify-content-center">
                <h2>Search Feedback</h2>
            </div>
            <br />

            <span class="compulsary">
                <h4>${errorMsg}</h4>

                <c:forEach items="${errors}" var="objectError">
                    "${objectError.defaultMessage}" <br>
                </c:forEach>
            </span>

            <form action="feedback/findName" method="GET">
                <div class="mb-3">
                    <label for="name" class="form-label">Enter Name</label>
                    <input type="text" class="form-control" name="name" id="name" minlength="3" maxlength="30" value="${dto.name}" />
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

            <div class=" mt-5 d-flex justify-content-center">

                                   <span>
                                         <h4>${recordsInfo}</h4>
                                   </span>
            </div>

         </div>

         <c:if test="${list != null}">
                                 <br>
                                 <div class="mt-3 d-flex flex-column justify-content-center">
                                     <div class="mt-3 d-flex justify-content-center">
                                         <h4>Feedback Details</h4>
                                     </div>
                                     <hr>
                                     <table border="0" class="table">
                                         <thead>
                                             <tr>
                                                 <th scope="col"><strong>Id</strong></th>
                                                 <th scope="col"><strong>Name</strong></th>
                                                 <th scope="col"><strong>Email</strong></th>
                                                 <th scope="col"><strong>Password</strong></th>
                                                 <th scope="col"><strong>Emotions</strong></th>
                                                 <th scope="col"><strong>Satisfaction</strong></th>
                                                 <th scope="col"><strong>Comments</strong></th>
                                             </tr>
                                         </thead>
                                         <c:forEach items="${list}" var="feedback">
                                             <tr>
                                                 <td>${feedback.id}</td>
                                                 <td>${feedback.name}</td>
                                                 <td>${feedback.email}</td>
                                                 <td>${feedback.password}</td>
                                                 <td>${feedback.emotions}</td>
                                                 <td>${feedback.satisfaction}</td>
                                                 <td>${feedback.comments}</td>
                                             </tr>
                                         </c:forEach>
                                     </table>
                                 </div>

                     </c:if>
    </div>

</body>

</html>

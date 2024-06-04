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
                <h2>My Feedback Form</h2>
            </div>
            <br />

            <span class="compulsary">
                <h4>${errorMsg}</h4>

                <c:forEach items="${errors}" var="objectError">
                    "${objectError.defaultMessage}" <br>
                </c:forEach>
            </span>

            <form action="feedback/submitFeedback" method="POST">
                <div class="mb-3">
                    <label for="name" class="form-label">Name</label>
                    <input type="text" class="form-control" name="name" id="name" minlength="3" maxlength="30" value="${dto.name}" />
                </div>

                <div class="mb-3">
                    <label for="email" class="form-label">Email</label>
                    <input type="email" class="form-control" name="email" id="email" value="${dto.email}" />
                </div>

                <div class="mb-3">
                    <label for="password" class="form-label">Password</label>
                    <input type="password" class="form-control" name="password" id="password" minlength="6" value="${dto.password}" />
                </div>

                <div class="mb-3">
                    <label class="form-label">Please check all the emotions that apply to you</label>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="angry" name="emotions" id="angry" ${dto.emotions.contains('angry') ? 'checked' : ''} />
                        <label class="form-check-label" for="angry"> Angry </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="sad" name="emotions" id="sad" ${dto.emotions.contains('sad') ? 'checked' : ''} />
                        <label class="form-check-label" for="sad"> Sad </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="happy" name="emotions" id="happy" ${dto.emotions.contains('happy') ? 'checked' : ''} />
                        <label class="form-check-label" for="happy"> Happy </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="checkbox" value="ambivalent" name="emotions" id="ambivalent" ${dto.emotions.contains('ambivalent') ? 'checked' : ''} />
                        <label class="form-check-label" for="ambivalent"> Ambivalent </label>
                    </div>
                </div>

                <div class="mb-3">
                    <label class="form-label">How satisfied were you with our service</label>
                    <div class="form-check">
                        <input class="form-check-input" type="radio" value="very satisfied" name="satisfaction" id="verySatisfied" ${dto.satisfaction eq 'very satisfied' ? 'checked' : ''} />
                        <label class="form-check-label" for="verySatisfied"> Very Satisfied </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="radio" value="satisfied" name="satisfaction" id="satisfied" ${dto.satisfaction eq 'satisfied' ? 'checked' : ''} />
                        <label class="form-check-label" for="satisfied"> Satisfied </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="radio" value="didn't care" name="satisfaction" id="didntCare" ${dto.satisfaction eq 'didn\'t care' ? 'checked' : ''} />
                        <label class="form-check-label" for="didntCare"> Didn't Care </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="radio" value="dissatisfied" name="satisfaction" id="dissatisfied" ${dto.satisfaction eq 'dissatisfied' ? 'checked' : ''} />
                        <label class="form-check-label" for="dissatisfied"> Dissatisfied </label>
                    </div>
                    <div class="form-check">
                        <input class="form-check-input" type="radio" value="very dissatisfied" name="satisfaction" id="veryDissatisfied" ${dto.satisfaction eq 'very dissatisfied' ? 'checked' : ''} />
                        <label class="form-check-label" for="veryDissatisfied"> Very Dissatisfied </label>
                    </div>
                </div>

                <div class="mb-3">
                    <label for="comments" class="form-label">Further Comments</label>
                    <textarea class="form-control" id="comments" rows="3" maxlength="300" name="comments">${dto.comments}</textarea>
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
        </div>
    </div>

</body>

</html>

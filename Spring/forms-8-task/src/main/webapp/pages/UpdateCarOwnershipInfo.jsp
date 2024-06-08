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

    <title>Update Information of Car Ownership</title>
</head>

<body>
    <%@ include file="../component/Header.jsp" %>

    <div class="container mb-3">
        <div class="container mt-3 shadow p-3 bg-body rounded formContainer">


            <form action="carOwnership/save" method="POST">
                <div class="d-flex justify-content-center">
                    <h2>Update Information of Car Ownership</h2>
                </div>

                <br />
                <span class="compulsary">
                                            <h4>${errorMsg}</h4>

                                <c:forEach items="${errors}" var="objectError">
                                    "${objectError.defaultMessage}" <br>
                                </c:forEach>
                            </span>

                <div class="mb-3 mt-2">
                    <label for="firstName" class="form-label">First Name <span class="compulsary">*</span></label>
                    <input type="text" class="form-control" name="firstName" id="firstName" value="${dto.firstName}" />
                    <span id="firstNameError" class="error"></span>
                </div>

                <div class="mb-3">
                    <label for="lastName" class="form-label">Last Name <span class="compulsary">*</span></label>
                    <input type="text" class="form-control" name="lastName" id="lastName" value="${dto.lastName}" />
                    <span id="lastNameError" class="error"></span>
                </div>

                <div class="mb-3">
                    <label for="favoriteSport" class="form-label">Favorite Sport <span class="compulsary">*</span></label>
                    <select id="favoriteSport" name="favoriteSport" class="form-select">
                        <option value="">Select sport</option>
                        <option value="Soccer" ${dto.favoriteSport eq 'Soccer' ? 'selected' : ''}>Soccer</option>
                        <option value="Basketball" ${dto.favoriteSport eq 'Basketball' ? 'selected' : ''}>Basketball</option>
                        <option value="Cricket" ${dto.favoriteSport eq 'Cricket' ? 'selected' : ''}>Cricket</option>
                        <option value="Tennis" ${dto.favoriteSport eq 'Tennis' ? 'selected' : ''}>Tennis</option>
                        <option value="Baseball" ${dto.favoriteSport eq 'Baseball' ? 'selected' : ''}>Baseball</option>
                        <option value="Rugby" ${dto.favoriteSport eq 'Rugby' ? 'selected' : ''}>Rugby</option>
                        <option value="Golf" ${dto.favoriteSport eq 'Golf' ? 'selected' : ''}>Golf</option>
                        <option value="Swimming" ${dto.favoriteSport eq 'Swimming' ? 'selected' : ''}>Swimming</option>
                        <option value="Hockey" ${dto.favoriteSport eq 'Hockey' ? 'selected' : ''}>Hockey</option>
                        <option value="Cycling" ${dto.favoriteSport eq 'Cycling' ? 'selected' : ''}>Cycling</option>
                    </select>
                    <span class="error" id="favoriteSportError"></span>
                </div>

                <div class="mb-3">
                    <label for="gender" class="form-label">Gender <span class="compulsary">*</span></label>
                    <div id="gender">
                        <div class="form-check">
                            <input class="form-check-input" type="radio" value="Male" name="gender" id="male" ${dto.gender eq 'Male' ? 'checked' : ''} />
                            <label class="form-check-label" for="male"> Male </label>
                        </div>
                        <div class="form-check">
                            <input class="form-check-input" type="radio" value="Female" name="gender" id="female" ${dto.gender eq 'Female' ? 'checked' : ''} />
                            <label class="form-check-label" for="female"> Female </label>
                        </div>
                        <div class="form-check">
                            <input class="form-check-input" type="radio" value="Other" name="gender" id="other" ${dto.gender eq 'Other' ? 'checked' : ''} />
                            <label class="form-check-label" for="other"> Other </label>
                        </div>
                    </div>
                </div>

                <div class="mb-3">
                    <label for="stateResidence" class="form-label">State Residence <span class="compulsary">*</span></label>
                    <select id="stateResidence" name="stateResidence" class="form-select">
                        <option value="">Select state</option>
                        <option value="Maharashtra" ${dto.stateResidence eq 'Maharashtra' ? 'selected' : ''}>Maharashtra</option>
                        <option value="Karnataka" ${dto.stateResidence eq 'Karnataka' ? 'selected' : ''}>Karnataka</option>
                        <option value="Tamil Nadu" ${dto.stateResidence eq 'Tamil Nadu' ? 'selected' : ''}>Tamil Nadu</option>
                        <option value="Gujarat" ${dto.stateResidence eq 'Gujarat' ? 'selected' : ''}>Gujarat</option>
                        <option value="Rajasthan" ${dto.stateResidence eq 'Rajasthan' ? 'selected' : ''}>Rajasthan</option>
                        <option value="Punjab" ${dto.stateResidence eq 'Punjab' ? 'selected' : ''}>Punjab</option>
                        <option value="Kerala" ${dto.stateResidence eq 'Kerala' ? 'selected' : ''}>Kerala</option>
                        <option value="West Bengal" ${dto.stateResidence eq 'West Bengal' ? 'selected' : ''}>West Bengal</option>
                        <option value="Uttar Pradesh" ${dto.stateResidence eq 'Uttar Pradesh' ? 'selected' : ''}>Uttar Pradesh</option>
                        <option value="Madhya Pradesh" ${dto.stateResidence eq 'Madhya Pradesh' ? 'selected' : ''}>Madhya Pradesh</option>
                    </select>
                    <span class="error" id="stateResidenceError"></span>
                </div>

                <div class="mb-3">
                    <label for="carOwned" class="form-label">Car Owned <span class="compulsary">*</span></label>
                    <div id="carOwned">
                        <div class="form-check">
                            <input class="form-check-input" type="checkbox" value="Toyota" name="carOwned" ${dto.carOwned.contains('Toyota') ? 'checked' : ''} />
                            <label class="form-check-label" for="toyota"> Toyota </label>
                        </div>
                        <div class="form-check">
                            <input class="form-check-input" type="checkbox" value="Honda" name="carOwned" ${dto.carOwned.contains('Honda') ? 'checked' : ''} />
                            <label class="form-check-label" for="honda"> Honda </label>
                        </div>
                        <div class="form-check">
                            <input class="form-check-input" type="checkbox" value="Ford" name="carOwned" ${dto.carOwned.contains('Ford') ? 'checked' : ''} />
                            <label class="form-check-label" for="ford"> Ford </label>
                        </div>
                        <div class="form-check">
                            <input class="form-check-input" type="checkbox" value="Chevrolet" name="carOwned" ${dto.carOwned.contains('Chevrolet') ? 'checked' : ''} />
                            <label class="form-check-label" for="chevrolet"> Chevrolet </label>
                        </div>
                        <div class="form-check">
                            <input class="form-check-input" type="checkbox" value="BMW" name="carOwned" ${dto.carOwned.contains('BMW') ? 'checked' : ''} />
                            <label class="form-check-label" for="bmw"> BMW </label>
                        </div>
                        <div class="form-check">
                            <input class="form-check-input" type="checkbox" value="Audi" name="carOwned" ${dto.carOwned.contains('Audi') ? 'checked' : ''} />
                            <label class="form-check-label" for="audi"> Audi </label>
                        </div>
                        <div class="form-check">
                            <input class="form-check-input" type="checkbox" value="Mercedes" name="carOwned" ${dto.carOwned.contains('Mercedes') ? 'checked' : ''} />
                            <label class="form-check-label" for="mercedes"> Mercedes </label>
                        </div>
                        <div class="form-check">
                            <input class="form-check-input" type="checkbox" value="Hyundai" name="carOwned" ${dto.carOwned.contains('Hyundai') ? 'checked' : ''} />
                            <label class="form-check-label" for="hyundai"> Hyundai </label>
                        </div>
                        <div class="form-check">
                            <input class="form-check-input" type="checkbox" value="Nissan" name="carOwned" ${dto.carOwned.contains('Nissan') ? 'checked' : ''} />
                            <label class="form-check-label" for="nissan"> Nissan </label>
                        </div>
                        <div class="form-check">
                            <input class="form-check-input" type="checkbox" value="Volkswagen" name="carOwned" ${dto.carOwned.contains('Volkswagen') ? 'checked' : ''} />
                            <label class="form-check-label" for="volkswagen"> Volkswagen </label>
                        </div>
                    </div>
                    <span id="carOwnedError" class="error"></span>
                </div>

                <div class="d-flex justify-content-evenly mt-4">
                    <button type="submit" class="btn btn-primary" id="submitButton">
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

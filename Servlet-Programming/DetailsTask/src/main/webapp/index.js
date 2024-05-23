let fieldsChecks = {
    "fname" : false,
    "lname" : false
}

function validateAndEnableSubmit() {
    let flag = false;

    for (let [key, value] of Object.entries(fieldsChecks)) {

        if (value === false) {
            flag = true;
            break;
        }
    }

    if (!flag) {
        document.getElementById("submitButton").removeAttribute("disabled");
    } else {
        document.getElementById("submitButton").setAttribute("disabled", "");
    }
}

function fnameValidation() {
    let element = document.getElementById("fname");
    let error = document.getElementById("fnameError");

    if (element.value.trim().length >= 5 && element.value.trim().length <= 15) {
        error.innerHTML = "";
        fieldsChecks["fname"] = true;
    } else {
        error.innerHTML = "Please enter valid first name.";
        fieldsChecks["fname"] = false;

    }
    validateAndEnableSubmit();
}

function lnameValidation() {
    let element = document.getElementById("lname");
    let error = document.getElementById("lnameError");

    if (element.value.trim().length >= 5 && element.value.trim().length <= 15) {
        error.innerHTML = "";
        fieldsChecks["lname"] = true;
    } else {
        error.innerHTML = "Please enter valid last name.";
        fieldsChecks["lname"] = false;

    }
    validateAndEnableSubmit();
}


let fieldsChecks = {
    "email" : false,
    "phone" : false
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


function emailValidation(){
    let element = document.getElementById("email");
    let error = document.getElementById("emailError");

    const re = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;

    if(re.test(element.value)){
        error.innerHTML = "";
        fieldsChecks["email"] = true;
    }else{
        error.innerHTML = "Please enter valid E-mail.";
        fieldsChecks["email"] = false;
        
    }
    validateAndEnableSubmit();
}

function phoneValidation(){
    let element = document.getElementById("phone");
    let error = document.getElementById("phoneError");

    const re = /^\(?\d{3}\)?[-.\s]?\d{3}[-.\s]?\d{4}$/;

    if(re.test(element.value)){
        error.innerHTML = "";
        fieldsChecks["phone"] = true;
    }else{
        error.innerHTML = "Please enter valid 10-digit Phone number.";
        fieldsChecks["phone"] = false;
        
    }
    validateAndEnableSubmit();
}


let fieldsChecks = {
    "fullname" : false,
    "email" : false,
    "phone" : false,
    "address" : false,
    // "setOfBoxType" : false,
    "subcription" : false,
    "termCondition" : false
}

function validateAndEnableSubmit(){
    let flag = false;

    for(let [key, value] of Object.entries(fieldsChecks)){

        if(value === false){
            flag = true;
            break;
        }
    }

    if(!flag){
        document.getElementById("submitButton").removeAttribute("disabled");
    }else{
        document.getElementById("submitButton").setAttribute("disabled","");
    }
}

function fullNameValidation(){
    let element = document.getElementById("fullname");
    let error = document.getElementById("fullnameError");

    if(element.value.trim().length >= 10 && element.value.trim().length <= 30){
        error.innerHTML = "";
        fieldsChecks["fullname"] = true;
    }else{
        error.innerHTML = "Please enter valid full name. characters should be in between 10 to 30";
        fieldsChecks["fullname"] = false;
        
    }
    validateAndEnableSubmit();
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

function addressValidation(){
    let element = document.getElementById("address");
    let error = document.getElementById("addressError");

    if(element.value.trim().length >= 10 && element.value.trim().length <= 50){
        error.innerHTML = "";
        fieldsChecks["address"] = true;
    }else{
        error.innerHTML = "Please enter valid address. It should be 10 to 50 character";
        fieldsChecks["address"] = false;
    }
    validateAndEnableSubmit();
}

function planValidation(){
    let element = document.getElementById("subcription");
    let error = document.getElementById("subcriptionError");

    if(element.value != "0"){
        error.innerHTML = "";
        fieldsChecks["subcription"] = true;
    }else{
        error.innerHTML = "Please select subcription plan";
        fieldsChecks["subcription"] = false;
    }
    validateAndEnableSubmit()
}

function termConditionValidation(){
    let element = document.getElementById("termCondition");
    let error = document.getElementById("termConditionError");

    if(element.checked){
        error.innerHTML = "";
        fieldsChecks["termCondition"] = true;
    }else{
        error.innerHTML = "Please check the terms and condition";
        fieldsChecks["termCondition"] = false;
    }
    
    validateAndEnableSubmit()
    console.log(element.value);
}
let fieldsChecks = {
    "fullname": false,
    "dob": false,
    "nationality" : false,
    "phone": false,
    "address": false,
    "preference" : false,
    "teamRole" : false,
    "ePhone" : false,
    "height" : false,
    "weight" : false,
    "jerseySize" : false,
    "termCondition": false
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


function fullNameValidation() {
    let element = document.getElementById("fullname");
    let error = document.getElementById("fullnameError");

    if (element.value.trim().length >= 10 && element.value.trim().length <= 30) {
        error.innerHTML = "";
        fieldsChecks["fullname"] = true;
    } else {
        error.innerHTML = "Please enter valid full name. characters should be in between 10 to 30";
        fieldsChecks["fullname"] = false;

    }
    validateAndEnableSubmit();
}


function dobValidation(){
    let dobInput = document.getElementById('dob');
    let dob = new Date(dobInput.value);
    let dobError = document.getElementById('dobError');

    if (isNaN(dob.getTime())) {
        dobError.innerHTML = 'Please enter a valid date of birth';
        fieldsChecks["dob"] = false;
    } else if (dob > new Date()) {
        dobError.innerHTML = 'Date of birth cannot be in the future';
        fieldsChecks["dob"] = false;
    } else {
        dobError.innerHTML = '';
        fieldsChecks["dob"] = true;
    }

    validateAndEnableSubmit();
}

function nationalityValidation(){
    let element = document.getElementById("nationality");
    let error = document.getElementById("nationalityError");

    if(element.value != "0"){
        error.innerHTML = "";
        fieldsChecks["nationality"] = true;
    }else{
        error.innerHTML = "Please select nationality";
        fieldsChecks["nationality"] = false;
    }
    validateAndEnableSubmit()
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

function preferenceValidation(){
    let element = document.getElementById("preference");
    let error = document.getElementById("preferenceError");

    if(element.value != "0"){
        error.innerHTML = "";
        fieldsChecks["preference"] = true;
    }else{
        error.innerHTML = "Please select team preference";
        fieldsChecks["preference"] = false;
    }
    validateAndEnableSubmit();
}

function teamRoleValidation(){
    let element = document.getElementById("teamRole");
    let error = document.getElementById("teamRoleError");

    if(element.value != "0"){
        error.innerHTML = "";
        fieldsChecks["teamRole"] = true;
    }else{
        error.innerHTML = "Please select team role";
        fieldsChecks["teamRole"] = false;
    }
    validateAndEnableSubmit();
}

function bloodValidation(){
    let element = document.getElementById("blood");
    let error = document.getElementById("bloodError");

    if(element.value != "0"){
        error.innerHTML = "";
        fieldsChecks["blood"] = true;
    }else{
        error.innerHTML = "Please select blood group";
        fieldsChecks["blood"] = false;
    }
    validateAndEnableSubmit();
}


function heightValidation(){
    let element = document.getElementById("height");
    let error = document.getElementById("heightError");

    let height = element.value == "" ? 0 : parseFloat(element.value);

    if(height > 151.0 && height < 200.0){
        error.innerHTML = "";
        fieldsChecks["height"] = true;
    }else{
        error.innerHTML = "Please Enter proper height";
        fieldsChecks["height"] = false;
    }
    validateAndEnableSubmit();

}

function weightValidation(){
    let element = document.getElementById("weight");
    let error = document.getElementById("weightError");

    let weight = element.value == "" ? 0 : parseFloat(element.value);

    if(weight > 52.0 && weight < 68.0){
        error.innerHTML = "";
        fieldsChecks["weight"] = true;
    }else{
        error.innerHTML = "Please Enter proper weight";
        fieldsChecks["weight"] = false;
    }
    validateAndEnableSubmit();
}




function ePhoneValidation(){
    let element = document.getElementById("ePhone");
    let error = document.getElementById("ePhoneError");
    
    const re = /^\(?\d{3}\)?[-.\s]?\d{3}[-.\s]?\d{4}$/;
    
    if(re.test(element.value)){
        error.innerHTML = "";
        fieldsChecks["ePhone"] = true;
    }else{
        error.innerHTML = "Please enter valid 10-digit Phone number.";
        fieldsChecks["ePhone"] = false;
        
    }
    validateAndEnableSubmit();
}

function jerseySizeValidation(){
    let element = document.getElementById("jerseySize");
    let error = document.getElementById("jerseySizeError");

    if(element.value != "0"){
        error.innerHTML = "";
        fieldsChecks["jerseySize"] = true;
    }else{
        error.innerHTML = "Please select Jersey Size";
        fieldsChecks["jerseySize"] = false;
    }
    validateAndEnableSubmit();
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
    // console.log(element.value);
}


let fieldsChecks = {
    "customerId" : false,
    "vendor" : false,
    "amount" : false,
    "rechargeType" : false,
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

function customerIdValidation(){
    let element = document.getElementById("customerId");
    let error = document.getElementById("customerIdError");

    if(element.value.trim().length == 8){
        error.innerHTML = "";
        fieldsChecks["customerId"] = true;
    }else{
        error.innerHTML = "Invalid Customer ID. ID should be 8 character long";
        fieldsChecks["customerId"] = false;

    }
    validateAndEnableSubmit();
}

function vendorValidation(){
    let element = document.getElementById("vendor");
    let error = document.getElementById("vendorError");

    if(element.value != "0"){
        error.innerHTML = "";
        fieldsChecks["vendor"] = true;
    }else{
        error.innerHTML = "Please select vendor";
        fieldsChecks["vendor"] = false;
    }
    validateAndEnableSubmit()
}

function amountValidation(){
    let element = document.getElementById("amount");
    let error = document.getElementById("amountError");
    let amount = element.value == "" ? 0 : parseInt(element.value);

    if(amount >= 10 && amount <= 10000){
        error.innerHTML = "";
        fieldsChecks["amount"] = true;
    }else{
        error.innerHTML = "Recharge amount shoubld be 10 - 10,000";
        fieldsChecks["amount"] = false;
    }
    validateAndEnableSubmit()
}

function rechargeTypeValidation(){
    let element = document.getElementById("rechargeType");
    let error = document.getElementById("rechargeTypeError");

    if(element.value != "0"){
        error.innerHTML = "";
        fieldsChecks["rechargeType"] = true;
    }else{
        error.innerHTML = "Please select recharge type";
        fieldsChecks["rechargeType"] = false;
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
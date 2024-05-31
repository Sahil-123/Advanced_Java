//let url = "http://127.0.0.1:5500/JavaScript/class%206/"
//
//let dataList = [];
//
//let data = {
//  "name": false,
//  "email": false,
//  "description": false,
//  "gender": false,
//  "country":false,
//  "termsAndCondition":false
//};
//
//
//function validateAndEnableSubmit(){
//    let flag = false;
//
//    for(let [key, value] of Object.entries(data)){
//
//        if(value === false){
//            flag = true;
//            break;
//        }
//    }
//
//    if(!flag){
//        document.getElementById("submitButton").removeAttribute("disabled");
//    }else{
//        document.getElementById("submitButton").setAttribute("disabled","");
//    }
//}
//
//
//function nameValidation() {
//
//    let elementName = "name";
//    let elementError = "nameError";
//    let element = document.getElementById(elementName);
//    let error = document.getElementById(elementError);
//
//    const regex = /^[A-Za-z\s]{3,30}$/;
//    console.log(regex.test(element.value));
//
//    if (regex.test(element.value)) {
//        error.innerHTML = "";
//        data["name"] = true;
//    } else {
//        error.innerHTML = "Invalid Name. Name should be minimum 3 characters and maximum 30 characters, with only letters and spaces.";
//        data["name"] = false;
//    }
//    validateAndEnableSubmit();
//}
//
//
//function emailValidation() {
//    let elementName = "email";
//    let elementError = "emailError";
//    let element = document.getElementById(elementName);
//    let error = document.getElementById(elementError);
//
//  const emailPattern = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,6}$/;
//  if (emailPattern.test(element.value)) {
//      error.innerHTML = "";
//      data[elementName] = true;
//  }else{
//      error.innerHTML = " Invalid Email.";
//      data[elementName] = false;
//  }
//  validateAndEnableSubmit()
//}
//
//function descriptionValidation() {
//  let elementName = "description";
//  let elementError = "descriptionError";
//  let element = document.getElementById(elementName);
//  let error = document.getElementById(elementError);
//
//  if(element.value.length <=300 && element.value.length >= 3){
//      error.innerHTML = "";
//      data[elementName] = true;
//  }else{
//      error.innerHTML = " Comment should be minimum 3 character and maximum 300 character.";
//      data[elementName] = false;
//  }
//  validateAndEnableSubmit()
//}
//
//
//function genderValidation() {
//    let elementName = "gender";
//    let elementError = "genderError";
//    let male = document.getElementById("male");
//    let female = document.getElementById("female");
//    // let error = document.getElementById(elementError);
//
//    if (male.checked || female.checked) {
//        // error.innerHTML = "";
//        data[elementName] = true;
//    } else {
//        // error.innerHTML = "Please select a gender.";
//        data[elementName] = false;
//    }
//    validateAndEnableSubmit();
//  }
//
//  function countryValidation() {
//    let elementName = "country";
//    let elementError = "countryError";
//    let element = document.getElementById(elementName);
//    let error = document.getElementById(elementError);
//
//    if (element.value) {
//        error.innerHTML = "";
//        data[elementName] = true;
//    } else {
//        error.innerHTML = "Please select a country.";
//        data[elementName] = false;
//    }
//    validateAndEnableSubmit();
//  }
//
//  function termsAndConditionValidation() {
//    let elementName = "termsAndCondition";
//    let elementError = "termsAndConditionError";
//    let element = document.getElementById(elementName);
//    let error = document.getElementById(elementError);
//
//    if (element.checked) {
//        error.innerHTML = "";
//        data[elementName] = true;
//    } else {
//        error.innerHTML = "You must agree to the terms and conditions.";
//        data[elementName] = false;
//    }
//    validateAndEnableSubmit();
//}
//

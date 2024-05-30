//let url = "http://127.0.0.1:5500/JavaScript/class%206/"
//
//let dataList = [];
//
//let data = {
//  "vendor":false,
//  "name": false,
//  "email": false,
//  "purchaseDate": false,
//  "problemDescription": false,
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
//function vendorNameValidation() {
//    let element = document.getElementById("vendor");
//    let error = document.getElementById("vendorNameError");
//
//    let regex = /^[A-Za-z\s]{3,30}$/;
//    console.log(regex.test(element.value));
//
//    if (regex.test(element.value)) {
//        error.innerHTML = "";
//        data["vendor"] = true;
//    } else {
//        error.innerHTML = "Invalid vendor Name. Name should be minimum 3 characters and maximum 30 characters, with only letters and spaces.";
//        data["vendor"] = false;
//    }
//    validateAndEnableSubmit();
//}
//
//
//function nameValidation() {
//    let element = document.getElementById("name");
//    let error = document.getElementById("nameError");
//
//    let regex = /^[A-Za-z\s]{3,30}$/;
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
//  let element = document.getElementById("email");
//  let error = document.getElementById("emailError");
//
//  const emailPattern = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,6}$/;
//  if (emailPattern.test(element.value)) {
//      error.innerHTML = "";
//      data["email"] = true;
//  }else{
//      error.innerHTML = " Invalid Email.";
//      data["email"] = false;
//  }
//  validateAndEnableSubmit()
//}
//
//
//
//function purchaseDateValidation() {
//    let element = document.getElementById("purchaseDate");
//    let error = document.getElementById("purchaseDateError");
//
//    // Check if the date is valid and not in the future
//    let selectedDate = new Date(element.value);
//    let currentDate = new Date();
//
//    if (element.value && selectedDate <= currentDate) {
//      error.innerHTML = "";
//      data["purchaseDate"] = true;
//    } else {
//      error.innerHTML = "Please enter a valid date that is not in the future.";
//      data["purchaseDate"] = false;
//    }
//    validateAndEnableSubmit();
//  }
//
//
//
//function problemDescriptionValidation() {
//  let element = document.getElementById("problemDescription");
//  let error = document.getElementById("problemDescriptionError");
//
//  if(element.value.length <=300 && element.value.length >= 3){
//      error.innerHTML = "";
//      data["problemDescription"] = true;
//  }else{
//      error.innerHTML = "  Problem Description should be minimum 3 character and maximum 300 character.";
//      data["problemDescription"] = false;
//  }
//  validateAndEnableSubmit()
//}
//
//
//
//
//
//
//

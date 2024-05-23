let url = "http://127.0.0.1:5500/JavaScript/class%206/"

let dataList = [];

let data = {
  "name": false,
  "email": false,
  "mobile": false,
  "comment": false,
};


function validateAndEnableSubmit(){
    let flag = false;

    for(let [key, value] of Object.entries(data)){

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


function nameValidation() {
  let element = document.getElementById("name");
  let error = document.getElementById("nameError");

  if(element.value.length <=30 && element.value.length >= 3){
      error.innerHTML = "";
      data["name"] = true;
  }else{
      error.innerHTML = " Invalid Name. Name should be minimum 3 character and maximum 30 character.";
      data["name"] = false;
  }
  validateAndEnableSubmit()
}


function mobileValidation() {
  let element = document.getElementById("mobile");
  let error = document.getElementById("mobileError");

  let pattern = /[0-9]{10}/;
  console.log(pattern.test(element.value),element.value.length)
  if(pattern.test(element.value) && element.value.length <= 10){
      error.innerHTML = "";
      data["mobile"] = true;
  }else{
      error.innerHTML = " Invalid Mobile Number.";
      data["mobile"] = false;
  }
  validateAndEnableSubmit()
}

function emailValidation() {
  let element = document.getElementById("email");
  let error = document.getElementById("emailError");

  const emailPattern = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,6}$/;
  if (emailPattern.test(element.value)) {
      error.innerHTML = "";
      data["email"] = true;
  }else{
      error.innerHTML = " Invalid Email.";
      data["email"] = false;
  }
  validateAndEnableSubmit()
}

function commentValidation() {
  let element = document.getElementById("comment");
  let error = document.getElementById("commentError");

  if(element.value.length <=300 && element.value.length >= 3){
      error.innerHTML = "";
      data["comment"] = true;
  }else{
      error.innerHTML = " Comment should be minimum 3 character and maximum 300 character.";
      data["comment"] = false;
  }
  validateAndEnableSubmit()
}








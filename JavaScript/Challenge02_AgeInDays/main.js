/**
 * 
 * @param {*} age 
 * @return Age in years as days
 */
function calcAge(age)   {
    if(age >= 0) {
        return age * 365
    }
    else console.log("Age cannot be negative! :(")
}

console.log(calcAge(24))
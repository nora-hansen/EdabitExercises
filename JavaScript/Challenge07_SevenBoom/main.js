function sevenBoom(arr) {
    var i = 0
    var arr2 = arr.toString(16)
    while(i < arr2.length)  {
        if (arr2[i] == 7)   { return "Boom!" }
        i++
    }
    return "there is no 7 in the array"
}
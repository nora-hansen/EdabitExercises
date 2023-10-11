function availableSpots(arr, num)   {
    let len = arr.length;
    var i = 1, res = 0;

    while (i < len) {
        if((arr[i-1]%2 == num%2) || arr[i]%2 == num%2) res++;
        i++;
    }

    return res;
}
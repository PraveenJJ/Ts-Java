function compareTriplets(arr, brr) {
    var a = 0;
    var b = 0;
    for (var i = 0; i < 3; i++) {
        if (arr[i] == brr[i]) {
            continue;
        }
        else if (arr[i] > brr[i]) {
            a++;
        }
        else {
            b++;
        }
    }
    console.log(a, b);
}
compareTriplets([5, 6, 7], [3, 6, 10]);

function birthdayCandles(n, arr) {
    var high = 0;
    var count = 0;
    for (var i = 0; i < n; i++) {
        if (arr[i] > high) {
            high = arr[i];
            count = 1; // Reset count since we found a new highest
        }
        else if (arr[i] == high) {
            count++;
        }
    }
    console.log(count);
}
birthdayCandles(4, [5, 1, 5, 5]);

function miniMaxSum(arr) {
    var sumX = 0;
    // since tsconfig is not available for this project
    var max = -9007199254740991;
    for (var i = 0; i < 5; i++) {
        if (arr[i] < 1 || arr[i] > 1000000000) {
            throw new Error("Invalid input");
        }
        sumX += arr[i];
    }
    var totalSum = sumX;
    var temp = sumX;
    for (var i = 0; i < 5; i++) {
        sumX = totalSum;
        sumX -= arr[i];
        if (sumX < temp) {
            temp = sumX;
        }
        if (sumX > max) {
            max = sumX;
        }
    }
    console.log(temp + " " + max);
}
miniMaxSum([1, 2, 3, 4, 5]);

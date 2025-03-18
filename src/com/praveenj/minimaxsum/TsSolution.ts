function miniMaxSum(arr: number[]) {
    let sumX = 0;
    // since tsconfig is not available for this project
    let max = -9007199254740991;

    for (let i = 0; i < 5; i++) {
        if (arr[i] < 1 || arr[i] > 1000000000) {
            throw new Error("Invalid input");
        }
        sumX += arr[i];
    }

    let totalSum = sumX;
    let temp = sumX;

    for (let i = 0; i < 5; i++) {
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

miniMaxSum([1, 2, 3, 4, 5])
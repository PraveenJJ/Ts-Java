function simpleArraySum(arr: number[]) {
    let sum = 0;

    for (const num of arr) {
        if (num > 1000) {
            throw new Error("Values in the array should not exceed 1000");
        }
        sum += num;
    }

    console.log(sum);
}

simpleArraySum([1, 2, 3, 4, 10, 11]);
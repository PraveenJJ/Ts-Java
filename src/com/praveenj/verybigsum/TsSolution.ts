function veryBigSum(arr: number[]) {
    // reduce method accepts callback function and initial value
    // callback function will accept accumulator and value
    // initially accumulator will be assigned with initial value 
    // later return value of this call back function will go and sit inside accumulator
    return arr.reduce((sum, num) => sum + num, 0);
}

console.log(veryBigSum([1000000001, 1000000002, 1000000003, 1000000004, 1000000005]));
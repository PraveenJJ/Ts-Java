function veryBigSum(arr) {
    return arr.reduce(function (sum, num) { return sum + num; }, 0);
}
console.log(veryBigSum([1000000001, 1000000002, 1000000003, 1000000004, 1000000005]));

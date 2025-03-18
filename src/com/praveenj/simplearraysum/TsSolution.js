function simpleArraySum(arr) {
    var sum = 0;
    for (var _i = 0, arr_1 = arr; _i < arr_1.length; _i++) {
        var num = arr_1[_i];
        if (num > 1000) {
            throw new Error("Values in the array should not exceed 1000");
        }
        sum += num;
    }
    console.log(sum);
}
simpleArraySum([1, 2, 3, 4, 10, 11]);

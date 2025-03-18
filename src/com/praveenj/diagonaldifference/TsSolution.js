function diagonalDifference(n, arr) {
    var diag = 0;
    var sec = 0;
    for (var i = 0; i < n; i++) {
        for (var j = 0; j < n; j++) {
            if (i == j) {
                diag += arr[i][j];
            }
            if (i + j == n - 1) {
                sec += arr[i][j];
            }
        }
    }
    return Math.abs(diag - sec);
}
var input = [
    [11, 2, 4],
    [4, 5, 6],
    [10, 8, -12]
];
console.log(diagonalDifference(3, input));

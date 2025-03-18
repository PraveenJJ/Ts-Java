function diagonalDifference(n: number, arr: number[][]): number {
    let diag = 0;
    let sec = 0;

    for (let i = 0; i < n; i++) {
        for (let j = 0; j < n; j++) {
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

// declaring and initializing a 2D array
const input = [
    [11, 2, 4],
    [4, 5, 6],
    [10, 8, -12]
];

console.log(diagonalDifference(3, input));
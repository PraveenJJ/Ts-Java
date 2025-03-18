function birthdayCandles(n: number, arr: number[]) {
    let high = 0;
    let count = 0;
    for (let i = 0; i < n; i++) {
        if (arr[i] > high) {
            high = arr[i];
            count = 1; // Reset count since we found a new highest
        } else if (arr[i] == high) {
            count++;
        }
    }
    console.log(count);
}

birthdayCandles(4, [5, 1, 5, 5])
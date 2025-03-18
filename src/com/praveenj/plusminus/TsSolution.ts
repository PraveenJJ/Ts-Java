function plusMinus(arr: number[]) {
    let plus = 0;
    let neg = 0;
    let zer = 0;
    let n = arr.length;

    for (let i = 0; i < n; i++) {
        if (arr[i] > 0) {
            plus++;
        } else if (arr[i] < 0) {
            neg++;
        } else if (arr[i] == 0) {
            zer++;
        }
    }

    plus /= n;
    neg /= n;
    zer /= n;
    console.log("%f\n%f\n%f\n", plus, neg, zer);
}

plusMinus([-4, 3, -9, 0, 4, 1]);
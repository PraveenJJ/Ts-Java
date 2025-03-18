function compareTriplets(arr: number[], brr: number[]) {
    let a = 0;
    let b = 0;

    for (let i = 0; i < 3; i++) {
        if (arr[i] == brr[i]) {
            continue;
        } else if (arr[i] > brr[i]) {
            a++;
        } else {
            b++;
        }
    }

    console.log(a, b);
}

compareTriplets([5, 6, 7], [3, 6, 10])
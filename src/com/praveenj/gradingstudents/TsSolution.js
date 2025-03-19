function gradingStudents(n, arr) {
    var q = 0;
    var ref = 0;
    for (var i = 0; i < n; i++) {
        if (arr[i] >= 38) {
            q = Math.floor(arr[i] / 5); // this is required to ensure q stays integer and not floating point.
            ref = 5 * (q + 1);
            if (ref - arr[i] < 3) {
                arr[i] = ref;
            }
        }
    }
    for (var i = 0; i < n; i++) {
        console.log(arr[i]);
    }
}
gradingStudents(4, [73, 67, 38, 33]);

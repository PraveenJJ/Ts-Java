function staircase(n) {
    for (var i = 0; i < n; i++) {
        var row = '';
        for (var j = 0; j < n; j++) {
            if (j < n - 1 - i) {
                row += ' ';
            }
            else {
                row += '#';
            }
        }
        console.log(row);
    }
}
staircase(6);

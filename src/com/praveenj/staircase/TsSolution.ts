function staircase(n: number) {
    for (let i = 0; i < n; i++) {
        let row = '';
        for (let j = 0; j < n; j++) {
            if (j < n - 1 - i) {
                row += ' ';
            } else {
                row += '#';
            }
        }
        console.log(row);
    }
}

staircase(6);
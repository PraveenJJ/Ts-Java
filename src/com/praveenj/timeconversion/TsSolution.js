function convertTime(digits, meridiem) {
    var arr = digits.split(":");
    var hours = parseInt(arr[0]);
    if (meridiem === "PM") {
        if (hours != 12) {
            hours += 12;
            arr[0] = hours.toString();
        }
    }
    else if (meridiem === "AM") {
        if (hours == 12) {
            arr[0] = "00";
        }
    }
    console.log("".concat(arr[0], ":").concat(arr[1], ":").concat(arr[2]));
}
// Example Usage
convertTime("07:05:45", "PM"); // Output: 19:05:45
convertTime("12:00:00", "AM"); // Output: 00:00:00
convertTime("12:30:00", "PM"); // Output: 12:30:00
convertTime("01:15:20", "AM"); // Output: 01:15:20

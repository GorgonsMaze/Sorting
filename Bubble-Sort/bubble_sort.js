/**
 * Bubble Sort - Javascript
 */

function bubbleSort(lst) {
    var is_sorted = false;
    while (is_sorted == false) {
        var nswaps = 0;
        for (var i = 0; i < lst.length; i++) {
            if (lst[i] > lst[i + 1]) {
                var temp = lst[i + 1];
                lst[i + 1] = lst[i];
                lst[i] = temp;
                nswaps += 1;

            }
        }
        if (nswaps == 0) {
            is_sorted = true;
        }
    }

    return lst;


}


console.log(bubbleSort([0]));
console.log(bubbleSort([1, 2, 3, 4, 5]));
console.log(bubbleSort([5, 4, 3, 2, 1]));
console.log(bubbleSort([4, 5, 3, 1, 2]));


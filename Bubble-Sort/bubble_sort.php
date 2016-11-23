<?php

$nums = array(24, 18, 2, 10, 21, 14, 4);
$arrCount = count($nums);

echo "Before sorting: ";

for ($i = 0; $i < $arrCount; $i++) {
    echo $nums[$i];
    if ($i < $arrCount - 1) {
        echo ", ";
    }
}
echo "<br/>";

function bubbleSort($lst)
{
    $count = count($lst);
    for ($i = 0; $i < $count; $i++) {
        for ($j = 0; $j < $count - 1 - $i; $j++) {
            if ($lst[$j] > $lst[$j + 1]) {
                swapNums($lst, $j, $j + 1);
            }
        }
    }
    return $lst;
}

function swapNums(&$lst, $a, $b)
{
    $temp = $lst[$b];
    $lst[$b] = $lst[$a];
    $lst[$a] = $temp;
    return $lst;
}

$sorted = bubbleSort($nums);
echo "After sorting: ";
for ($k = 0; $k < $arrCount; $k++) {
    echo $sorted[$k];
    if ($k < $arrCount - 1) {
        echo ", ";
    }
}
?>
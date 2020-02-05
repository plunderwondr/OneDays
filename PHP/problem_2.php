<?php
/*
* Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
* 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
* By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.
SOLVED
*/

$HIGHEST_VALUE = 4000000; // FOUR MILLION
// $HIGHEST_VALUE = 38;
$twoPreviousFibonacciValues =array(0,1);
$sumOfEvenFibonacciValues = 0;
for($nextSum= 0; $nextSum <= $HIGHEST_VALUE; $twoPreviousFibonacciValues[1]= $nextSum)
{
    //3 lines of fibonacci sequencing
$nextSum = $twoPreviousFibonacciValues[0] + $twoPreviousFibonacciValues[1];
$twoPreviousFibonacciValues[0]= $twoPreviousFibonacciValues[1];
// $twoPreviousFibonacciValues[1]= $nextSum;
if(($twoPreviousFibonacciValues[1] % 2) == 0)
{
    $sumOfEvenFibonacciValues += $twoPreviousFibonacciValues[1] ;
}

}
echo $sumOfEvenFibonacciValues;


?>
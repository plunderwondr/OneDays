<?php
/*
A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

Find the largest palindrome made from the product of two 3-digit numbers.
COMPLETED
*/

$largestTwoProducts= []; // Store both values

$sumOfTwoProducts = 0; 
$largestSumOfTwoProducts = 0;
$LARGEST_VALUE = 999;
$SMALLEST_VALUE = 100;
$front="";
$back="";
$temp ="";

for($i=$SMALLEST_VALUE;$i < $LARGEST_VALUE; $i++)
{
    for($j=$SMALLEST_VALUE;$j < $LARGEST_VALUE; $j++)
    {
     
        $sumOfTwoProducts = $i * $j;
        
        $stringSizeOfSumOfTwoProducts = strlen($sumOfTwoProducts);
        $front = substr($sumOfTwoProducts,0,floor( $stringSizeOfSumOfTwoProducts/2) );
        $back = substr($sumOfTwoProducts, ceil( $stringSizeOfSumOfTwoProducts/2 ), floor($stringSizeOfSumOfTwoProducts/2) );

        
        if ( $front == strrev($back) AND $sumOfTwoProducts > $largestSumOfTwoProducts)
        {
            $largestSumOfTwoProducts = $sumOfTwoProducts;
            $largestTwoProducts[0] = $i;
            $largestTwoProducts[1] = $j;
        }
    }// for j
}//for i

echo "The largest palindrome between " . $SMALLEST_VALUE . " and " . $LARGEST_VALUE . " is " .  $largestSumOfTwoProducts . " by multiplying " .$largestTwoProducts[0]. " and ". $largestTwoProducts[1]. "\n";

?>
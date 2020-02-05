<?php
ini_set('max_execution_time', '300'); //300 seconds = 5 minutes
/*
The prime factors of 13195 are 5, 7, 13 and 29.

What is the largest prime factor of the number 600851475143 ?

ANSWER UNKNOWN (compilation time exceeds 5 minutes in php)
*/
// $END_NUMBER = 13195; // Success wwhen 5,7,13,29
$END_NUMBER = 600851475143;
$factors_of_numbers = [];
$prime_numbers = [];
for($i = 1; $i < ($END_NUMBER/2)  ; $i++)
{
    if( ($END_NUMBER % $i) == 0 )
    {
        array_push($factors_of_numbers,$i);
    }

}
print_r($factors_of_numbers);
//add factors to prime number list
$determining_primes = $factors_of_numbers;
for($i=0; $i< count($factors_of_numbers);$i++)
{
    for($j=0; $j< count($determining_primes);$j++)
    {
       if (($determining_primes[$j] % $factors_of_numbers[$i]) == 0 AND ($determining_primes[$j] != $factors_of_numbers[$i]) ) 
       {    
        array_push($prime_numbers, $determining_primes[$j]);
       }
    }
}

// print_r($prime_numbers);
?>
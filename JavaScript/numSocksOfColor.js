function num_Sock_Pair(array)
{
    var numberOfPairs = 0;

    var uniquePairs = [];

    for(var i = 0; i<array.length;i++ )
    {
        if (uniquePairs.includes(array[i]) == false)
        {
            uniquePairs[uniquePairs.length] = array[i];
        }
    } // for i

    for (var i = 0; i<uniquePairs.length;i++ )
    {
        
        var numSocksOfColor = 0;
        for (var j = 0; j<array.length;j++ )
        {
            if (uniquePairs[i] ==  array[j])
            {
                numSocksOfColor++;
            }

        }
        // console.log(uniquePairs[i] + ":" + Math.floor(numSocksOfColor/2));
        numberOfPairs+= Math.floor(numSocksOfColor/2);
    }//for i
    return numberOfPairs; 
}



console.log(num_Sock_Pair([10,20,20,10,10,30,50,10,20]));
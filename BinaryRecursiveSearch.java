public class BinaryRecursiveSearch implements Practice03Search
{
	public String searchName()
	{
		return "Binary Recursive";
	}

	public int search(int[] arr, int target)
	{
		return binarySearch(arr, target, arr[0], arr[arr.length - 1]);
	}
	
	public int binarySearch (int [ ] arr, int value, int left, int right)
	{
    	if (right < left)
    	{
        	return -1;
    	}
    
    	int middle = (left + right) / 2;
    
    	if (value == arr [middle] )
    	{
        	return middle;
    	}
    
    	else if (value < arr[middle])
    	{
        	return binarySearch (arr, value, left, middle - 1);
    	}
    
	    else
    	{
        	return binarySearch (arr, value, middle + 1, right);
    	}
	}
}
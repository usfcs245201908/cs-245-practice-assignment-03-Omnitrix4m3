public class BinaryIterativeSearch implements Practice03Search
{
	public String searchName()
	{
		return "Binary Interative";
	}

	public int search(int[] arr, int target)
	{
		int left = 0;
		int right = arr.length - 1; 
        
		while (left <= right)
		{
			int mid = left + (right - 1) / 2; 
   
            if (arr[mid] == target)
			{
				return mid;
			}
			
			if (arr[mid] < target)
			{
				left = mid + 1;
			} 
   
            else
			{
				right = mid - 1;
			}
		}

		return -1;
	}
}
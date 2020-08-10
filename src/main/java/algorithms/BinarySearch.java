package algorithms;

public class BinarySearch {
	
	public static void main(String args[])
	{
		BinarySearch binarySearch=new BinarySearch();
		int[] arr= {1,2,3,4,5};
		int element=1;
		int start=0;
		int end=arr.length-1;
		
		int index=binarySearch.binarySearch(arr,element,start,end);
		System.out.println("element found at index:"+index);
}
		
		
	
	public int binarySearch(int[] arr,int element,int start,int end)
	{
		
		int mid=(start+end)/2;
		
		if(arr[mid]==element)
		{
			
			return mid;
		}
		else if(element>arr[mid] && start<=end)
		{
			
			start=mid+1;
			
			 return binarySearch(arr,element,start,end);
			
		}
		else if(element<arr[mid] && start<=end)
		{
			end=mid-1;
			
		     return binarySearch(arr,element,start,end);
			
		}
		if(start>end)
		{
			return -1;
		}
		return -1;
		
		
		
		
	
	}
	

}

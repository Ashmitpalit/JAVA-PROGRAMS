import java.util.*;
class BinarySearch 
{
    int binarySearch(int arr[], int l, int r, int x)
    {
        if (r >= l && l<arr.length-1) 
        { 
            int mid = l + (r - l) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);
            return binarySearch(arr, mid + 1, r, x);
        }
        return -1;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        BinarySearch ob = new BinarySearch();
        System.out.println("Enter the number of elements in the array");
        int i,a,n,x;
        a=sc.nextInt();
        int arr[]=new int[a];
        System.out.println("Enter the elements in the array");
        for(i=0;i<a;i++)
        {
            arr[i]=sc.nextInt();
        }
        n = arr.length;
        System.out.println("Enter the item to be searched");
        x=sc.nextInt();
        int result = ob.binarySearch(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
    }
}
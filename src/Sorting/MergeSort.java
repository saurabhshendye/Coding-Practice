package Sorting;

/**
 * Created by Saurabh on 8/25/2017.
 */
public class MergeSort
{
    /**
     * Method : mergeSort
     *
     * Description: Recursive method
     *
     * Input : Array to be sorted
     *
     **/
    private static int[] mergeSort(int [] array)
    {
        if (array.length == 1)
        {
            return array;
        }
        else
        {
            int mid = array.length/2;
            int [] a = new int[mid];
            int [] b = new int[array.length - mid];
            System.arraycopy(array,0,a,0,mid);
            System.arraycopy(array,mid,b,0,array.length-mid);
            int[] array1 = mergeSort(a);
            int[] array2 = mergeSort(b);


            int [] mergedArray = merge(array1, array2);


            return mergedArray;
        }
    }

    /**
     * Method : Merge Method
     *
     * Description: Merges two arrays by comparing each element
     *
     * Input : Takes two arrays to be merged as Input
     *
     **/
    private static int [] merge(int[] array1, int[] array2)
    {
        int [] mergedArray = new int[array1.length + array2.length];
        int i = 0, j = 0, k =0;
        while (i < array1.length && j< array2.length)
        {
            if (array1[i] < array2[j])
            {
                mergedArray[k] = array1[i];
                i++;
                k++;
            }
            else
            {
                mergedArray[k] = array2[j];
                j++;
                k++;
            }
        }

        System.arraycopy(array1,i,mergedArray,k,array1.length-i);
        System.arraycopy(array2,j,mergedArray,k,array2.length-j);

        return mergedArray;

    }

    /**
     * Method : Main Method
     *
     * Description: Takes input from command line
     *
     * Input format: First integer n: Number of elements in the array
     * followed by n elements
     **/
    public static void main(String [] args)
    {
        int n = Integer.parseInt(args[0]);
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
        {
            a[i] = Integer.parseInt(args[i+1]);
        }
        int [] sorted = mergeSort(a);
        for (int aSorted : sorted)
        {
            System.out.print(aSorted + " ");
        }
    }
}

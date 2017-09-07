/**
 * Created by Saurabh on 9/3/2017.
 */
public class insertionSort
{
    private int [] array;
    private insertionSort(int[] array)
    {
        this.array = array;
    }

    private void sort()
    {
        for (int i = 1; i < array.length; i++)
        {
            for (int j = 0; j < i; j++)
            {
                if (array[i] < array[j])
                    this.swap(i, j);
            }
        }
    }

    private void swap(int i, int j)
    {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
        {
            a[i] = Integer.parseInt(args[i+1]);
        }

        insertionSort isort = new insertionSort(a);
        isort.sort();
        for (int aSorted : isort.array)
        {
            System.out.print(aSorted + " ");
        }
    }
}

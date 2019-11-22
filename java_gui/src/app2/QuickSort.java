/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app2;

import jdk.nashorn.internal.objects.DataPropertyDescriptor;

/**
 *
 * @author NCT99
 */
public class QuickSort extends Sort{
    private  int[] data;

    public QuickSort(int[] data) {
        this.data = data;
    }
    
    void swap(int a, int b)  
    {  
        int temp=data[a];
        data[a]=data[b];
        data[b]=temp;
    }  
  
    /* This function takes last element as pivot, places  
    the pivot element at its correct position in sorted  
    array, and places all smaller (smaller than pivot)  
    to left of pivot and all greater elements to right  
    of pivot */
    int partition ( int low, int high)  
    {  
        int pivot = data[high]; // pivot  
        int i = (low - 1); // Index of smaller element  

        for (int j = low; j <= high - 1; j++)  
        {  
            // If current element is smaller than the pivot  
            if (data[j] < pivot)  
            {  
                i++; // increment index of smaller element  
                swap(data[i], data[j]);  
            }  
        }  
        swap(data[i + 1], data[high]);  
        return (i + 1);  
    }  

    /* The main function that implements QuickSort  
    arr[] --> Array to be sorted,  
    low --> Starting index,  
    high --> Ending index */
    @Override
   public void sort( int low, int high)  
    {  
        if (low < high)  
        {  
            /* pi is partitioning index, arr[p] is now  
            at right place */
            int pi = partition( low, high);  

            // Separately sort elements before  
            // partition and after partition  
            sort(low, pi - 1);  
            sort(pi + 1, high);  
        }  
    }  
}

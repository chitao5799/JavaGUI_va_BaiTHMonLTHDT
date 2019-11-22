/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app2;

/**
 *
 * @author NCT99
 */
public class InsertionSort extends Sort{

    public InsertionSort(int[] data) {
       this.data=data;
    }
    @Override
    public void sort(){
        int key,j;
        for (int i = 0; i < data.length; i++) {
            key=data[i];
            j=i;
            while ((j>0)&&(data[j-1]>key)) {                
                data[j]=data[j-1];
                j--;
            }
            data[j]=key;
        }
    }
}

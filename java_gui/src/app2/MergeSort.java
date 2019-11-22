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
public class MergeSort extends Sort{
    private int[] data;
    private int[] temp;

    public MergeSort(int[] data) {
        this.data = data;
        temp=new int[data.length];
    }
    @Override
    public void sort(int left,int right){
        if(left>=right)
            return;
        int mid=(left+right)/2;
        sort(left,mid);
        sort(mid+1,right);
        int i=left;
        int j=mid+1;
        int k=left;
        boolean overleft=false;
        boolean overright=false;
        while (k<=right) {
            if(overleft==false && (data[i]<=data[j])){
                temp[k]=data[i];
                k++;
                i++;
                if(i==mid+1){
                    overleft=true;
                    break;
                }
                continue;
            }
            if(overright==false && (data[j]<data[i])){
                temp[k]=data[j];
                k++;
                i++;
                if(j==right+1){
                    overright=true;
                    break;
                }
                continue;
            }
        }
        if(overleft){
            for (;i<=mid; i++,k++ ){
                temp[k]=data[i];
            }
        }
        for(int index=left;index<=right;index++){
            data[index]=temp[index];
        }
    }
    
}

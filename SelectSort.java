/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package selectsort;

public class SelectSort {
 
    public static int[] SelectSort(int[] arr){
         
        for (int i = 0; i < arr.length - 1; i++)
        {
            int index = i;
            for (int j = i + 1; j < arr.length; j++)
                if (arr[j] < arr[index]) 
                    index = j;
      
            int smallNum = arr[index];  
            arr[index] = arr[i];
            arr[i] = smallNum;
        }
        return arr;
    }
     
    public static void main(String a[]){
         
        int[] arr1 = {4,3,4,5,2,4,6,76,6};
        int[] arr2 = SelectSort(arr1);
        for(int i:arr2){
            System.out.print(i);
            System.out.print(", ");
        }
    }
}

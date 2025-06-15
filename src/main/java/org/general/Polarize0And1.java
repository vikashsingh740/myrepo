package org.general;

public class Polarize0And1 {
    public static void main(String[] args) {
        int[] a = {1,1,0,1,0,0,1,0,1}; // op 0,0,0,0,1,1,1,1,1
        int i=0;
        int j= a.length-1;
        while(i<j){
            if((a[i] == 1) && a[j]==0){
                int temp = a[j];
                a[j] = a[i];
                a[i]=temp;
                i++;
                j--;
            }else if(a[i] == 0){
                i++;
            }else{
                j--;
            }
        }
        for(int x: a){
            System.out.print(x+" ");
        }
    }
}

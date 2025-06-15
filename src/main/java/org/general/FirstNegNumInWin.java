package org.general;

import java.util.LinkedList;
import java.util.Queue;

public class FirstNegNumInWin {
    public static void main(String[] args) {
        int[] a = {-8, 2, 3, -6, 5, -1, 4};
        int start = 0;
        int end = 0;
        int k=3;
        int[] res = new int[a.length-k+1];
        Queue<Integer> queue = new LinkedList<>();
        while (end < a.length) {
           if(a[end] < 0){
               queue.offer(a[end]);
           }
          if((end-start+1) == k){
              int front = 0;
              if (!queue.isEmpty()){
                  front = queue.peek();
              }else{
                  front=-1;
              }
              res[start] = front;
              if(a[start] == front){
                  queue.poll();
              }
              start++;
          }
          end++;
        }
       for(int y : res){
           System.out.println(y);
       }
    }

    private static int findFirstNegative(int[] a, int start, int end) {
         for(int i=start;i<=end;i++){
             if(a[i]<0){
                 return a[i];
             }
         }
         return 0;
    }
}

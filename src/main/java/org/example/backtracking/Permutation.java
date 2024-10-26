package org.example.backtracking;

public class Permutation {
    public static void main(String[] args) {
        String str = "ABC";
        Permutation permutation = new Permutation();
        permutation.permute(str, "", 0);
    }

    private void permute(String str, String perm, int indx) {
         if (str.isEmpty()){
             System.out.println(perm+" ");
             return;
         }
         for (int i=0;i<str.length();i++){
             String current = str.charAt(i)+"";
             String newString = str.substring(0,i)+str.substring(i+1);
             permute(newString, perm+current,indx+1);
         }
    }
}

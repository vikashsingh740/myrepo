package org.example.stack;

import java.util.ArrayList;
import java.util.List;

public class StackImplUsingList {
    List<Integer> list = new ArrayList<>();

    public void push(int data){
      list.add(data);
    }
    public int pop(){
        if (list.isEmpty()){
            return -1;
        }
        int data = list.remove(list.size()-1);
        return data;
    }
    public static void main(String[] args) {
        StackImplUsingList stackImplUsingList = new StackImplUsingList();
        stackImplUsingList.push(10);
        stackImplUsingList.push(20);
        stackImplUsingList.push(30);
        stackImplUsingList.push(40);

        while (!stackImplUsingList.list.isEmpty()){
            System.out.print(stackImplUsingList.pop()+" ");
        }

    }
}

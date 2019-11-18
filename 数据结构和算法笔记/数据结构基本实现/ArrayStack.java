package com.company;

import java.util.Arrays;

/**
 * @Create by linFengcheng
 * @Date 2019/11/17 19:06
 */
public class ArrayStack {
    private int count;
    private int size;
    private int[] ele;


    public ArrayStack(int count) {
        this.count = count;
        ele = new int[count];
    }


    public boolean push(int data) {
        if (size == count) {
            resize();
        }
        ele[size] = data;
        size++;
        return true;
    }

    public boolean pop(){
        if (size==0){
            return false;
        }
        size--;
        return true;
    }


    private void resize() {
        count = count * 2;
        ele = Arrays.copyOf(ele, count);
    }
    public int size(){
        return size;
    }
    public int getCount(){
        return count;
    }
    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i <size; i++) {
            stringBuilder.append(ele[i]+" ");
        }
        return stringBuilder.toString();
    }
}

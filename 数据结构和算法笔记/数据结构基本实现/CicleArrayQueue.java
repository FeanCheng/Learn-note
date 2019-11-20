package com.company;

/**
 * @Create by linFengcheng
 * @Date 2019/11/20 20:17
 */
public class CicleArrayQueue {
    private int[] array;
    /**
     * 第一个队列的索引
     */
    private int front;

    private int rear;
    private int size;
    public CicleArrayQueue(int size) {
        this.size = size;
        array = new int[size];
    }

    public void enqueue(int data){

        /**
         * 判断队列是否满
         * （（队尾下标 + 1）除以 数组长度 == 对头下标 =满）
         */
        if ((rear+1)%size==front){
            System.out.println("队列满");
            return;
        }
        array[rear]=data;
        rear=(rear+1)%size;
    }

    public void dequeue(){
        /**
         * 队尾下标 == 对头下标  说明队列空了
         */
        if (rear==front){
            System.out.println("队列已空");
            return;
        }
        front=(front+1)%size;
    }
    @Override
    public String toString() {
        StringBuilder sb  =new StringBuilder();
        /**
         * 循环读取数据
         */
        for (int i=front;i!=rear;i=(i+1)%size){
            sb.append(array[i]+" ");
        }
        return sb.toString();
    }


}

package Queue;
class MyQueue2{
    private int[] customQueue;
    int f;
    int r;
    int size;

    public MyQueue2(int size) {
        this.size = size;
        this.customQueue=new int[size];
        this.f=0;
        this.r=-1;
    }
    public void enqueue(int data){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        customQueue[++r]=data;
        System.out.println("data added :"+data);
    }
    public void dequeue(){//O(N)
        if(isEmpty()){
            System.out.println("Queue is empty");
            return ;
        }
//        int data=customQueue[f];
//        f++;
//        System.out.println("data removed"+data);
        int data=customQueue[f];
        for(int i=f;i<r;i++){//left shift
            customQueue[i]=customQueue[i+1];
        }
        r--;
        System.out.println("data removed : "+data);
    }
    public void show(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        for(int i=f;i<=r;i++){
            System.out.println(customQueue[i]);
        }
    }


    public boolean isEmpty(){
        return f>r;
    }
    public boolean isFull(){
        return r==customQueue.length-1;
    }
}

public class Queue2 {
    public static void main(String[] args) {
        MyQueue2 queue=new MyQueue2(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.show();
        queue.dequeue();
        queue.dequeue();
        queue.show();
        queue.dequeue();//problem
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(40);
        queue.enqueue(50);
        queue.show();
    }
}

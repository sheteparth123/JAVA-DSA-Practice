package Queue;
class MyCircularQueue{
    int customQueue[];
    int f;
    int r;
    int size;


    public MyCircularQueue(int size) {
        this.size = size;
        this.customQueue=new int[size];
        this.f=-1;
        this.r=-1;
    }
    public void enqueue(int data){
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        if(f==-1){
            f++;
        }
        r=(r+1)%size;
        customQueue[r]=data;

    }
    public void dequeue(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;
        }
        int result=customQueue[f];
        if(f==r){
            f=r=-1;
        }else{
            f=(f+1)%size;//increase front
        }
        System.out.println("Data removed : "+result);

    }
    public boolean isFull(){
        return (r+1)%size==f;
    }
    public boolean isEmpty(){
        return (r==-1)||(f==-1);
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
}
public class CircularQueue {
    public static void main(String[] args) {
        MyCircularQueue queue=new MyCircularQueue(3);
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

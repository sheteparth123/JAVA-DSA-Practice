package demo;
class Parent{
 int height;
 int hair;
 Parent(){
     this.height=height;

 }
 void deadlift(){
     System.out.println("200kg ");
 }
}
class Child extends Parent{
    void deadlift(){
        System.out.println("280kg");
    }
}
public class overriding {
    public static void main(String[] args) {
        Child c=new Child();
        c.deadlift();


    }

}

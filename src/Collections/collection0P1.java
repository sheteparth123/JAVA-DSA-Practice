package Collections;

import java.util.*;


class Student{
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
public class collection0P1 {
    public static void main(String[] args) {
        Student s1=new Student(1,"Rohit");
        Student s2=new Student(2,"Surya");
        Student s3=new Student(3,"Hardik");
        Student s4=new Student(4,"Boomrah");
        //collection of objects

        //IO RA DUP
        ArrayList<Student> arrayList=new ArrayList<>();
        arrayList.add(s1);
        arrayList.add(s2);
        arrayList.add(s3);
        arrayList.add(s4);

        System.out.println(arrayList);
        Student student=arrayList.get(3);
        System.out.println(student);

        ArrayList al=new ArrayList();//heterogenous
        al.add(10);
        al.add("Parth");
        al.add(10.5);

        System.out.println(al);

        ArrayList<Integer> al1=new ArrayList<>();
        al1.add(10);//int to Integer wrapper class
        al1.add(20);
        al1.add(10);
        al1.add(30);

        Set<Integer> set=new HashSet<>();
        set.add(10);
        set.add(20);
        set.add(10);
        set.add(30);
        System.out.println(set);
        for(Integer d:set){
            System.out.println(d);
        }

        Set<Character> se=new LinkedHashSet<>();
        se.add('a');
        se.add('p');
        se.add('p');
        se.add('l');
        se.add('e');
        se.add('a');
        se.add('p');
        se.add('p');
        se.add('l');
        se.add('e');
        System.out.println(se);

        Map<String,Integer> map=new HashMap<>();
        map.put("one",1);
        map.put("two",2);
        System.out.println(map);
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for(Map.Entry<String,Integer> entry:entries){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }


    }
}

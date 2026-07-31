package Arraylist;

public class Student {
    int id;
    String name;
    int age;

    public Student(int id,  String name, int age){

        this.id = id;
        this.name= name;
        this.age = age;
    }
    //Override to get the values   or else we see the student ids;
    public String toString() {
        return "Student [id=" + id +", name=" + name + ",age=" + age +"]";

    }
}

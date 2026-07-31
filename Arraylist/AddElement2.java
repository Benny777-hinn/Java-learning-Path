package Arraylist;
import java.util.ArrayList;
public class AddElement2 {
    public static void main(String[]args){
        ArrayList<Student> al = new ArrayList<>();
        Student s1 = new Student(22,"Benny",21);
        Student s2 = new Student(92,"Hinn",21);

        al.add(s1);
        al.add(s2);
        al.add(new Student(16,"Gagan",21));
        al.add(new Student(44,"Sagar",21));

        System.out.println(al);

        // al.toString();
    }
}

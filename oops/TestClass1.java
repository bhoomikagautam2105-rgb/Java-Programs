import java.util.*;
class student{
    String name;
    int age;

    
    public void printInfo(){
        System.out.println("Name = "+name);
        System.out.println("Age = "+age);
    }
    student(student s1){
        this.name = s1.name;
        this.age = s1.age;
    }
    student(){

    }
}

 class TestClass1 {
    public static void main(String[] args) {
       student s1 = new student();
       s1.name = "Prem Kumar";
       s1.age = 21;

       student s2 = new student(s1);
       s2.printInfo();
       
    }
}

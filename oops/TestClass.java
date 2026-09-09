// class and object

class student{
    String name;   // instance variable
    int rollNo;
    public void printInfo(){  // instance method
      System.out.println("Name = "+name);
      System.out.println("Roll No = "+rollNo);
    }
}

class TestClass{
    public static void main(String[] agrs){
        student s1 = new student();  // object creation
        s1.name = "aditya";
        s1.rollNo = 20;
        s1.printInfo();
    }
}
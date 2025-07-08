

class Student {
String name;
int age;
int roll;
Student(String name, int age , int roll){
    this.name=name;
    this.age=age;
    this.roll=roll;
}

public void setAge(int age){
    if(age<0){
        System.out.println("age -ve na hove");
        return;
    }
    this.age=age;
}
// getter and setter
public int getAge(){
    return age;
}
public void intro(){
    System.out.println("his name is "+name+" his age is "+age+" his roll is "+roll);
}
public void sayHi(String name){

    System.out.println(this.name + " sayhi " + name);
}
public static void xyz(){
    System.out.println("know the diff bw static and non static");
}

static{
    System.out.println("i am a static block in student table");
}

}


public class test1{
    public static void main(String[] args) {
        System.out.println("hello");
        Student s1=new Student("yash",20,74);
        Student s2=new Student("rajjo",73,18);
        Student.xyz();
        System.out.println(s1.getAge());
        // s1.name="yash";
        // s1.age=20;
        // s1.roll=74;
        // s2.name="rajjo";
        // s2.roll=73;
        // s2.age=18;
        s1.intro();
        s2.intro();
        s1.sayHi("samay");

    }
    static {
        System.out.println("i am a static block inside main");
    }
}
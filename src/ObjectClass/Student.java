package ObjectClass;

public class Student {

    //String name = "Kendal Jenner";
    //static int age = 30;
    String name;
    static int age;
    String phone = "0987872700";

    //hàm xây dựng không có tham số - cấu trúc hàm  giống tên class
    public Student(){

    }
    //hàm xây dựng có tham số - cấu trúc hàm  giống tên class
    public Student(String name1, int age){
        //this.name = name;
        name = name1; // ko dùng this thì phải khác tên
        this.age = age;
    }
    public String getName(){
        //System.out.println("---------");
        return name;
    }
    public static int getAge(){
        return age;
    }
    public void getInfo(){
        System.out.println("Tên " + name);
        System.out.println("Tuổi " + age);
        System.out.println("SĐT " + phone);
    }

    public static void main(String[] args) {
        Student st1 = new Student("quỳnh",24);
        st1.getInfo();

        Student st2 = new Student();
        st2.getInfo();
        //st2.getName();
    }

}

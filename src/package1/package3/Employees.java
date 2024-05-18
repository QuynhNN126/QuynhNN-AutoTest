package package1.package3;

public class Employees {

    String name;
    int age;
    String address;

    public Employees(String name, int age, String address){
        this.name = name;
        this.age = age;
        this.address = address;
    }
    public void getInfor(){
        System.out.println("Tên nhân viên: " + name);
        System.out.println("Tuổi: " + age);
        System.out.println("Quê quán: " + address);
    }
    /*
    public static void main(String[] args) {
        Employees emp = new Employees("Quỳnh", 24, "Hà Nội");
        emp.getInfor();
    }
     */
}

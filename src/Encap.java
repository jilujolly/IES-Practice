public class Encap {
    public static void main(String[]args) {
        Emp emp1 = new Emp();
        emp1.setEmpID(4);
        System.out.println(emp1.getEmpID());
        emp1.setName("Jilu");
        System.out.println(emp1.getName());
    }
}


class Emp {

    private int empID;
    private String name;

    public int getEmpID() {
        return empID;
    }

    public void setEmpID(int empID) {
        this.empID = empID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}

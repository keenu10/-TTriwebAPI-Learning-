// Abstract class
abstract class Animal {
  // Abstract method 
  public abstract void animalSound();
  // Regular method
  public void sleep() {
    System.out.println("Zzz");
  }
}

// Subclass (inherit from Animal)
class Pig extends Animal {
  public void animalSound() {
    // The body of animalSound() is provided here
    System.out.println("The pig says: wee wee");
  }
}

class Main {
  public static void main(String[] args) {
    Pig myPig = new Pig(); // Create a Pig object
    myPig.animalSound();
    myPig.sleep();
  }
}





//inheritance implementation
class Animal {

  // field and method of the parent class
  String name;
  public void eat() {
    System.out.println("I can eat");
  }
}

// inherit from Animal
class Dog extends Animal {

  // new method in subclass
  public void display() {
    System.out.println("My name is " + name);
  }
}

class Main {
  public static void main(String[] args) {

    // create an object of the subclass
    Dog labrador = new Dog();

    // access field of superclass
    labrador.name = "Rohu";
    labrador.display();

    // call method of superclass
    // using object of subclass
    labrador.eat();

  }
}





//encapsulation implementation
class Employee {
  private String emp_name;
  private String emp_id;
  private double net_salary;

  // Constructor
  public Employee(String emp_name, String emp_id, double net_salary) {
    this.emp_name = emp_name;
    this.emp_id = emp_id;
    this.net_salary = net_salary;
  }

  // Getter methods
  public String getEmpName() {
    return emp_name;
  }

  public String getEmpId() {
    return emp_id;
  }

  public double getSalary() {
    return net_salary;
  }

  // Setter methods
  public void setEmpName(String emp_name) {
    this.emp_name = emp_name;
  }

  public void setEmpId(String emp_id) {
    this.emp_id = emp_id;
  }

  public void setSalary(double net_salary) {
    this.net_salary = net_salary;
  }
}

// The Main class to test encapsulated class "Employee"
public class Main {
  public static void main(String args[]) {
    // Objects to Employee class
    // First object - setting values using constructor
    Employee emp = new Employee("Robert", "EMP001", 75450.00);

    // Printing data
    System.out.println("Employee (Intial Values):");
    System.out.println(emp.getEmpId() + " , " + emp.getEmpName() + " , " + emp.getSalary());

    // Updating values using setter methods
    emp.setEmpName("Riyan");
    emp.setEmpId("EMP002");
    emp.setSalary(90500.00);

    // Printing data
    System.out.println("Employee (Updated Values):");
    System.out.println(emp.getEmpId() + " , " + emp.getEmpName() + " , " + emp.getSalary());
  }
}

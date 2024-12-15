package aa;

public class Employee1 {

        int id;
        String name;
        double salary;

        public static void main(String[] args) {
            Employee1 e1 = new Employee1();
            Employee1 e2 = new Employee1();
            Employee1 e3 = new Employee1();

            e1.id = 100;
            e2.name = "Siddu";
            e3.salary = 700.00;

            System.out.println(e1.id);
            System.out.println(e2.name);
            System.out.println(e3.salary);
        }

    }

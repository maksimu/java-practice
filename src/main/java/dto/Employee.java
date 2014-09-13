package dto;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by maksimustinov on 9/9/14.
 */
public class Employee {

    public String extension;
    public String givenname;
    public String surname;

    public Employee(){

    }

    public Employee(String extension, String givenname, String surname){
        this.extension = extension;
        this.givenname = givenname;
        this.surname = surname;
    }

    public static Employee[] init(){

        Employee[] e = new Employee[15];
        e[0] = new Employee("1234", "Ustinov", "Max");
        e[1] = new Employee("6346", "mmm", "zzz");
        e[2] = new Employee("9345", "cccc", "ssss");
        e[3] = new Employee("4321", "ffff", "ddd");
        e[4] = new Employee("5432", "sssss", "aaaaa");
        e[5] = new Employee("6543", "sssss", "bbbbb");
        e[6] = new Employee("7654", "rthy", "bbbbb");
        e[7] = new Employee("8765", "ert", "yyy");
        e[8] = new Employee("9876", "ffs", "ffs");
        e[9] = new Employee("7890", "ewsd", "gsdf");
        e[10] = new Employee("6789", "fth", "sdfas");
        e[11] = new Employee("5678", "cvsw", "ahre");
        e[12] = new Employee("4567", "jyew", "kygd");
        e[13] = new Employee("3456", "wefa", "erqwq");
        e[14] = new Employee("2345", "jwerw", "vgas");

        return e;
    }

    public static Employee[] sortBySurnameAndGivenaname(Employee[] e){

        Comparator<Employee> employeeComparator = new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {

                int ret = o1.surname.compareToIgnoreCase(o2.surname);

                if(ret == 0){
                    ret = o1.givenname.compareToIgnoreCase(o2.givenname);
                }

                return ret;
            }
        };

        Arrays.sort(e, employeeComparator);

        return e;
    }

    public String toString(){
        return "[" + extension + "], [" + surname + "], [" + givenname + "]";
    }

    public static void print(Employee[] employees){
        for(Employee e : employees){
            System.out.println(e);
        }
    }

    public static void main(String ... arg){

        Employee[] employees = Employee.init();
        Employee[] employeesSorted = Employee.sortBySurnameAndGivenaname(employees);

        System.out.println("UNSORTED: ");
        Employee.print(employees);

        System.out.println("\n\nSORTED: ");
        Employee.print(employeesSorted);
    }
}

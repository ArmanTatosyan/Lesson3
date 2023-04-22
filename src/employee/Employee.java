package employee;

public class Employee {
    String name;
    int year;
    int salary;
    Address address;
    int hours;


    public class Address{
        String city;
        String street;
        Address(String city,String street){
            this.city = city;
            this.street = street;


        }
    }
    Employee(String name, int year, int salary, String city, String street){
        this.name = name;
        this.year = year;
        this.salary = salary;
        this.address = new Address(city, street);
    }
    public void getInfo(int hours){
        this.hours = hours;
    }
    public void addSalary(){
        if(salary<1100){
            salary += 10;
        }

    }
    public void addWork(){
        if(hours>6){
            salary += 5;
        }

    }
    public static void main (String[] args){
        Employee employee1 = new Employee("Arman", 2010,1000,"Yerevan","Lyuqsemburg 11" );
        Employee employee2 = new Employee("Sargis", 2011,2000,"Yerevan","Lyuqsemburg 12" );
        Employee employee3 = new Employee("Ara", 2012,3000,"Yerevan","Lyuqsemburg 13" );
        System.out.println(employee1.name + " " + employee1.year + " " + employee1.address.city + " "+ employee1.address.street + " " + employee1.salary);
        System.out.println(employee2.name + " " + employee2.year + " " + employee1.address.city + " "+ employee1.address.street + " " + employee2.salary);
        System.out.println(employee3.name + " " + employee3.year + " " + employee1.address.city + " "+ employee1.address.street + " " + employee3.salary);
        employee1.addSalary();
        System.out.println(employee1.salary);
        employee1.addWork();
        System.out.println(employee1.salary);

    }
}

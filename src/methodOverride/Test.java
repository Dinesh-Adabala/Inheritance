package methodOverride;

public class Test {
    public static void main(String[] args) {
        Manager manager = new Manager("Dinesh",75000,3,2000);
        Developer developer = new Developer("Kanna",55000,1,1899,0.5);
        Intern intern = new Intern("Shiny",12000,0.3,720,8,15);

        manager.creditSalary();
        developer.creditSalary();
        intern.creditSalary();

    }
}

import java.util.*;


public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sal = sc.nextInt();
        int bonus = sc.nextInt();
        int service_years = sc.nextInt();
        if(service_years >= 5){
            int a = (bonus * sal) / 100;
            int b = a + sal;
            System.err.println("Salary  is:" + b);
        }else{
            System.out.println("Salary is:" + sal);
        }
        sc.close();
    }
}

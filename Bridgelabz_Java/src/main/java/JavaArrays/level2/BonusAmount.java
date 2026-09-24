/*
Create a program to find the bonus of 10 employees based on their years of service and the total bonus amount the company Zara has to pay, along with the old and new salary.
Hint =>
Zara decides to give a bonus of 5% to employees whose year of service is more than 5 years or 2% if less than 5 years
Define a double array to save salary and years of service for each of the 10 employees
Also define a double array to save the new salary and the bonus amount as well as variables to save the total bonus, total old salary, and new salary
Define a loop to take input from the user. If salary or year of service is an invalid number then ask the use to enter again. Note in this case you will have to decrement the index counter
Define another loop to calculate the bonus of 10 employees based on their years of service. Save the bonus in the array, compute the new salary, and save in the array. Also, the total bonus and total old and new salary can be calculated in the loop
Print the total bonus payout as well as the total old and new salary of all the employees
Author :Asher Mustafa
Date:  22/09/2026
* */
import java.util.*;
public class BonusAmount
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        ArrayList<Double>salary=new ArrayList<>();//store salaries
        ArrayList<Double>yearofservice  =new ArrayList<>();
        ArrayList<Double>Bonus=new ArrayList<>();
        ArrayList<Double>newSalary=new ArrayList<>();
        double totalbouns=0.0;
        double totaloldSalary=0.0;
        double totalnewsalary=0.0;

        for(int i =0; i <10;i++)
        {
            System.out.print("Enter the salary for the employee "+(i+1)+": ");
            double employeesalary=sc.nextInt();
            System.out.println();
            System.out.println("Enter year of experience for the employee "+(i+1)+ ": ");
            double year=sc.nextInt();
            if(employeesalary<=0 || year<0)
            {
                System.out.println("Invalid Input: Enter the value again.");
                i--;
                continue;
            }
            salary.add(employeesalary);
            yearofservice.add(year);
        }
        for(int i =0; i <10;i++)
        {
            double employeebonus;
            if(yearofservice.get(i)>5)
            {
                employeebonus=salary.get(i)*0.05;
            }
            else
            {
                employeebonus=salary.get(i)*0.02;
            }
            double newsalaryemployee=salary.get(i)+employeebonus;
            Bonus.add(employeebonus);
            newSalary.add(newsalaryemployee);
            totalbouns+=employeebonus;
            totaloldSalary=+salary.get(i);
            totalnewsalary+=newSalary.get(i);
            System.out.print("Employee "+(i+1)+" | Old salary "+salary.get(i)+ " | Bonus "+Bonus.get(i)+" | newSalary "+ newSalary.get(i)+ " \n");

        }
        System.out.println("\nTotal Bonus Payout: INR " + totalbouns);
        System.out.println("Total Old Salary: INR " + totaloldSalary);
        System.out.println("Total New Salary: INR " + totalnewsalary);
        sc.close();
    }
}
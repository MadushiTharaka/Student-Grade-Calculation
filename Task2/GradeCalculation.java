import java.util.Scanner;
public class GradeCalculation
{

    public static void main(String args[])
    {
        int total = 0;
        double avg;
        int totalSub;
        int Marks;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter you  no of subjects : ");
        totalSub = sc.nextInt();

        for(int i=1; i<=totalSub; i++)
        {
            System.out.println("Subject : " + i);
            System.out.println("Enter your Marks : " );
            Marks = sc.nextInt();

            if(Marks <= 0 || Marks > 100)
            {
                System.out.println("Please enter correct marks!!");

            }

            total += Marks;
        }

        avg = (double) total/totalSub;
        
        System.out.println("Your Total Marks is : " +total +"\n");
        System.out.println("Your Average is : " +avg);


        if(avg>=0 && avg<35)
        System.out.println("Your Grade  :  F");

        else if(avg>=35 && avg<55)
        System.out.println("Your Grade  :  S");

        else if(avg>=55 && avg<65)
        System.out.println("Your Grade  :  C");

        else if(avg>=65 && avg<75)
        System.out.println("Your Grade  :  B");

        else if(avg>=75 && avg<100)
        System.out.println("Your Grade  :  A");

        else
        System.out.println("Error!!");
    }

}

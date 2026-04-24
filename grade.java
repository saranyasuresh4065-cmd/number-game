import java.util.Scanner;
public class grade {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Total number of subject:");
        int n=sc.nextInt();
        int total=0;
        for(int i=1;i<=n;i++){
            System.out.println("Enter the mark of tha subject:");
            int marks=sc.nextInt();
            total+=marks;
        }
        double average=total/(double)n;
        String grade;
        if(average>=90){
            grade="A+";
        }
        else if(average>=80){
            grade="A";
        }
        else if(average>=70){
            grade="B+";
        }
        else if(average>=60){
            grade="B";
        }
        else if(average>=50){
            grade="C";
        }
        else{
            grade="U";
        }
        System.out.println("Total marks="+total);
        System.out.println("Average Percentage="+average);
        System.out.println("Grade="+grade);
    }
}

import java.util.Scanner;
class leap{
public static void main(String[] args){
Scanner a=new Scanner(System.in);
System.out.println("Enter the year:");
int b=a.nextInt();
if(b%4==0){
System.out.println("leap year");
}
else if(b%4!=0){
System.out.println("not a leap year");
}
else {
System.out.println("not valid");
}
}
}
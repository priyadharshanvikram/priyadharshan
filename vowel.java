import java.util.Scanner;
class vowel
{
public static void main(String[] args)
{
int i=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter a character:");
char ch=sc.next().charAt(0);
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
System.out.println("character is vowel");
else if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z')
System.out.println("character id consonant");
else
System.out.println("character is not an alphabet");
}
}
import java.util.Scanner;

public class Change {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String s1=s.nextLine();
		String v="";
		int j;
		for(int i=0;i<s1.length();i++) {
			j=0;
			j=s1.charAt(i);
			//System.out.println(j);
			if(j>=65&&j<=90||(j>=97&&j<=122)) {
				v+=s1.charAt(i);
			}
			else
			{
				v+=" ";
			}
		}
        System.out.println(v);
	}

}

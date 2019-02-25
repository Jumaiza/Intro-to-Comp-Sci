
public class Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s = "The number of rabbits is";
int argh = 129;
String report = s+" "+argh;
System.out.println(report);

String g = "Computer Science is for nerds";
System.out.println(g.toLowerCase());

String m = "Look here!";
int n = m.length();
System.out.println("\""+m+"\""+" has "+n+" characters");
System.out.println("\\\n\\");

String code = "Hello again";
String codesmall = code.substring(0,5);
System.out.println(codesmall+"\n"+code);

System.out.println("A backlash looks like \\, ...right?");
System.out.println(" ");

String s1 = "Allan Alda";
String s2 = "John Wayne";
String s3 = "Gregory Peck";
System.out.println(s1+">>>"+s1.substring(2,s1.length()-3));
System.out.println(s2+">>>"+s2.substring(2,s2.length()-3));
System.out.println(s3+">>>"+s3.substring(2,s3.length()-3));

	}

}

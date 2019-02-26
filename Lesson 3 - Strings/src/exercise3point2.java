
public class exercise3point2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("a\\b\\c\\\"d\"");
System.out.println("\\t is a tab, \\n is a new line. \\\" prints a \"quote\"");
System.out.println("\"line one\"\n\\line\t two\\");
System.out.println("\\\\denotes a single comment\n\\*denotes a multiline comment*\\");
System.out.println("\"\\\\\"\\\"\"\n\t\\\"\\\"\"\\\n\\\"\"\"\"\\\n---------------- ");

String word1 = "Birthday";
System.out.println(word1.toUpperCase());

String word2 = "it's my party";
System.out.println(word2.substring(0,8)+"\""+word2.substring(8,13).toUpperCase()+"\"");

String x3 = "\"whose a whats it\"";
System.out.println(x3.substring(1,6).toUpperCase()+"\n"+x3.substring(15,17)+" "+x3.substring(9,13).toUpperCase());

String x4 = "Every Way The Wind Blows";
System.out.println(x4.substring(0,5).toLowerCase()+" "+x4.substring(6,9).toUpperCase()+" "+x4.substring(10,13).toLowerCase()+
" \\"+x4.substring(14,18).toUpperCase()+"\\ "+x4.substring(19,24).toLowerCase()+" 4");

String x5 = "Peter Piper Picked A Peck Of Pickled Peppers";
System.out.println(x5.substring(19,20)+" "+x5.substring(21,36).toLowerCase()+"\t"+x5.substring(37).toLowerCase()+
" "+x5.substring(0,11)+"\t"+x5.substring(12,18).toLowerCase());

String x6 = "word has 4 letters";
System.out.println("\""+x6.substring(9,10)+"\" "+x6.substring(11)+" "+x6.substring(5,8)+" \""+x6.substring(9,18).length()+"\" "+x6.substring(11));

String x7 = "if SUBSTRING is used";
System.out.println(x7.substring(3,15).toLowerCase()+" "+x7.substring(3,12).length());

String x8 = "Jim, Jacky, Johnny, Jill";
System.out.println(x8.substring(0,3).toLowerCase()+"\\"+x8.substring(0,3).length()+"\n"+x8.substring(5,10).toUpperCase()+"\\"+
x8.substring(5,10).length()+"\n"+x8.substring(12,18).toLowerCase()+"\\"+x8.substring(12,18).length()+"\n"+
x8.substring(20).toUpperCase()+"\\"+x8.substring(20).length());






	}

}

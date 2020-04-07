package inetBankingV1;

public class reverseString {

public static void main(String[] args) {

	String str="testing";

	char ch[]=str.toCharArray();

	char temp = ' ';

	int i=0;

	while(i < ch.length-1)
    {

		temp=ch[i];
		ch[i]=ch[i+1];
		ch[i+1]=temp;
		i=i+2;
    }

System.out.println("String Before : "+ str);

System.out.println("String after : " + String.valueOf(ch));

}

}
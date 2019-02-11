import java.io.*;
import java.util.*;
class Multiple
{
  public static void main(String args[])
  {
	Scanner input=new Scanner(System.in);
	int a=input.nextInt();
	if(a%13==0)
	{
		System.out.println("yes");
	}
	else
	{
		System.out.println("no");
	}
  }
}

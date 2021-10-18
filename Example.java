
public class Example
{
  public static void main(String[] args)
  
  {
	  int i=3;int j=3;
	 do
	  {
		 ++i;
		i*=++i+2;
		j=i;
		i+=i+j;
	  }while(i<j);
	  
	  System.out.println(i+" "+j);
  }
}

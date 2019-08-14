package exception;


public class AddArgs {
	public static void main(String args[]) {
		int sum=0;
		
		for (String arg:args) {
			try 
			{
				sum+=Integer.parseInt(arg);
				System.out.println(sum);
				System.out.println(args[10]);
			}
			catch(NumberFormatException nfe)			
			{
				//System.err.println("number format excepton occured "+nfe.toString());
				//to exit, it stops th eexecutione excepecution
				//nfe.printStackTrace();
				//System.err.println(nfe.getCause().toString());
				//System.err.println(nfe.getMessage());
				//System.exit(0);
			}
			catch(ArrayIndexOutOfBoundsException a)
			{
				System.err.println(a);
			}
			catch (Exception e)
			{
				System.err.println("exception occured");
			}
			finally
			{
				System.out.println("finally ");
			}
		}
		System.out.println(sum);
	}

}
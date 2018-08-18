package certificate_generator;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class mainClass {

	mainClass(int x, int y, int a, int b, int n, int m) throws IOException
	{
		String f ="resources/data.csv";
		SortCSV obj = new SortCSV(f);
		obj.mainop();
		
		File file = new File(f);
		Scanner inputStream = new Scanner(file);
		int i = 0;
		while(inputStream.hasNextLine())
		{
			i++;
			String data = inputStream.nextLine();
			String pass = data.substring(1,data.length()-2);
			print_name some = new print_name(pass,i,x,y,a,b,n,m);
		}
		
		inputStream.close();
	}
}

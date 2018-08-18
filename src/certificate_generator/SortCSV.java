package certificate_generator;


import java.io.*;
import java.util.*;

class CSVFile {
	
	private List<String[]> records;
	
	//constants for sortDirection
	final public int SortASC = 1;
	final public int SortDESC = -1;
	private int sortDirection = SortASC; //1 for ASC, -1 for DESC	
	String fileName;
	
	private int colsCount=0;
	public CSVFile(String file) throws IOException{
		records = new ArrayList<String[]>();
		fileName = file;
		try(BufferedReader in = new BufferedReader(new FileReader(file)))
		{
			String ln;
			while( (ln = in.readLine()) !=null) {
				colsCount = ln.split("\t").length; //FIXME
				records.add(ln.split("\t"));
			}
		}
	}
	
	public void print(){
		for(String[] arr : records){
			for (String s:arr) {
				//System.out.print(s+"\t");
			}
			System.out.println();
		}
	}
	
	public void save() throws IOException{
		try(BufferedWriter out = new BufferedWriter(new FileWriter(fileName)))
		{
			for(String[] arr : records){
				for (String s:arr) {
					out.write(s+"\t");
				}
				out.write("\n");
			}
		}
	}
	
	public void setSortDirection(int direction){
		sortDirection = direction;
	}
	
	public void sortByCol(final int i){
		
		//comparator by specific col
		Comparator<String[]> comp = new Comparator<String[]>(){
			public int compare(String[] a, String[] b){
				//reverse result if DESC (sortDirection = -1)
				return sortDirection * a[i].compareTo(b[i]);
			}
		};
		
		Collections.sort(records, comp);
	}
	
	public int getColsCount(){
		return colsCount;
	}
}



class SortCSV {
	//private static BufferedReader in;
	
	private static String fileName;
	public SortCSV(String file)
	{
		fileName = file;
	}
	public void mainop() throws IOException{
		
//		in = new BufferedReader(new InputStreamReader(System.in));
//		if (args.length<1){
//			//promt user for input file
//			System.out.println("Enter path to .CSV file: ");
//			fileName = in.readLine();
//		} else
//		{
//			fileName = args[0];
//		}	
		
		try {
			CSVFile csv = new CSVFile(fileName);
		
		
			//csv.print();
			
			
			int sortCol = 1;
			csv.sortByCol(sortCol-1); //-1 map from 1:n to 0:n-1
			csv.save();
		} catch(IOException e) {
			System.out.println("File doesn't exist");
			System.exit(0);
		}
	}
}

import java.util.*;
import java.io.*;
import java.nio.file.Paths;
public class Q31 {

	public static void main(String[] args) {
		try {
		
		File file=new File("C:\\Users\\divya\\Desktop\\Course_Assignments\\Assignment1\\Sourcefile.txt");
		Scanner s= new Scanner(file);
		FileReader fr= new FileReader(file);
		FileWriter fw= new FileWriter("C:\\Users\\divya\\Desktop\\Course_Assignments\\Assignment1\\targetfile1.txt");
		BufferedWriter bw= new BufferedWriter(fw);
BufferedReader br= new BufferedReader(fr);
String line;
line=br.readLine();

List<String> list= new ArrayList<String>();
while(line!= null) {
	
	list.add(line);
	line= br.readLine();
	
}
for(int i=list.size()-1;i>=0;i--) {
	//System.out.println(list.get(i));
	bw.write(list.get(i));
	bw.newLine();
}
bw.close();
fr.close();
s.close();
		}
catch(Exception e) {
	System.out.println(e.getMessage());
}
		
	}

}
	
	   

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.StringTokenizer;
/**
 *  Laboratory work 4
 *  <p>
 *  the program creates Arraylist from objects of the Person type
 * @author Julia Zyrianova
 * @version 1.0
 */
public class Main {
    public static void main(String[] args) throws Exception {
        /** The main method of the program.
         * Here I read the data from the file, create the required number of objects of the person type
         * and add them to the list.
         * That is, at the output I will get a List type object in which the people from the file will be located.
         */
        ArrayList<Person> list=new ArrayList<>();
        try (BufferedReader br = Files.newBufferedReader(Paths.get("C:\\Users\\julia\\IdeaProjects\\l4_java\\foreign_names.csv"))) {
            String str = " ";
            while ((str = br.readLine()) != null) {
                StringTokenizer tokenizer = new StringTokenizer(str, ";");
                while (tokenizer.hasMoreElements()) {
                    int id = Integer.parseInt(tokenizer.nextToken());
                    String name =tokenizer.nextToken();
                    String gender=tokenizer.nextToken();
                    String birth=tokenizer.nextToken();
                    String name_d=tokenizer.nextToken();
                    Division d=new Division(name_d);
                    double salary=Integer.parseInt(tokenizer.nextToken());
                    Person p=new Person( id,name,gender,birth,d,salary);
                    list.add(p);
                }

            }
        } catch (Exception e) {
            System.out.println("No File");
        }

        int size = list.size();
        //System.out.println(size); //25899
        for (int i = 0; i < size; i++) {
            list.get(i).print();
            System.out.println("_____________________________");
        }
    }
}

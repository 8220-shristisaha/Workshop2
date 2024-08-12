import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main1 {
    public static void main(String[] args) {
        try{
            List<String> list = new ArrayList<>();
            list.add("source.txt");
            list.add("source1.txt");
            list.add("source2.txt");

            for(String line : list){
                System.out.println("Data from :" + line);
                processFile(line);
                System.out.println();
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static synchronized void processFile(String file) throws IOException {
        String line;
        BufferedReader br = new BufferedReader(new FileReader(file));
        while((line=br.readLine())!=null){
            System.out.println(line);
        }
    }

}

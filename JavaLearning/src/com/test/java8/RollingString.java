import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.String;
import java.util.List;
import java.util.stream.IntStream;

public static String rollingString(String s, List<String> operations) {
    // Write your code here
    StringBuilder string=new StringBuilder(s);
    for(String a:operations){
        String[] arr=a.split(" ");
        if(arr[2].equals("R")){
            int i=Integer.parseInt(arr[0]);
            int j=Integer.parseInt(arr[1]);
            for(int b=i;b<=j;++b){
                int x=string.charAt(b);
                x+=1;
                if(x>122)string.setCharAt(b, 'a');
                else string.setCharAt(b,(char)x);
            }
        }
        else{
            int i=Integer.parseInt(arr[0]);
            int j=Integer.parseInt(arr[1]);
            for(int b=i;b<=j;++b){
                int x=string.charAt(b);
                x-=1;
                if(x<97) string.setCharAt(b, 'z');
                else string.setCharAt(b,(char)x);
            }
        }
    }
    return string.toString();
    }

}
public class RollingString {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        int operationsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> operations = IntStream.range(0, operationsCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        String result = Result.rollingString(s, operations);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
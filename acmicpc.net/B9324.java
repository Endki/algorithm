import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class B9324 {
    int numOfMeesage;
    String[] messages;
    int[] numOfAfter;
 
    public void setValues() throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        numOfMeesage = Integer.parseInt(br.readLine());
        messages = new String[numOfMeesage];
        numOfAfter = new int[26];
 
        for (int i = 0; i < messages.length; i++) {
            messages[i] = br.readLine();
        }
    }
    public boolean checkMessage(String message) {
        boolean isTrueMessage = false;
        char[] alpabets = message.toCharArray();
        int index;
 
        
        // A == 65
        for (int i = 0; i < alpabets.length; i++) {
            index = alpabets[i] - 65;
            numOfAfter[index]++;
 
            if (numOfAfter[index] == 3) {
                if (i + 1 >= alpabets.length) {
                    return false;
                }
 
                if (alpabets[i + 1] == alpabets[i]) {
                    numOfAfter[index] = 0;
                    i++;
                } else {
                    return false;
                }
            }
        }
        isTrueMessage = true;
        return isTrueMessage;
    }

    public void solve() throws NumberFormatException, IOException {
        setValues();       
         
        for (int i = 0; i < messages.length; i++) {
            if (checkMessage(messages[i])) {
                System.out.println("OK");
            } else {
                System.out.println("FAKE");
            }
            Arrays.fill(numOfAfter, 0);
        }
    }

	public static void main(String[] args) throws NumberFormatException, IOException {
        B9324 m = new B9324();
        m.solve();

	}

}

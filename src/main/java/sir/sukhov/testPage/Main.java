package sir.sukhov.testPage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = null;

        System.out.println("Checking if " +
                args[0] + " contains substring '" + args[1] + "'");

        try {

            URL url = new URL(args[0]);
            br = new BufferedReader(new InputStreamReader(url.openStream()));

            String line;

            StringBuilder sb = new StringBuilder();

            while ((line = br.readLine()) != null) {

                sb.append(line);
                sb.append(System.lineSeparator());
            }
            if (sb.toString().contains(args[1])) {
                System.out.println("Success!!!");
            }
            else {
                System.out.println("Failure!!!");
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            if (br != null) {
                br.close();
            }
        }

    }
}

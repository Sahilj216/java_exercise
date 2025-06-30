import java.util.Scanner;

public class Answer2 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        System.out.println("Enter input, type XDONE to stop:");

        while (true) {
            String line = inp.nextLine();
            if (line.contains("XDONE")) {
                int idx = line.indexOf("XDONE");
                sb.append(line, 0, idx);
                break;
            }
            sb.append(line).append("\n");
        }

        inp.close();
        System.out.println("\nYou Entered:\n" + sb);
    }
}


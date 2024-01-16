import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

abstract public class ExtractorReport {
    public abstract Pattern getPattern();

    public abstract String getReportName();

    public abstract String clean(String input);

    public String parse(String path) throws FileNotFoundException {
//        numbers only

        StringBuilder out = new StringBuilder();
        File file = new File(path);
        Scanner scanner = new Scanner(file);
//        we need to skip first line header
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        } else {
            return "Empty file";
        }
        while (scanner.hasNextLine()) {
            String nextLine = scanner.nextLine();
            Matcher matcher = getPattern().matcher(nextLine);
            boolean matches = matcher.matches();
            if (matches) {
                out.append(clean(nextLine)).append("\n");
            }

        }

        return out.toString().isBlank() ? "Empty file" : out.toString();
    }

    public void prepareAndSendReport(String path) throws FileNotFoundException {
        System.out.println("Start report " + getReportName() + " .... ");
        String report = parse(path);
        System.out.println(report);
        System.out.println("Sent Report " + getReportName() + " .... ");
    }

}

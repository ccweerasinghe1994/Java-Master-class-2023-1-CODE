import java.util.regex.Pattern;

public class EmailExtractorReport extends ExtractorReport {
    //    let's generate a Pattern for email
    private static final Pattern PATTERN = Pattern.compile("^[a-zA-Z0-9_.+-]+@[a-zA-Z0-9-]+\\.[a-zA-Z0-9-.]+$");

    @Override
    public Pattern getPattern() {
        return PATTERN;
    }

    @Override
    public String getReportName() {
        return "Emails";
    }

    @Override
    public String clean(String input) {
        return input.toLowerCase();
    }


}

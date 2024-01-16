public class Main {

    public static void main(String[] args) {
        NumberExtractor numberExtractor = new NumberExtractor();
        EmailExtractorReport emailExtractorReport = new EmailExtractorReport();
        try {
            emailExtractorReport.prepareAndSendReport("src/data.txt");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
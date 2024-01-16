public class Main {

    public static void main(String[] args) {
        ExtractorReport numberExtractor = new NumberExtractor();
        ExtractorReport emailExtractorReport = new EmailExtractorReport();

        ExtractorReport[] extractorReports = {
                numberExtractor,
                emailExtractorReport
        };

        try {
            for (ExtractorReport extractorReport : extractorReports) {
                extractorReport.prepareAndSendReport("src/data.txt");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println(1 + 1);
        System.out.println("1" + "1");
    }
}
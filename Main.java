public class Main {
    public static void main(String[] args) {

        IReport report = new SalesReport();

        report = new DateFilterDecorator(report);
        report = new SortingDecorator(report);
        report = new CsvExportDecorator(report);

        System.out.println(report.generate());
    }
}

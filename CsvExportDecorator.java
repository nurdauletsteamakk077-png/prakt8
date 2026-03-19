class CsvExportDecorator extends ReportDecorator {
    public CsvExportDecorator(IReport report) {
        super(report);
    }

    public String generate() {
        return report.generate() + "\nExported to CSV";
    }
}

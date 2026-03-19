class DateFilterDecorator extends ReportDecorator {
    public DateFilterDecorator(IReport report) {
        super(report);
    }

    public String generate() {
        return report.generate() + "\nFiltered by Date";
    }
}

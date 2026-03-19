class SortingDecorator extends ReportDecorator {
    public SortingDecorator(IReport report) {
        super(report);
    }

    public String generate() {
        return report.generate() + "\nSorted Data";
    }
}

class ExternalLogisticsServiceB {
    public void sendPackage(String info) {
        System.out.println("Sending package B: " + info);
    }

    public String checkPackageStatus(String code) {
        return "B status: Delivered";
    }
}

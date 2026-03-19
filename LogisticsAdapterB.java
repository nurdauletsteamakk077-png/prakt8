class LogisticsAdapterB implements IInternalDeliveryService {
    private ExternalLogisticsServiceB serviceB = new ExternalLogisticsServiceB();

    public void deliverOrder(String orderId) {
        serviceB.sendPackage(orderId);
    }

    public String getDeliveryStatus(String orderId) {
        return serviceB.checkPackageStatus(orderId);
    }
}

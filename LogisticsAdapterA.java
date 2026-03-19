class LogisticsAdapterA implements IInternalDeliveryService {
    private ExternalLogisticsServiceA serviceA = new ExternalLogisticsServiceA();

    public void deliverOrder(String orderId) {
        serviceA.shipItem(Integer.parseInt(orderId));
    }

    public String getDeliveryStatus(String orderId) {
        return serviceA.trackShipment(Integer.parseInt(orderId));
    }
}

class InternalDeliveryService implements IInternalDeliveryService {
    public void deliverOrder(String orderId) {
        System.out.println("Delivering order: " + orderId);
    }

    public String getDeliveryStatus(String orderId) {
        return "Internal delivery: Delivered";
    }
}

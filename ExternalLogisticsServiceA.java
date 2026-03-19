class ExternalLogisticsServiceA {
    public void shipItem(int itemId) {
        System.out.println("Shipping item A: " + itemId);
    }

    public String trackShipment(int shipmentId) {
        return "A status: In transit";
    }
}

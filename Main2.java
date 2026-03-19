public class Main2 {
    public static void main(String[] args) {

        IInternalDeliveryService service =
                DeliveryServiceFactory.getService("A");

        service.deliverOrder("123");
        System.out.println(service.getDeliveryStatus("123"));
    }
}

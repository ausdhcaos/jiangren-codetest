package comcom;


import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        System.out.println("Enter bundles");

        Scanner scanner = new Scanner(System.in);

        Order order = new Order();
        while (scanner.hasNextLine()) {
            String[] tokens = scanner.nextLine().split(" ");
            OrderItem orderItem = new OrderItem(tokens);
            order.getOrderItemList().add(orderItem);

            orderItem.orderItemType.checkCurrentCode(orderItem.getCode());

            orderItem.bundleType.calBundleTypes(orderItem.orderItemType.getStandardCode(), orderItem.getCode());

            orderItem.bundleItems.mainCal(orderItem.getNumber(), orderItem.bundleType.getCurrentType());

            orderItem.orderItemPrice.calculatePrice(orderItem.getCode(), orderItem.orderItemType.getStandardCode(), orderItem.bundleItems);

        }

        scanner.close();
        for (int i = 0; i < order.OrderItemList.size(); i++) {
            if (order.OrderItemList.get(i).orderItemType.getCurrentCode().trim().equals(order.OrderItemList.get(i).orderItemType.getStandardCode()[1])) {
                System.out.println(order.OrderItemList.get(i).getNumber() + " " + order.OrderItemList.get(i).getCode() + " $" + order.OrderItemList.get(i).orderItemPrice.doublePrice);
                System.out.println(order.OrderItemList.get(i).bundleItems.getFirBundleItem() + " x " + order.OrderItemList.get(i).bundleType.getCurrentType()[0]);
                System.out.println(order.OrderItemList.get(i).bundleItems.getSecBundleItem() + " x " + order.OrderItemList.get(i).bundleType.getCurrentType()[1]);
                System.out.println(order.OrderItemList.get(i).bundleItems.getTrdBundleItem() + " x " + order.OrderItemList.get(i).bundleType.getCurrentType()[2]);
            } else {
                System.out.println(order.OrderItemList.get(i).getNumber() + " " + order.OrderItemList.get(i).getCode() + " $" + order.OrderItemList.get(i).orderItemPrice.intPrice);
                System.out.println(order.OrderItemList.get(i).bundleItems.getFirBundleItem() + " x " + order.OrderItemList.get(i).bundleType.getCurrentType()[0]);
                System.out.println(order.OrderItemList.get(i).bundleItems.getSecBundleItem() + " x " + order.OrderItemList.get(i).bundleType.getCurrentType()[1]);
                if (order.OrderItemList.get(i).orderItemType.getCurrentCode().trim().equals(order.OrderItemList.get(i).orderItemType.getStandardCode()[2]))
                    System.out.println(order.OrderItemList.get(i).bundleItems.getTrdBundleItem() + " x " + order.OrderItemList.get(i).bundleType.getCurrentType()[2]);
            }
        }
    }

}








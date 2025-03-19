public class Main {
    public static void main(String[] args) {
        OrderQueue restaurant = new OrderQueue();
        restaurant.addPriorityQueue("Burger");
        restaurant.addPriorityQueue("Fries");
        restaurant.addRegularOrder("Ice Cream");
        restaurant.addRegularOrder("Mickey Mouse");

        restaurant.showOrders();
        System.out.println(restaurant.regularOrder);
        System.out.println(restaurant.priorityQueue);

        System.out.println("Removing Mickey Mouse: " + restaurant.removeOrderFromRegular("Mickey Mouse"));

        restaurant.showOrders();

        System.out.println(restaurant.search("Burger", restaurant.priorityQueue));
    }
}

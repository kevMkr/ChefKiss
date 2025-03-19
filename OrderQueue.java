import java.util.*;

public class OrderQueue {
    Queue<String> regularOrder;
    Queue<String> priorityQueue;

    OrderQueue(){
        regularOrder = new LinkedList<String>();
        priorityQueue = new LinkedList<String>();
    }

    public void addRegularOrder(String order){
        regularOrder.add(order);
    }

    public void addPriorityQueue(String order){
        priorityQueue.add(order);
    }

    public void showOrders(){
        for(String s : priorityQueue){
            System.out.println(s);
        }

        for(String s : regularOrder){
            System.out.println(s);
        }
    }

    public boolean removeOrderFromRegular(String orderRemoval) {
        for(String s : regularOrder){
            if(s.equals(orderRemoval)) {
                regularOrder.remove(orderRemoval);
                return true;
            }
        }
        return false;
    }


    public boolean removeOrderFromPriority(String orderRemoval){
        Iterator<String> iterator = priorityQueue.iterator();
        while (iterator.hasNext()) {
            String s = iterator.next();
            if (s.equals(orderRemoval)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    public boolean search(String searchOrder, Queue<String> queue){
        Queue<String> searchQueue = new LinkedList<String>();
        searchQueue = queue;

        if (!searchQueue.isEmpty()){
            if (searchQueue.peek().equals(searchOrder)){
                return true;
            }
            searchQueue.poll();
            search(searchOrder, searchQueue);
        }
        return false;
    }
}

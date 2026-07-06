public class Sorting_order {
    private static int partition(Order[] orders,int low,int high){
        double pivot = orders[high].totalPrice;
        int i = low - 1;

        for(int j = low; j<high;j++){
            if(orders[j].totalPrice < pivot){
                i++;

                Order temp = orders[i];
                orders[i] = orders[j];
                orders[j] = temp;
            }
        }

        Order temp = orders[i+1];
        orders[i+1] = orders[high];
        orders[high] = temp;
        return i+1;
    }

    //implementation of quicksort to sort order by totalPrice using quickSort
    public static void quickSort(Order[] orders,int low,int high){
        if(low < high){
            int pivot  = partition(orders,low,high);

            quickSort(orders, low, pivot - 1);
            quickSort(orders, pivot+1, high);
        }
    }

    //implementation of bubbleSort to sort order by totalPrice using bubbleSort
    public static void bubbleSort(Order[] orders){
        int n = orders.length;

        for(int i = 0;i<n-1;i++){
            boolean swapped = false;

            for(int j = 0;j<n-i-1;j++){
                if(orders[j].totalPrice > orders[j+1].totalPrice){
                    Order temp = orders[j]; 
                    orders[j] = orders[j+1];
                    orders[j+1] = temp;

                    swapped = true;
                }
            }

            if(!swapped)
                break;
        }
    }
    public static void main(String[] args) {
        Order[] orders = {
            new Order(101, 1, "Sahil Kumar", "Kanpur", 2500),
            new Order(102, 2, "Rahul Sharma", "Lucknow", 1800),
            new Order(103, 3, "Priya Singh", "Delhi", 4500),
            new Order(104, 4, "Amit Verma", "Noida", 3200),
            new Order(105, 5, "Neha Gupta", "Agra", 1500),
            new Order(106, 6, "Rohan Mishra", "Varanasi", 6000),
            new Order(107, 7, "Anjali Yadav", "Prayagraj", 2800),
            new Order(108, 8, "Vikas Patel", "Jaipur", 5200)
        };

        bubbleSort(orders);
        System.out.println("Orders after sorting with Bubble sort: ");
        for(Order order : orders){
            order.display();
        }
        System.out.println("==========================================");
        quickSort(orders, 0, orders.length - 1);
        System.out.println("Orders after sorting with Quick Sort: ");
        for(Order order : orders){
            order.display();
        }
    }
}

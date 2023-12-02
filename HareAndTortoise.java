public class HareAndTortoise{
public static void main(String[] args) {

        int tortoise = 0, hare = 1;
        int[] arr = {1, 2, 3,4, 5, 6, 5};

        do{
            tortoise = arr[tortoise];
           hare= arr[arr[hare]];

        }while (tortoise != hare);
        hare = arr[0];
        while (tortoise != hare) {
            tortoise = arr[tortoise];
            hare = arr[hare];
        }
        System.out.println("the index of repeating no is "+tortoise);


    }
}

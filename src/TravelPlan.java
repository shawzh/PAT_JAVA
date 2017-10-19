import java.util.Scanner;

public class
TravelPlan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int S = sc.nextInt();
        int D = sc.nextInt();

        int[][] distance = new int[N][N];
        int[][] price = new int[N][N];
        int temp1, temp2;
        for (int i = 0; i < M; i++) {
            temp1 = sc.nextInt();
            temp2 = sc.nextInt();
            distance[temp1][temp2] = distance[temp2][temp1] = sc.nextInt();
            price[temp1][temp2] = price[temp2][temp1] = sc.nextInt();
        }
        for (int i = 0; i <M; i++) {

        }

    }


}

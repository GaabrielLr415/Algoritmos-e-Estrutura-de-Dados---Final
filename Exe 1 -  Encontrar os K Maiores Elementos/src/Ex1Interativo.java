import java.util.*;

public class Ex1Interativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Entrada do array
        System.out.println("Digite o tamanho do array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Digite os " + n + " valores:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Entrada do K
        System.out.println("Digite o valor de K:");
        int k = sc.nextInt();

        // Chama o método do exercício
        List<Integer> maiores = findKthLargest(arr, k);

        // Exibe resultado
        System.out.println("Os " + k + " maiores elementos são:");
        System.out.println(maiores);
    }

    public static List<Integer> findKthLargest(int[] arr, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        for (int n : arr) {
            minHeap.add(n);
            if (minHeap.size() > k) minHeap.poll();
        }
        return new ArrayList<>(minHeap);
    }
}

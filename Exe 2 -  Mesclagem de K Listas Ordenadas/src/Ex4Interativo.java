import java.util.*;

public class Ex4Interativo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o tamanho do array:");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Digite os valores:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        boolean eh = isMinHeap(arr);

        if (eh)
            System.out.println("O array é um Min-Heap válido!");
        else
            System.out.println("O array NÃO é um Min-Heap válido!");
    }

    public static boolean isMinHeap(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int left = 2*i + 1;
            int right = 2*i + 2;
            if (left < arr.length && arr[i] > arr[left]) return false;
            if (right < arr.length && arr[i] > arr[right]) return false;
        }
        return true;
    }
}

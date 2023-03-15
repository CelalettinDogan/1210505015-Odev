import java.util.Random;

public class Main {


    public static int maxbul(int[] arr) {
        int n = arr.length;
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    public static int maxforce(int[] arr) {
        int n = arr.length;
        int max = arr[0];
        for (int i = 0; i < n; i++) {
            boolean isMax = true;
            for (int j = 0; j < n; j++) {
                if (arr[j] > arr[i]) {
                    isMax = false;
                    break;
                }
            }
            if (isMax) {
                max = arr[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {

        Random rand = new Random(); //Rastgele dizimizi oluşturduk
        int[] arr = new int[10000];
        for (int i = 0; i < 10000; i++) {
            arr[i] = rand.nextInt(10000);
        }

        long bas = System.nanoTime(); //Bol ve fethet algoritmamızın çalışma zamanını bulduk
        int max = maxbul(arr);
        long bit = System.nanoTime();
        long sure = bit - bas;
        System.out.println("Böl ve Fethet algoritmasının çalışma süresi: " + sure + " nanosaniye");
        System.out.println("En büyük sayı: " + max);

        bas = System.nanoTime();  //BruteFotce çalışma zamanını bulduk
        int maxBruteForce = maxforce(arr);
        bit = System.nanoTime();
        sure = bit - bas;
        System.out.println("Brute Force algoritmasının çalışma süresi: " + sure + " nanosaniye");
        System.out.println("En büyük sayı: " + maxBruteForce);
    }
}


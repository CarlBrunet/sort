public class TownSort {
    public static void sort (Ville [] arr,int low,int high) {
        if (low < high) {
            int p = part(arr, low, high);

            sort(arr, low, p - 1);
            sort(arr, p+1, high);
        }
    }


    private static int part (Ville [] arr, int low, int high) {
        int i = low -1;
        int pivot = arr[high].getTemp();
        for (int j = low; j < high; j++) {
            if (arr[j].getTemp() <= pivot) {
                i++;
                Ville temp = new Ville(arr[j].getName(), arr[j].getTemp());
                arr[j] = new Ville(arr[i].getName(),arr[i].getTemp());
                arr[i] = temp;
            }
        }
        Ville temp = new Ville(arr[high].getName(), arr[high].getTemp());
        arr[high] = new Ville(arr[i+1].getName(), arr[i+1].getTemp());
        arr[i+1] = temp;
        return i+1;
    }

    private static void alphaSort (Ville [] arr, int s1, int s2) {
        boolean done = false;
        int compteur = 0;
        while (!done) {
            if (arr[s1].getName().charAt(compteur) < arr[s2].getName().charAt(compteur)) {
                done = true;
            }
            else if (arr[s1].getName().charAt(compteur) > arr[s2].getName().charAt(compteur)) {
                done = true;
                Ville temp = new Ville(arr[s2].getName(),arr[s2].getTemp());
                arr[s2] = new Ville(arr[s1].getName(),arr[s1].getTemp());
                arr[s1] = temp;
            }
            compteur++;
        }
    }
}

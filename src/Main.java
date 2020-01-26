public class Main {

    public static void main(String args[]) {
        Ville montreal = new Ville("montreal" , 12);
        Ville nyc = new Ville ("new York" , 15);
        Ville havana = new Ville ("havana", 22);
        Ville moscow = new Ville ("moscow", 12);
        Ville aruba = new Ville ("aruba" , 25);
        Ville rio = new Ville ("rio", 21);
        Ville cairo = new Ville("cairo", 24);
        Ville beijing = new Ville("beijing", 18);

        Ville [] arr = {montreal, nyc, havana, moscow, aruba, rio, cairo, beijing};
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getName());
        }

        TownSort.sort(arr,0,arr.length -1);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].getName());
        }
    }
}

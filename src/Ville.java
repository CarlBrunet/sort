public class Ville {
    String name;
    int tempMoyenne;

    public Ville (String name, int tempMoyenne) {
        this.name = name;
        this.tempMoyenne = tempMoyenne;
    }

    public String getName () {
        return name;
    }
    public void setName (String name) {
        this.name = name;
    }

    public int getTemp () {
        return tempMoyenne;
    }

    public void setTemp (int tempMoyenne) {
        this.tempMoyenne = tempMoyenne;
    }
}

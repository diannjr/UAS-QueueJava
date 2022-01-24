/**
 *
 * @author DIAN
 */
public class Animal {
    private String animal;
    private String warna;
    private int id;

    public Animal(String animal, String warna, int id) {
        this.animal = animal;
        this.warna = warna;
        this.id = id;
    }

    public String getAnimal() {
        return animal;
    }

    public void setAnimal(String animal) {
        this.animal = animal;
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    

    @Override
    public String toString() {
        return "Animal{" +
                "Jenis Hewan = '" + animal + '\'' +
                ", Warna = '" + warna + '\'' +
                ", ID = " + id +
                '}';
    }
}
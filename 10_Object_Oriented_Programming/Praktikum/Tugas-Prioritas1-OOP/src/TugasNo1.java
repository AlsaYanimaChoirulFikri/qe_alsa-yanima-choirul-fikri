public class TugasNo1 {
    private String title;
    private String description;
    private String lecturer;
    private String level;
    private int price;

    public TugasNo1(String title, String description, String lecturer, String level, int price) {
        this.title = title;
        this.description = description;
        this.lecturer = lecturer;
        this.level = level;
        this.price = price;
    }

    // Setter & Getter
    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setLecturer(String lecturer) {
        this.lecturer = lecturer;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getLecturer() {
        return lecturer;
    }

    public String getLevel() {
        return level;
    }

    public int getPrice() {
        return price;
    }

    public void getInfo() {
        System.out.println("Judul Course: " + title);
        System.out.println("Deskripsi: " + description);
        System.out.println("Pengajar: " + lecturer);
        System.out.println("Level: " + level);
        System.out.println("Harga: " + price);
    }

    public static void main(String[] args) {
        TugasNo1 course1 = new TugasNo1("IoT", "Belajar tentang Internet of Things", "Johnny Fritz", "Pemula", 2500000);
        TugasNo1 course2 = new TugasNo1("Quality Engineer", "Pembelajaran tentang Quality Engineer", "Nadir", "Pemula", 3600000);
        TugasNo1 course3 = new TugasNo1("Instrumentation", "Belajar dari awal tentang Instrumentation", "C. Bale", "Semua level", 3500000);

        course1.getInfo();
        System.out.println("==="); // Separator
        course2.getInfo();
        System.out.println("==="); // Separator
        course3.getInfo();
    }
}

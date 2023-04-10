import java.util.HashMap;
import java.util.Scanner;

public class Mahasiswa {
    static Scanner sc = new Scanner(System.in);
    String name, itClass, lessonPractice;
    Integer nim;

    public Mahasiswa(String name, String itClass, String lesson, Integer nim) {
        this.name = name;
        this.itClass = itClass;
        this.lessonPractice = lesson;
        this.nim = nim;
    }

    public static void main(String[] args) {
        HashMap<String, Mahasiswa> mahasiswa = new HashMap<>();
        String input;
        Mahasiswa data;

        mahasiswa.put("1", new Mahasiswa("Putri", "3H", "Struktur Data", 2020000));
        mahasiswa.put("2", new Mahasiswa("Agus", "3A", "Matematika", 2020012));
        mahasiswa.put("3", new Mahasiswa("Arro", "3D", "Pemrograman", 2020017));

        System.out.print("Masukkan ID : ");
        input = sc.nextLine();
        
        data = mahasiswa.get(input);

        if (data != null) {
            System.out.println("Data Mahasiswa : " + data.name + ", Kelas : " + data.itClass
                    + ", Mata Kuliah Praktikum : " + data.lessonPractice + ", Nim : " + data.nim);
        }
    }
}

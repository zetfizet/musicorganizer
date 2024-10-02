import java.util.ArrayList;
import java.util.Scanner;

public class MusicOrganizer {
    // List untuk menyimpan koleksi musik
    private ArrayList<String> musicList;

    // Konstruktor
    public MusicOrganizer() {
        musicList = new ArrayList<>();
    }

    // Method untuk menambahkan musik
    public void addMusic(String music) {
        musicList.add(music);
        System.out.println(music + " berhasil ditambahkan!");
    }

    // Method untuk menampilkan daftar musik
    public void showList() {
        if (musicList.isEmpty()) {
            System.out.println("Daftar musik kosong.");
        } else {
            System.out.println("Daftar musik:");
            for (int i = 0; i < musicList.size(); i++) {
                System.out.println((i + 1) + ". " + musicList.get(i));
            }
        }
    }

    // Method untuk menampilkan total musik
    public void showTotalMusic() {
        System.out.println("Total musik: " + musicList.size());
    }

    // Method untuk menghapus musik berdasarkan indeks
    public void removeMusic(int index) {
        if (index >= 0 && index < musicList.size()) {
            String removedMusic = musicList.remove(index);
            System.out.println(removedMusic + " berhasil dihapus!");
        } else {
            System.out.println("Indeks tidak valid.");
        }
    }

    // Method untuk menampilkan menu dan menangani pilihan pengguna
    public void showMenu() {
        Scanner scanner = new Scanner(System.in);
        int choice = -1;

        while (choice != 5) {
            System.out.println("\n=== Music Organizer Menu ===");
            System.out.println("1. Add music");
            System.out.println("2. Show list");
            System.out.println("3. Show total music");
            System.out.println("4. Remove music");
            System.out.println("5. Exit");
            System.out.print("Pilih opsi: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Menangani input newline

            switch (choice) {
                case 1:
                    System.out.print("Masukkan judul musik: ");
                    String music = scanner.nextLine();
                    addMusic(music);
                    break;
                case 2:
                    showList();
                    break;
                case 3:
                    showTotalMusic();
                    break;
                case 4:
                    System.out.print("Masukkan nomor musik yang ingin dihapus: ");
                    int index = scanner.nextInt() - 1;
                    removeMusic(index);
                    break;
                case 5:
                    System.out.println("Keluar dari program...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        }
        scanner.close();
    }

    // Main method
    public static void main(String[] args) {
        MusicOrganizer organizer = new MusicOrganizer();
        organizer.showMenu();
    }
}

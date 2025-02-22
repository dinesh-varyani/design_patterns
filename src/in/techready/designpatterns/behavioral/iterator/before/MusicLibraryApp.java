package in.techready.designpatterns.behavioral.iterator.before;

public class MusicLibraryApp {
    public static void main(String[] args) {
        MusicLibrary musicLibrary = new MusicLibrary();
        musicLibrary.addSong("Song 1");
        musicLibrary.addSong("Song 2");
        musicLibrary.addSong("Song 3");

        musicLibrary.printAllSongs();
    }
}
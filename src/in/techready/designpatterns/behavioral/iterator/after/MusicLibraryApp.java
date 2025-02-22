package in.techready.designpatterns.behavioral.iterator.after;

public class MusicLibraryApp {
    public static void main(String[] args) {
        MusicLibrary musicLibrary = new MusicLibrary();
        musicLibrary.addSong("Song 1");
        musicLibrary.addSong("Song 2");
        musicLibrary.addSong("Song 3");

        // Client code now uses the iterator without exposing 
        // the collection details
        SongIterator iterator = musicLibrary.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
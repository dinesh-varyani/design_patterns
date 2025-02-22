package in.techready.designpatterns.behavioral.iterator.after;

import java.util.ArrayList;
import java.util.List;

// Aggregate class
public class MusicLibrary implements SongIterable {
    private List songs;

    public MusicLibrary() {
        songs = new ArrayList<>();
    }

    public void addSong(String song) {
        songs.add(song);
    }

    
    // Returns the iterator for the collection
    public SongIterator createIterator() {
        return new MusicLibraryIterator(songs);
    }
}
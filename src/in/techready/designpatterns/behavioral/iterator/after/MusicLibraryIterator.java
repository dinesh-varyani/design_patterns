package in.techready.designpatterns.behavioral.iterator.after;

import java.util.Iterator;
import java.util.List;

// Concrete Iterator implementation
public class MusicLibraryIterator implements SongIterator {
    private List<String> songs;
    private int index;

    public MusicLibraryIterator(List<String> songs) {
        this.songs = songs;
        this.index = 0;
    }

    @Override
    public boolean hasNext() {
        return index < songs.size();
    }

    @Override
    public String next() {
        if (this.hasNext()) {
            return songs.get(index++);
        }
        return null;
    }
}


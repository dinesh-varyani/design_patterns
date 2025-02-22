package in.techready.designpatterns.behavioral.iterator.before;

import java.util.ArrayList;
import java.util.List;

public class MusicLibrary {
    private List<String> songs;

    public MusicLibrary() {
        songs = new ArrayList<>();
    }

    public void addSong(String song) {
        songs.add(song);
    }

    public List<String> getSongs() {
        return songs;
    }

    // Client code directly depends on ArrayList
    public void printAllSongs() {
        for (String song : songs) {
            System.out.println(song);
        }
    }
}

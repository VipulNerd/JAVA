
import java.util.ArrayList;

class Album {

    private String name;
    private String artist;
    private SongList songs;

    public static class SongList {

        public ArrayList<Song> songs;

        public SongList() {
            this.songs = new ArrayList<>();
        }

        public boolean add() {

        }

        public boolean findSong(String title) {
            for (checkedSongs : song) {

            }
        }

        public boolean findSong() {

        }

    }
}

class Song {

    private String title;
    private double duration;

    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return this.title + ": " + this.duration;
    }

}

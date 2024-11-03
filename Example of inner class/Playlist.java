
import java.util.ArrayList;
import java.util.LinkedList;

class Album {

    private String name;
    private String artist;
    private SongList songs;

    // Album constructor called
    public Album(String name, String artist) {

        this.name = name;
        this.artist = artist;
        this.songs = new SongList();

    }

    // song added using title and duration
    public boolean addSong(String title, double duration) {

        return songs.add(new Song(title, duration));

    }

    // song checked if exist in playlist using trackNuber and then added to playlist
    public boolean addToPlayList(int trackNumber, LinkedList<Song> playList) {

        Song checkedSong = songs.findSong(trackNumber);
        if (checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }
        System.out.println("This album does not have a track " + trackNumber);
        return false;

    }

    // song checked if exist in playlist using title and then added to playlist
    public boolean addToPlayList(String title, LinkedList<Song> playList) {

        Song checkedSong = songs.findSong(title);
        if (checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }
        System.out.println("The song " + title + " is not in this album");
        return false;

    }

    // nested static class
    public static class SongList {

        private ArrayList<Song> songs;

        private SongList() {
            this.songs = new ArrayList<>();
        }

        // add song after checking not present in songs arrayList
        private boolean add(Song song) {

            if (songs.contains(song)) {
                return false;
            }
            songs.add(song);
            return true;

        }

        // find song using title of Song
        private Song findSong(String title) {

            for (Song checkedSongs : songs) {
                if (checkedSongs.getTitle().equals(title)) {
                    return checkedSongs;
                }
            }
            return null;

        }

        // find song using trackNumber
        private Song findSong(int trackNumber) {

            int index = trackNumber - 1;
            if ((index > 0) && (index < songs.size())) {
                return songs.get(index);

            }
            return null;
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

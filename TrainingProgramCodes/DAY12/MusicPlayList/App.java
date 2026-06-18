package DAY12.MusicPlayList;

public class App {
    public static void main(String[] args){
        MusicPlayList playlist = new MusicPlayList();
        playlist.addSongAtEnd("Song 1");
        playlist.addSongAtEnd("Song 2");
        playlist.addSongAtEnd("Song 3");
        playlist.addSongAtBegin("Song 4");
        playlist.addSongAtBegin("Song 5");
        playlist.addSongAtBegin("Song 6");

        playlist.displayPlaylist();
        playlist.playSong("Song 2");
        playlist.displayCurrentSong();
        playlist.displayPreviousSong();
        playlist.removeSongFromBegin();
        playlist.displayPlaylist();
        playlist.removeSongFromEnd();
        playlist.displayPlaylist();
        playlist.UpcomingSongs();
        playlist.searchSong("Song 4");

        playlist.clearPlaylist();
    }
}

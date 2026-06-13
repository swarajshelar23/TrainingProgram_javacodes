package DAY12.MusicPlayList;
import java.util.*;
public class MusicPlayList {
    LinkedList<String> playList = new LinkedList<String>();
    LinkedList<String> History = new LinkedList<String>();

    public void addSongAtBegin(String song){
        playList.addFirst(song);
        System.out.println(song + " is added to the beginning of the playlist.");
    }

    public void addSongAtEnd(String song){
        playList.addLast(song);
        System.out.println(song + " is added to the end of the playlist.");
    }

    public void removeSongFromBegin(){
        if(playList.isEmpty()){
            System.out.println("No songs in the playlist to remove.");
        }
        String removedSongfromBegin = playList.removeFirst();
        System.out.println(removedSongfromBegin + " is removed from the beginning of the playlist.");
    }

    public void removeSongFromEnd(){
        if(playList.isEmpty()){
            System.out.println("No songs in the playlist to remove.");
        }

        String removedSongfromEnd = playList.removeLast();
        System.out.println(removedSongfromEnd + " is removed from the end of the playlist.");
    }

    public void displayCurrentSong(){
        if(playList.isEmpty()){
            System.out.println("No current song available.");
        }
        System.out.println("Current song: " + playList.getLast());
    }

    public void displayPreviousSong(){
        if(History.isEmpty()){
            System.out.println("No previous song available.");
        }
        System.out.println("Previous song: " + History.getLast());
    }

    public void playSong(String song){
        if(playList.isEmpty()){
            System.out.println("No songs in the playlist to play.");
        }
        if(!playList.contains(song)){
            System.out.println(song + " is not in the playlist.");
        }
        History.addLast(song);
        System.out.println("Now playing: " + song);
    }

    public void UpcomingSongs(){
        if(playList.isEmpty()){
            System.out.println("No upcoming songs in the playlist.");
        }
        System.out.println("Upcoming songs:");
        for(String st : playList){
            System.out.println(st);
        }
    }

    public void searchSong(String song){
        if(playList.isEmpty()){
            System.out.println("No such song present in the playlist.");
        }
        System.out.println(song + " is present in the playlist.");
        }

    public void displayPlaylist(){
        if(playList.isEmpty()){
            System.out.println("No songs in the playlist.");
        }
        System.out.println("Current Playlist:");
        for(String st : playList){
            System.out.println(st);
        }
    }

    public void clearPlaylist(){
        if(playList.isEmpty()){
            System.out.println("No songs in the playlist to clear.");
        }
        playList.clear();
        History.clear();
        System.out.println("Playlist cleared.");
    }
}
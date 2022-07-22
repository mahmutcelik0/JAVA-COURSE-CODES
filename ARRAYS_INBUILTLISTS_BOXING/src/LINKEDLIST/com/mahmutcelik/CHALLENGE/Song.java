package LINKEDLIST.com.mahmutcelik.CHALLENGE;

public class Song {
    private String titleOfSong;
    private double durationOfSong;

    public Song(String titleOfSong, double durationOfSong) {
        this.titleOfSong = titleOfSong;
        this.durationOfSong = durationOfSong;
    }

    @Override
    public String toString(){
        return "TITLE OF SONG: "+ this.titleOfSong
                +"\nDURATION OF SONG: "+ this.durationOfSong;
    }

    public String getTitleOfSong() {
        return titleOfSong;
    }

    public void setTitleOfSong(String titleOfSong) {
        this.titleOfSong = titleOfSong;
    }

    public double getDurationOfSong() {
        return durationOfSong;
    }

    public void setDurationOfSong(double durationOfSong) {
        this.durationOfSong = durationOfSong;
    }
}

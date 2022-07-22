package LINKEDLIST.com.mahmutcelik.CHALLENGE;

public class mainClass {
    public static void main(String[] args) {
        Album firstAlbum = new Album("MaNga");
        Album secondAlbum = new Album("YUKSEK SADAKAT");
        Album thirdAlbum = new Album("MOR VE OTESI");

        firstAlbum.addSong("BIR KADIN CIZECEKSIN",4.5);
        firstAlbum.addSong("WE COULD BE THE SAME",3.4);
        secondAlbum.addSong("KAFILE",2.22);
        secondAlbum.addSong("HAYDI GEL ICELIM",3.7);
        thirdAlbum.addSong("BIR DERDIM VAR",2.3);
        thirdAlbum.addSong("CAMBAZ",4.3);

        PlayList playList = new PlayList("BEST OF TURKEY",firstAlbum.getSongList().get(firstAlbum.findIndexOfSong("BIR KADIN CIZECEKSIN")));
        playList.addSongtoPlaylist(secondAlbum.getSongList().get(secondAlbum.findIndexOfSong("KAFILE")));
        playList.addSongtoPlaylist(thirdAlbum.getSongList().get(thirdAlbum.findIndexOfSong("BIR DERDIM VAR")));
        playList.addSongtoPlaylist(firstAlbum.getSongList().get(firstAlbum.findIndexOfSong("WE COULD BE THE SAME")));
        playList.addSongtoPlaylist(secondAlbum.getSongList().get(secondAlbum.findIndexOfSong("HAYDI GEL ICELIM")));
        playList.addSongtoPlaylist(thirdAlbum.getSongList().get(thirdAlbum.findIndexOfSong("CAMBAZ")));

        playList.menu();

    }
}

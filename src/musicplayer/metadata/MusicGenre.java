package musicplayer.metadata;

import javafx.beans.property.ReadOnlyIntegerProperty;
import javafx.beans.property.ReadOnlyStringProperty;
import javafx.collections.ObservableList;

public interface MusicGenre {
    ReadOnlyStringProperty genreTitleProperty();
    String getGenreTitle();
    ObservableList<MusicFile> getSongs();
    ReadOnlyIntegerProperty totalSongsProperty();
    int getTotalSongs();

}

import java.util.Collection;
import java.util.List;
import java.util.ArrayList;

public class Library {
    private List <Media> resources = new ArrayList<Media>();

    public static <Media> void add(Media element, Collection<Media> collection){
        collection.add(element);
    }
}

interface Media {
}

interface Book extends Media {
}

interface Video extends Media {
}

interface Newspaper extends Media {
}

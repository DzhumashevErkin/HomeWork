package HomeWork27;

public class Song {
    private String name;
    private String executor;
    private String text;
    private String genre;

    public void addText(String text){
        this.text+=text;
    }


    @Override
    public String toString() {
        return "Song{" +
                "name='" + name + '\'' +
                ", executor='" + executor + '\'' +
                ", genre='" + genre + '\'' +
                ", text='" + text + '\'' +
                '}';
    }

    public Song() {
    }

    public Song(String name, String executor, String text, String genre) {
        this.name = name;
        this.executor = executor;
        this.text = text;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExecutor() {
        return executor;
    }

    public void setExecutor(String executor) {
        this.executor = executor;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}

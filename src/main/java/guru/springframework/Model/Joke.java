package guru.springframework.Model;

public class Joke extends BaseEntity {

    String joke;

    public String getJoke() {
        return joke;
    }

    public void setJoke(String joke) {
        this.joke = joke;
    }
}

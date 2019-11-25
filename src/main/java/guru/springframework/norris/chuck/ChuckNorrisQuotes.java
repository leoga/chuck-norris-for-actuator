package guru.springframework.norris.chuck;

import org.springframework.stereotype.Component;

@Component
public class ChuckNorrisQuotes {

    public String getRandomQuote() {
        return "random joke";
    }
}

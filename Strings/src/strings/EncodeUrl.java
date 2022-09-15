package strings;

import java.util.HashMap;

public class EncodeUrl {

    HashMap<String, String> hm = new HashMap<>();

    //Method that generates an encoded URL that will be used as index.
    private String generateHashURL() {
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz";
        StringBuilder sb = new StringBuilder(10);
        for (int i = 0; i < 10; i++) {
            int index = (int) (AlphaNumericString.length() * Math.random());
            sb.append(AlphaNumericString.charAt(index));
        }
        //This creates a random string and returns it.
        return sb.toString();
    }

    // Encodes a URL to a shortened URL and returns it.
    public String encode(String longUrl) {

        String predecessorURL = "https://www.tinyURL/";
        String hashURL = predecessorURL + generateHashURL();
        while (hm.containsKey(hashURL)) {
            hashURL = predecessorURL + generateHashURL();
        }
        hm.put(hashURL, longUrl);
        return hashURL;
    }
}

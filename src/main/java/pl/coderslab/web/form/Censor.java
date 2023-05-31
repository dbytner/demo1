package pl.coderslab.web.form;

import java.util.List;

public class Censor {

        public static String doCensorship(String text) {
            if (text == null) {
                return null;
            }
            List<String> censoredWords = List.of("cholibka", "dupa", "php");
            String[] words = text.split(" ");
            for(int i=0; i < words.length; i++) {
                if( censoredWords.contains(words[i])) {
                    words[i] = "*".repeat(words[i].length());
                }
            }
            return String.join(" ", words);
        }
    }


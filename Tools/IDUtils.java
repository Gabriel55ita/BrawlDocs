package tools;

public class IDUtils {

    // Characters for the Tag
    private static final String[] tagChars = {"0", "2", "8", "9", "P", "Y", "L", "Q", "G", "R", "J", "C", "U", "V"};

    /**
     * Converts the id to the tag version
     * @return Tag
     */
    public static String id2Tag(long id) {
        StringBuilder tag = new StringBuilder();
        while (id > 0) {
            int charIndex = (int) Math.floor(id % tagChars.length);
            tag.insert(0, tagChars[charIndex]); // appends the character at the beginning of the string.
            id -= charIndex;
            id /= tagChars.length;
        }
        return "#" + tag;
    }

}

package lab;

/**
 * String-тэй ажиллах туслах утга.
 *
 * Lab15 — Даалгавар 2-т `reverse` функц өөрөө нэмэх болно.
 */
public final class StringUtils {

    private StringUtils() {
        // util class
    }

    public static boolean isBlank(String s) {
        return s == null || s.trim().isEmpty();
    }

    public static String capitalize(String s) {
        if (isBlank(s)) {
            return s;
        }
        return Character.toUpperCase(s.charAt(0)) + s.substring(1);
    }

    // TODO (Даалгавар 2): public static String reverse(String s) { ... }
}

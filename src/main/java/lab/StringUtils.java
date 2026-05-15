package lab;

/**
 * String-тэй ажиллах туслах утга.
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

    /**
     * Өгсөн string-ийг урвуулж буцаана.
     * null орвол null буцаана.
     */
    public static String reverse(String s) {
        if (s == null) {
            return null;
        }
        return new StringBuilder(s).reverse().toString();
    }
}

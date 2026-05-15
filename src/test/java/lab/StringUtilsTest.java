package lab;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    @DisplayName("null → isBlank true")
    void isBlank_null() { assertTrue(StringUtils.isBlank(null)); }

    @Test
    @DisplayName("Зай → isBlank true")
    void isBlank_whitespace() { assertTrue(StringUtils.isBlank("  ")); }

    @Test
    @DisplayName("Текст → isBlank false")
    void isBlank_text() { assertFalse(StringUtils.isBlank("hi")); }

    @Test
    @DisplayName("capitalize: жижиг → том үсэг")
    void capitalize_lower() { assertEquals("Hello", StringUtils.capitalize("hello")); }

    @Test
    @DisplayName("capitalize: null → null")
    void capitalize_null() { assertNull(StringUtils.capitalize(null)); }

    @Test
    @DisplayName("Хоосон string урвуулбал хоосон string буцаана")
    void reverse_emptyString() { assertEquals("", StringUtils.reverse("")); }

    @Test
    @DisplayName("Нэг тэмдэгт string урвуулбал өөрөө буцаана")
    void reverse_singleChar() { assertEquals("A", StringUtils.reverse("A")); }

    @Test
    @DisplayName("ASCII string зөв урвуулагдана")
    void reverse_asciiString() { assertEquals("olleh", StringUtils.reverse("hello")); }

    @Test
    @DisplayName("Юникод (Монгол) тэмдэгт зөв урвуулагдана")
    void reverse_unicodeString() { assertEquals("йалаб", StringUtils.reverse("балай")); }

    @Test
    @DisplayName("null орвол null буцаана")
    void reverse_null() { assertNull(StringUtils.reverse(null)); }

    @Test
    @DisplayName("Олон үгтэй string урвуулагдана")
    void reverse_multiWord() { assertEquals("dlrow olleh", StringUtils.reverse("hello world")); }

    @Test
    @DisplayName("Palindrome урвуулбал өөрөө буцаана")
    void reverse_palindrome() { assertEquals("racecar", StringUtils.reverse("racecar")); }
}

package lab;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    // ── reverse ──────────────────────────────────────────────────────────────

    @Test
    @DisplayName("Хоосон string урвуулбал хоосон string буцаана")
    void reverse_emptyString() {
        assertEquals("", StringUtils.reverse(""));
    }

    @Test
    @DisplayName("Нэг тэмдэгт string урвуулбал өөрөө буцаана")
    void reverse_singleChar() {
        assertEquals("A", StringUtils.reverse("A"));
    }

    @Test
    @DisplayName("ASCII string зөв урвуулагдана")
    void reverse_asciiString() {
        assertEquals("olleh", StringUtils.reverse("hello"));
    }

    @Test
    @DisplayName("Юникод (Монгол) тэмдэгт зөв урвуулагдана")
    void reverse_unicodeString() {
        assertEquals("йалаб", StringUtils.reverse("балай"));
    }

    @Test
    @DisplayName("null орвол null буцаана")
    void reverse_null() {
        assertNull(StringUtils.reverse(null));
    }

    // ── isBlank ──────────────────────────────────────────────────────────────

    @Test
    @DisplayName("null → isBlank true")
    void isBlank_null() {
        assertTrue(StringUtils.isBlank(null));
    }

    @Test
    @DisplayName("Зөвхөн хоосон зай → isBlank true")
    void isBlank_whitespace() {
        assertTrue(StringUtils.isBlank("   "));
    }

    @Test
    @DisplayName("Текст агуулсан string → isBlank false")
    void isBlank_nonEmpty() {
        assertFalse(StringUtils.isBlank("hello"));
    }

    // ── capitalize ───────────────────────────────────────────────────────────

    @Test
    @DisplayName("Жижиг үсгээр эхэлсэн үгийн эхний үсэг том болно")
    void capitalize_lowerCase() {
        assertEquals("Hello", StringUtils.capitalize("hello"));
    }

    @Test
    @DisplayName("null → capitalize null буцаана")
    void capitalize_null() {
        assertNull(StringUtils.capitalize(null));
    }
}

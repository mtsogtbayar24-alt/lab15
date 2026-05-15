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
}

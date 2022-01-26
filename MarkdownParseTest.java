import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

import org.junit.*;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testFile2() throws IOException {
        Path fileName = Path.of("./test-file2.md");
	    String contents = Files.readString(fileName);
        List<String> expected = List.of(contents);
        assertEquals(expected, MarkdownParse.getLinks(contents));
    }
}
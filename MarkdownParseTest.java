import static org.junit.Assert.*;
import java.nio.file.*;
import java.util.ArrayList;
import java.io.IOException;
import java.nio.file.Path;
import org.junit.*;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    ArrayList<String> list1 = new ArrayList<>();

    @Test
    public void getLinksTest() throws IOException{
        Path nameOfFile = Path.of("test-file.md");
        String  fileContents = Files.readString(nameOfFile);
        list1.add("https://something.com");
        list1.add("some-page.html");
        assertEquals("This should work", list1 , MarkdownParse.getLinks(fileContents));
    }
}


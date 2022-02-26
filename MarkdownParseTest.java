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

    

    @Test
    public void getLinksTest0() throws IOException{
        ArrayList<String> list1 = new ArrayList<>();
        Path nameOfFile = Path.of("break0.md");
        String  fileContents = Files.readString(nameOfFile);
        list1.add("https://something.com");
        list1.add("some-page.html");
        assertEquals("This should work", list1 , MarkdownParse.getLinks(fileContents));
    }

    @Test
    public void getLinksTest1() throws IOException{
        ArrayList<String> list1 = new ArrayList<>();
        Path nameOfFile = Path.of("break1.md");
        String  fileContents = Files.readString(nameOfFile);
        list1.add("https://something.com");
        list1.add("some-page.html");
        assertEquals("This should work", list1 , MarkdownParse.getLinks(fileContents));
    }

    @Test
    public void getLinksTest2() throws IOException{
        ArrayList<String> list1 = new ArrayList<>();
        Path nameOfFile = Path.of("break2.md");
        String  fileContents = Files.readString(nameOfFile);
        list1.add("https://something().com");
        assertEquals("This should work", list1 , MarkdownParse.getLinks(fileContents));
    }

    @Test
    public void getLinksTest3() throws IOException{
        ArrayList<String> list1 = new ArrayList<>();
        Path nameOfFile = Path.of("break3.md");
        String  fileContents = Files.readString(nameOfFile);
        assertEquals("This should work", list1 , MarkdownParse.getLinks(fileContents));
    }


    @Test
    public void getLinksTestSnip1() throws IOException{
        ArrayList<String> list1 = new ArrayList<>();
        Path nameOfFile = Path.of("Snippet1.md");
        String  fileContents = Files.readString(nameOfFile);
        list1.add("url.com");
        list1.add("`google.com");
        list1.add("google.com");
        list1.add("ucsd.edu");
        assertEquals("This should work", list1 , MarkdownParse.getLinks(fileContents));
    }













    
    /*@Test
    public void getLinksTestSnip2() throws IOException{
        ArrayList<String> list1 = new ArrayList<>();
        Path nameOfFile = Path.of("Snippet2.md");
        String  fileContents = Files.readString(nameOfFile);
        list1.add("b.com");
        list1.add("a.com(())");
        list1.add("example.com");
        assertEquals("This should work", list1 , MarkdownParse.getLinks(fileContents));
    }

    @Test
    public void getLinksTestSnip3() throws IOException{
        ArrayList<String> list1 = new ArrayList<>();
        Path nameOfFile = Path.of("Snippet3.md");
        String  fileContents = Files.readString(nameOfFile);
        list1.add("https://www.twitter.com");
        list1.add("https://ucsd-cse15l-w22.github.io/");
        list1.add("github.com");
        list1.add("https://cse.ucsd.edu/");
        assertEquals("This should work", list1 , MarkdownParse.getLinks(fileContents));
    }
*/
    
}


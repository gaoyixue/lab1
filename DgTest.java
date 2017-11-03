import static org.junit.Assert.*;

import org.junit.Test;

/**
 * 
 */

/**
 * @author dell
 *
 */
public class DgTest {
  String []str={"to", "explore", "strange", "new", "worlds", "to", "seek", "out", "new", "life", "and",
      "new","civilizations"};
  public Dg dg=new Dg(str);

  /**
   * Test method for {@link Dg#queryBriDgeWords(java.lang.String, java.lang.String)}.
   */
  @Test
  public void testQueryBriDgeWords() {
    String str2 = dg.queryBriDgeWords("to", "new");
    String str1 = "and";
    assertEquals(str1,str2);
  }

}

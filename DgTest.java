import static org.junit.Assert.*;
import org.junit.Test;
public class DgTest {
  String []str={"to", "explore","out", "strange", "new", "worlds", "to", 
      "seek", "out", "new", "life", "and","new","civilizations"};
  public Dg dg=new Dg(str);
  @Test
  public void testQueryBriDgeWords() {
    /*String str2 = dg.queryBriDgeWords("exciting", "to");
    String str1 = "No 'exciting' in the graph!";
    assertEquals(str1,str2);  
    
    String str4 = dg.queryBriDgeWords("and", "ambulence");
    String str3 = "No 'ambulence' in the graph!";
    assertEquals(str3,str4);  
    
    String str6 = dg.queryBriDgeWords("anymore", "ambulence");
    String str5 = "No 'anymore' and 'ambulence' in the graph!";
    assertEquals(str5,str6);  */
    
    String str8 = dg.queryBriDgeWords("civilizations", "to");
    String str7 = "No briDge word from 'civilizations' to 'to'";
    assertEquals(str7,str8); 
    
    /*String str10 = dg.queryBriDgeWords("new","civilizations");
    String str9 = "No briDge word from 'new' to 'civilizations'";
    assertEquals(str9,str10); 
    
    String str12 = dg.queryBriDgeWords("strange","worlds");
    String str11 = "The briDge words from 'strange' to 'worlds' is:new";
    assertEquals(str11,str12);  
    
    String str14 = dg.queryBriDgeWords("to","out");
    String str13 = "The briDge words from 'to' to 'out' is:seek,explore";
    assertEquals(str13,str14); */
    
  }
}
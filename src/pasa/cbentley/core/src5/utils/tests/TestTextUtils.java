package pasa.cbentley.core.src5.utils.tests;

import java.util.Arrays;
import java.util.HashSet;

import pasa.cbentley.core.src5.ctx.C5Ctx;
import pasa.cbentley.core.src5.utils.TextUtils;
import pasa.cbentley.testing.BentleyTestCase;

public class TestTextUtils extends BentleyTestCase {

   private C5Ctx c5;

   public void setUpMord() {
      c5 = new C5Ctx(uc);
   }

   public void testAddSpacesBasic() throws Exception {
      TextUtils tu = c5.getTextUtils();

      HashSet<String> dic = new HashSet<>(Arrays.asList("bonjour", "le", "monde"));
      assertEquals("bonjour le monde", tu.addSpaces("bonjourlemonde", dic));
   }

   public void testAddSpacesEdgeCases() throws Exception {
      TextUtils tu = c5.getTextUtils();

      HashSet<String> dicEmpty = new HashSet<>();
      assertEquals("peapeanut", tu.addSpaces("peapeanut", dicEmpty));

      HashSet<String> dicPeanut = new HashSet<>(Arrays.asList("pea", "peanut", "monde"));
      assertEquals("", tu.addSpaces("", dicPeanut));

      assertEquals("helloworld", tu.addSpaces("helloworld", dicPeanut));

   }

   public void testAddSpacesHaystack() throws Exception {
      TextUtils tu = c5.getTextUtils();

      HashSet<String> dicHayStack = new HashSet<>(Arrays.asList("hay", "stack", "haystack"));
      assertEquals("stack haystack", tu.addSpaces("stackhaystack", dicHayStack));
   }

   public void testAddSpacesDicEmptyWords() throws Exception {
      TextUtils tu = c5.getTextUtils();

      HashSet<String> dicEmptyWords = new HashSet<>(Arrays.asList("", "", ""));
      assertEquals("", tu.addSpaces("", dicEmptyWords));
      assertEquals("helloworld", tu.addSpaces("helloworld", dicEmptyWords));
   }
   
   public void testAddSpacesDicWordAndEmpty() throws Exception {
      TextUtils tu = c5.getTextUtils();

      HashSet<String> dicEmptyWords = new HashSet<>(Arrays.asList("", "hells"));
      assertEquals("", tu.addSpaces("", dicEmptyWords));
      assertEquals("helloworld", tu.addSpaces("helloworld", dicEmptyWords));
   }
   
   public void testAddSpacesDicHell() throws Exception {
      TextUtils tu = c5.getTextUtils();
      HashSet<String> dicEmptyWords = new HashSet<>(Arrays.asList("hello", "hell", ""));
      //no word world in dic should it remove it? no!
      assertEquals("hello world", tu.addSpaces("helloworld", dicEmptyWords));
      assertEquals("hello world hell", tu.addSpaces("helloworldhell", dicEmptyWords));
   }

   public void testAddSpacesDicLetterUnknown() throws Exception {
      TextUtils tu = c5.getTextUtils();
      HashSet<String> dicEmptyWords = new HashSet<>(Arrays.asList("first", "second"));
      //no word world in dic should it remove it? no!
      assertEquals("first l second", tu.addSpaces("firstlsecond", dicEmptyWords));
   }
   
   public void testAddSpacesDicLongWordUnknown() throws Exception {
      TextUtils tu = c5.getTextUtils();
      HashSet<String> dicEmptyWords = new HashSet<>(Arrays.asList("first", "second"));
      //no word world in dic should it remove it? no!
      assertEquals("first longwordnotindic second", tu.addSpaces("firstlongwordnotindicsecond", dicEmptyWords));
   }
   
   public void testAddSpacesPeanut() throws Exception {
      TextUtils tu = c5.getTextUtils();

      HashSet<String> dicPeanut = new HashSet<>(Arrays.asList("pea", "peanut", "monde"));
      assertEquals("pea peanut", tu.addSpaces("peapeanut", dicPeanut));

   }
}

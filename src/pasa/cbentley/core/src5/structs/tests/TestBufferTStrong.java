/*
 * (c) 2018-2020 Charles-Philip Bentley
 * This code is licensed under MIT license (see LICENSE.txt for details)
 */
package pasa.cbentley.core.src5.structs.tests;

import pasa.cbentley.core.src5.structs.BufferTStrong;
import pasa.cbentley.core.src5.tests.TestCoreSrc5Abstract;

public class TestBufferTStrong extends TestCoreSrc5Abstract {

   
   public void testEmpty() {
      
      BufferTStrong<String> buf = new BufferTStrong<String>(c5, String.class);
      
      assertEquals(0, buf.getSize());
      
      buf.add("Str1");
      buf.add("Str2");
   }
}

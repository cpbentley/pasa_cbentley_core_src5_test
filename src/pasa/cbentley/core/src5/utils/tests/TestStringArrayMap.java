/*
 * (c) 2018-2020 Charles-Philip Bentley
 * This code is licensed under MIT license (see LICENSE.txt for details)
 */
package pasa.cbentley.core.src5.utils.tests;

import pasa.cbentley.core.src5.tests.TestCoreSrc5Abstract;
import pasa.cbentley.core.src5.utils.StringArrayMap;

public class TestStringArrayMap extends TestCoreSrc5Abstract {

   public void testEmpty() {

      StringArrayMap map = new StringArrayMap(c5, 10);

      assertEquals(0, map.size());

   }

   public void testAdd() {

      StringArrayMap map = new StringArrayMap(c5, 10);

      map.put("key", "value");
      
      assertEquals("value", map.get("key"));
      
   }
}

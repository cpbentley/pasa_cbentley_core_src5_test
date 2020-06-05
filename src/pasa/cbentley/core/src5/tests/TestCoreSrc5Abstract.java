/*
 * (c) 2018-2020 Charles-Philip Bentley
 * This code is licensed under MIT license (see LICENSE.txt for details)
 */
package pasa.cbentley.core.src5.tests;

import pasa.cbentley.core.src5.ctx.C5Ctx;
import pasa.cbentley.testing.engine.TestCaseBentley;

public abstract class TestCoreSrc5Abstract extends TestCaseBentley {

   protected C5Ctx c5;

   public void setupAbstract() {
      c5 = new C5Ctx(uc);
   }

}

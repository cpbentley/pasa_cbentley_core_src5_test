package pasa.cbentley.core.src5.tests;

import pasa.cbentley.core.src5.ctx.C5Ctx;
import pasa.cbentley.testing.BentleyTestCase;

public abstract class TestCoreSrc5Abstract extends BentleyTestCase {

   protected C5Ctx c5;

   public void setupAbstract() {
      c5 = new C5Ctx(uc);
   }

}

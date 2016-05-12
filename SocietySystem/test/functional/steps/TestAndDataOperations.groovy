package steps

import societysystem.FieldController
import societysystem.SocietyController

/**
 * Created by felip_000 on 05/12/16.
 */
class TestAndDataOperations {

    static public void qualquerMetodo(String name){
        def controller = new FieldController()
        def controller2 = new SocietyController()
        //controller.params << [name: name, value: 20]
        controller.save()
    }
}

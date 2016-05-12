/**
 * Created by felip_000 on 05/03/16.
 */

import geb.binding.BindingUpdater
import geb.Browser

import static cucumber.api.groovy.Hooks.*

Before () {
    bindingUpdater = new BindingUpdater (binding, new Browser ())
    bindingUpdater.initialize ()
}

After () {
    bindingUpdater.remove ()
}
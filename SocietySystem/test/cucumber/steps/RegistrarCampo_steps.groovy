/**
 * Created by felip_000 on 05/01/16.
 *
 * Class created to model the test the action RegisterField()
 */

import pages.Society.SocietyDetailPage
import societysystem.SocietyController
import steps.TestAndDataOperations

import static cucumber.api.groovy.EN.*
import societysystem.Field
import societysystem.Society
import societysystem.FieldController

Given(~'^User register a new Field with name "([^"]*)" at his Society$'){
    String name ->
        society = new Society(nome: "Society novo")

}

When(~'^I go to Society List Page$'){ ->
    to SocietyDetailPage
    at SocietyDetailPage
}

Then(~'^An updated list with all Field registered must be shown at Fields Page of Society$'){ ->
    assert true
}

/*
*
* */

Given(~'^There is a Field named "([^"]*)"$'){

    /*
    * Seto o sistema para ter pelo menos um campo com nome "A"
    * */
    String name ->
        t = new TestAndDataOperations()
        t.qualquerMetodo(name)

}

When(~'^I try to register the field "([^"]*)"$'){
    /*
    * Eu tento salvar um campo com o nome "A" no sistema, com informações adicionais diferentes
    * */
    String name ->
        def controller = new FieldController()
        controller.params << [name: name, value: 40]
        controller.save()

}

Then(~'^The system does not register Field "([^"]*)"$'){String name ->
    /*
    *
    * */
    def fields = Field.list()
    boolean add_incorrect = False
    fields.each {
        add_incorrect = (it.getValue() == 40)
    }

    assert !add_incorrect
}

Feature: As an user,
  I can create, modify and remove a Field on Society
  so that I am able to Manage my Society correctly


  Scenario: Update Field List as soon as I create a new Field
    Given User register a new Field with name "A" at his Society
    When I go to Society List Page
    Then An updated list with all Field registered must be shown at Fields Page of Society
@ignore
  Scenario: Register Field "B" at Field List of Society "C"
    Given I am at Register Field Page of Socitye "C"
    And all data is field correctly
    When I try to register
    Then I am sent to "Detalhes do Society" and A success message is shown

  Scenario: Register the same field twice
    Given There is a Field named "A"
    When  I try to register the field "A"
    Then The system does not register Field "A"

  @ignore
  Scenario: Try to Register a Field with data missing
    Given I am at "Register Field" page
    And I do not fill "Register Field" page name attribute
    When I try to finish the Registration
    Then The system shows an error message
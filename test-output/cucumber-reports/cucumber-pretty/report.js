$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("target/test-classes/UI-Test.feature");
formatter.feature({
  "line": 1,
  "name": "Checkout items in the basket",
  "description": "Please use home page of https://www.saucedemo.com/",
  "id": "checkout-items-in-the-basket",
  "keyword": "Feature"
});
formatter.before({
  "duration": 2002245500,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "Check item total cost and tax",
  "description": "",
  "id": "checkout-items-in-the-basket;check-item-total-cost-and-tax",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@UIT"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "I am on the home page",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I login in with the following details",
  "rows": [
    {
      "cells": [
        "userName",
        "Password"
      ],
      "line": 8
    },
    {
      "cells": [
        "standard_user",
        "secret_sauce"
      ],
      "line": 9
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 11,
  "name": "I add the following items to the basket",
  "rows": [
    {
      "cells": [
        "Sauce Labs Backpack"
      ],
      "line": 12
    },
    {
      "cells": [
        "Sauce Labs Fleece Jacket"
      ],
      "line": 13
    },
    {
      "cells": [
        "Sauce Labs Bolt T-Shirt"
      ],
      "line": 14
    },
    {
      "cells": [
        "Sauce Labs Onesie"
      ],
      "line": 15
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I  should see 4 items added to the shopping cart",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "I click on the shopping cart",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "I verify that the QTY count for each item should be 1",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "I remove the following item:",
  "rows": [
    {
      "cells": [
        "Sauce Labs Fleece Jacket"
      ],
      "line": 21
    }
  ],
  "keyword": "And "
});
formatter.step({
  "line": 22,
  "name": "I  should see 3 items added to the shopping cart",
  "keyword": "And "
});
formatter.step({
  "line": 23,
  "name": "I click on the CHECKOUT button",
  "keyword": "And "
});
formatter.step({
  "line": 24,
  "name": "I type \"FirstName\" for First Name",
  "keyword": "And "
});
formatter.step({
  "line": 25,
  "name": "I type \"LastName\" for Last Name",
  "keyword": "And "
});
formatter.step({
  "line": 26,
  "name": "I type \"EC1A 9JU\" for ZIP/Postal Code",
  "keyword": "And "
});
formatter.step({
  "line": 28,
  "name": "I click on the CONTINUE button",
  "keyword": "When "
});
formatter.step({
  "line": 29,
  "name": "Item total will be equal to the total of items on the list",
  "keyword": "Then "
});
formatter.step({
  "line": 30,
  "name": "a Tax rate of 8 % is applied to the total",
  "keyword": "And "
});
formatter.match({
  "location": "UITestStepDefinitions.iAmOnTheHomePage()"
});
formatter.result({
  "duration": 354051467,
  "status": "passed"
});
formatter.match({
  "location": "UITestStepDefinitions.i_login_in_with_the_following_details(DataTable)"
});
formatter.result({
  "duration": 440477297,
  "status": "passed"
});
formatter.match({
  "location": "UITestStepDefinitions.i_add_the_following_items_to_the_basket(DataTable)"
});
formatter.result({
  "duration": 1395151290,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "4",
      "offset": 14
    }
  ],
  "location": "UITestStepDefinitions.i_should_see_items_added_to_the_shopping_cart(int)"
});
formatter.result({
  "duration": 25619507,
  "status": "passed"
});
formatter.match({
  "location": "UITestStepDefinitions.i_click_on_the_shopping_cart()"
});
formatter.result({
  "duration": 84339526,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 52
    }
  ],
  "location": "UITestStepDefinitions.i_verify_that_the_QTY_count_for_each_item_should_be(int)"
});
formatter.result({
  "duration": 51747349,
  "status": "passed"
});
formatter.match({
  "location": "UITestStepDefinitions.i_remove_the_following_item(DataTable)"
});
formatter.result({
  "duration": 84690016,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "3",
      "offset": 14
    }
  ],
  "location": "UITestStepDefinitions.i_should_see_items_added_to_the_shopping_cart(int)"
});
formatter.result({
  "duration": 13727604,
  "status": "passed"
});
formatter.match({
  "location": "UITestStepDefinitions.i_click_on_the_CHECKOUT_button()"
});
formatter.result({
  "duration": 78520181,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "FirstName",
      "offset": 8
    }
  ],
  "location": "UITestStepDefinitions.i_type_for_First_Name(String)"
});
formatter.result({
  "duration": 56211119,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "LastName",
      "offset": 8
    }
  ],
  "location": "UITestStepDefinitions.i_type_for_Last_Name(String)"
});
formatter.result({
  "duration": 43944608,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "EC1A 9JU",
      "offset": 8
    }
  ],
  "location": "UITestStepDefinitions.i_type_for_ZIP_Postal_Code(String)"
});
formatter.result({
  "duration": 44087817,
  "status": "passed"
});
formatter.match({
  "location": "UITestStepDefinitions.i_click_on_the_CONTINUE_button()"
});
formatter.result({
  "duration": 78486200,
  "status": "passed"
});
formatter.match({
  "location": "UITestStepDefinitions.item_total_will_be_equal_to_the_total_of_items_on_the_list()"
});
formatter.result({
  "duration": 57623409,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "8",
      "offset": 14
    }
  ],
  "location": "UITestStepDefinitions.a_Tax_rate_of_is_applied_to_the_total(int)"
});
formatter.result({
  "duration": 39426085,
  "status": "passed"
});
formatter.after({
  "duration": 602329841,
  "status": "passed"
});
});
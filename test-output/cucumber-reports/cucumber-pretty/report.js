$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("target/test-classes/API-Test.feature");
formatter.feature({
  "line": 1,
  "name": "API test",
  "description": "",
  "id": "api-test",
  "keyword": "Feature"
});
formatter.before({
  "duration": 1442920460,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Should see LIST USERS of all existing users",
  "description": "",
  "id": "api-test;should-see-list-users-of-all-existing-users",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 3,
      "name": "@API"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I get the default list of users for on 1st page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I get the list of all users within every page",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I should see total users count equals the number of user ids",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "1",
      "offset": 39
    }
  ],
  "location": "StepDefinition.i_get_the_default_list_of_users_for_on_st_page(int)"
});
formatter.result({
  "duration": 138147588,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.iGetTheListOfAllUsers()"
});
formatter.result({
  "duration": 17940,
  "status": "passed"
});
formatter.match({
  "location": "StepDefinition.iShouldMatchTotalCount()"
});
formatter.result({
  "duration": 13778,
  "status": "passed"
});
formatter.after({
  "duration": 468930460,
  "status": "passed"
});
});
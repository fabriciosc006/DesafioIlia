$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("Catapi.feature");
formatter.feature({
  "line": 1,
  "name": "Actions in Api The Cat Api",
  "description": "I want to make some actions inside Api",
  "id": "actions-in-api-the-cat-api",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 5,
  "name": "Receive token",
  "description": "",
  "id": "actions-in-api-the-cat-api;receive-token",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 4,
      "name": "@voto1"
    }
  ]
});
formatter.step({
  "line": 6,
  "name": "acess to The Cat Api",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "give a POST to vote with token \"00000\"",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "receive request status",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});
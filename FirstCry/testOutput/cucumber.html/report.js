$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/FirstCry.feature");
formatter.feature({
  "name": "Validating First cry website order",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Launching firstcry website",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@test1"
    }
  ]
});
formatter.step({
  "name": "launching browser",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "hit the firstcry URL",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "First cry website launched",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.scenario({
  "name": "Mouse hover on All categories and boys Fashion",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@test2"
    }
  ]
});
formatter.step({
  "name": "Mouse hover on All categories and boys fashion",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Open the sub categories",
  "keyword": "When "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Open the sub categories of Boys fashion",
  "keyword": "Then "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});
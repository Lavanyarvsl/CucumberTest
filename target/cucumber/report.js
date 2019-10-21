$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri('Annotation\outline.feature');
formatter.feature({
  "line": 1,
  "name": "annotation",
  "description": "",
  "id": "annotation",
  "keyword": "Feature"
});
formatter.background({
  "comments": [
    {
      "line": 2,
      "value": "#This is how background can be used to eliminate duplicate steps"
    }
  ],
  "line": 4,
  "name": "",
  "description": " User navigates to Facebook Given \r\n I am on Facebook login page",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "comments": [
    {
      "line": 8,
      "value": "#Scenario with AND"
    }
  ],
  "line": 9,
  "name": "",
  "description": "",
  "id": "annotation;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 10,
  "name": "I enter username as \"TOM\"",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "I enter password as \"JERRY\"",
  "keyword": "And "
});
formatter.step({
  "line": 12,
  "name": "Login should fail",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "TOM",
      "offset": 21
    }
  ],
  "location": "annotation.enterUsername(String)"
});
formatter.result({
  "duration": 128224878,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "JERRY",
      "offset": 21
    }
  ],
  "location": "annotation.enterPassword(String)"
});
formatter.result({
  "duration": 45511,
  "status": "passed"
});
formatter.match({
  "location": "annotation.checkFail()"
});
formatter.result({
  "duration": 43805,
  "status": "passed"
});
formatter.background({
  "comments": [
    {
      "line": 2,
      "value": "#This is how background can be used to eliminate duplicate steps"
    }
  ],
  "line": 4,
  "name": "",
  "description": " User navigates to Facebook Given \r\n I am on Facebook login page",
  "type": "background",
  "keyword": "Background"
});
formatter.scenario({
  "comments": [
    {
      "line": 14,
      "value": "#Scenario with BUT"
    }
  ],
  "line": 15,
  "name": "",
  "description": "",
  "id": "annotation;",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 16,
  "name": "I enter username as \"TOM\"",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "I enter password as \"JERRY\"",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "Login should fail",
  "keyword": "Then "
});
formatter.step({
  "line": 19,
  "name": "Relogin option should be available",
  "keyword": "But "
});
formatter.match({
  "arguments": [
    {
      "val": "TOM",
      "offset": 21
    }
  ],
  "location": "annotation.enterUsername(String)"
});
formatter.result({
  "duration": 63716,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "JERRY",
      "offset": 21
    }
  ],
  "location": "annotation.enterPassword(String)"
});
formatter.result({
  "duration": 58026,
  "status": "passed"
});
formatter.match({
  "location": "annotation.checkFail()"
});
formatter.result({
  "duration": 35840,
  "status": "passed"
});
formatter.match({
  "location": "annotation.checkRelogin()"
});
formatter.result({
  "duration": 42666,
  "status": "passed"
});
});
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("features/search/CreateNewAccount.feature");
formatter.feature({
  "name": "Sing In",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "I sign in to page",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "Savita on create account page",
  "keyword": "Given "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
formatter.step({
  "name": "Enter email id for sign in \u003cemail\u003e",
  "rows": [
    {
      "cells": [
        "email"
      ]
    },
    {
      "cells": [
        "shindesavita87@gmail.com"
      ]
    }
  ],
  "keyword": "And "
});
formatter.match({});
formatter.result({
  "status": "undefined"
});
});
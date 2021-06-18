<!-- TABLE OF CONTENTS -->
<details open="open">
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#scope">Scope</a>
      <ul>
        <li><a href="#in-scope">In Scope</a></li>
        <li><a href="#out-of-scope">Out Of Scope</a></li>
      </ul>
    </li>
    <li><a href="#quality-objective">Quality Objective</a></li>
    <li><a href="#methodology">Methodology</a>
      <ul>
        <li><a href="#why-waterfall">Why Waterfall</a></li>
        <li><a href="#test-levels">Test Levels</a></li>
        <li><a href="#bug-triage">Bug Triage</a></li>
        <li><a href="#suspension-criteria-and-resumption-requirements">Suspension Criteria and Resumption Requirements</a></li>
        <li><a href="#test-completeness">Test Completeness</a></li>
      </ul>
    </li>
    <li><a href="#test-deliverables">Test Deliverables</a></li>
  </ol>
</details>


## Scope

The target of testing will be [GoREST](https://gorest.co.in) API that supports GET, POST, PATCH, PUT, DELETE, OPTIONS and HEAD type requests.

### In Scope

* Test positive cases of request types. Example: User/post/comments/ect. create/update/view/search.
* Test security using OAuth2 protocol such as using wrong bearer token or using old token after generating new one.
* Fuzz testing, using randome data in request.
* Test negative test cases where the requests will contain wrong type of information. Example: using anything other than Active or Inactive for Status field. 
* Performance test scenarios with 10 or more requests. Includes Load/Soak/Stress/Spike tests

Tests must cover Http Response Codes mentioned in the bottom of [GoREST](https://gorest.co.in) web page.

### Out Of Scope

* UI testing is not needed.
* HTTP Basic Auth will not be tested as it is no more supported in this API.
* Penetration/Integration testing as it will take too much time.


## Quality Objective

The objective is to create a functioning framework that will:
* Be able to send/get requests/responses.
* Assess said responses and store them in DataBase.
* Be fast and precise in running test cases.

## Methodology

Waterfall methodology will be used for this project.

![waterfall]


### Why Waterfall

* [GoREST](https://gorest.co.in) is developed and functioning API with defined scecefications and functionalities.
* The timeframe is short for iterative or continuous development.

### Test Levels

* Unit testing
* Performance testing

### Bug Triage

Responses that are not alligned with or mentioned in the bottom of [GoREST](https://gorest.co.in) web page 
are counted as bugs and be showed as FAILED in report.

### Suspension Criteria and Resumption Requirements

None

### Test Completeness

* Allegiance with the document
* Functioning framework
* Coverage of at least few of each unit/performance/security cases


## Test Deliverables

* Test Plan
* Test Strategy
* Test Cases
* Bug Reports

[waterfall]:https://www.umsl.edu/~hugheyd/is6840/images/Waterfall_model.png

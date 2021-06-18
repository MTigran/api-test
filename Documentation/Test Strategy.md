<!-- TABLE OF CONTENTS -->
<details open="open">
  <summary>Table of Contents</summary>
  <ol>
    <li><a href="#scope">Scope</a></li>
    <li><a href="#test-approach ">Test Approach </a></li>
    <li><a href="#test-environment">Test Environment</a></li>
    <li><a href="#testing-tools">Testing Tools</a></li>
    <li><a href="#todo">#TODO</a></li>
    <!-- 
    <li><a href="#"></a></li>
    <li><a href="#"></a></li>
    <li><a href="#"></a></li>
    <li><a href="#"></a></li>
    -->
  </ol>
</details>


## Scope

* The objective is to assess the technical knowledge of creator.
* The doument will be reviewed and approved by requestor.
* The API will be tested according to it's basic specifications documented [here](https://gorest.co.in).
* The UI(web page) will not be tested and will be defined as Out Of Scope.


## Test Approach 

* Types of testing include Functional, Security and Performace testing
* Test cases will be created based on manual tests.
* Will use Reactive Dynamical testing approach coupled with Static testing to safe a bit time.

## Test Environment

* Windows 10 with internet adapter should be sufficient.
* Steps for environment installation are provided [here](https://github.com/MTigran/api-test#prerequisites).
* Project and test data backup will be located in Git repository.
* Automation cron job should be set in Jenkins(or other DevOps tool)


## Testing Tools

* TestNG as testing framework
* Automation cron job should be set in Jenkins(or other DevOps tool)
* Jenkins Test Reports Analizer for defect analizing
* Klov Reporter as bug reporting tool

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

# TODO

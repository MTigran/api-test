<!-- TABLE OF CONTENTS -->
<details open="open">
  <summary>Table of Contents</summary>
  <ol>
    <li><a href="#scope">Scope</a></li>
    <li>
    <a href="#test-scenarios">Test Scenarios</a>
      <ul>
        <li><a href="#scenario-set-1">Scenario Set 1: Positive scenario for calling GET request</a>
      </ul>
      <ul>
        <li><a href="#scenario-set-2">Scenario Set 2: Negative scenario for calling GET request</a>
      </ul>
      <ul>
        <li><a href="#scenario-set-3">Scenario Set 3: Positive scenario for calling POST request</a>
      </ul>
      <ul>
        <li><a href="#scenario-set-4">Scenario Set 4: Negative scenario for calling POST request</a>
      </ul>
      <ul>
        <li><a href="#scenario-set-5">Scenario Set 5: Negative scenario for calling PATCH request</a>
      </ul>
      <ul>
        <li><a href="#scenario-set-6">Scenario Set 6: Negative scenario for calling PUT request</a>
      </ul>
      <ul>
        <li><a href="#scenario-set-7">Scenario Set 7: Negative scenario for calling DELETE request</a>
      </ul>
      <ul>
        <li><a href="#scenario-set-8">Scenario Set 8: Positive scenario for calling OPTIONS request</a>
      </ul>
      <ul>
        <li><a href="#scenario-set-9">Scenario Set 9: Fuzzy scenario performed with spike testing</a>
      </ul>      
    </li>
  </ol>
</details>


## Scope

* The objective is to create test templates for diferent request types by which new scenarios will be made.
* Scenarios will include positive and negative case.
* Will inlude at least one type of unit, performance and security tests.
* After each test the output should be stored to database.

## Test Scenarios

### Pre-requesities

* Database should be connected with Docker beforehand.
* Have initial test data in the DB. Example: expected status codes and responses.

### Scenario Set 1
#### Positive scenario for calling GET request

  <ol>
    <li>Step 1: Connect to database and API.</li>
    <li>Step 2: Compose valid GET request.</li>
    <li>Step 3: Send request.</li>
    <li>Step 4: Get response and check status code.</li>
      <ul>
        <li>If status code is OK, go to Step 5.</li>
      </ul>
      <ul>
        <li>If status code is not OK, send the response to DB for manual check and mark test as FAILed.</li>
      </ul>
    <li>Step 5: Assert response with the expected result.
      <ul>
        <li>If assertion is successful, mark test as PASSed.</li>
      </ul>
      <ul>
        <li>If assertion is successful, send the response to DB for manual check and mark test as FAILed.</li>
      </ul>
    </li>
  </ol>
  
### Scenario Set 2
#### Negative scenario for calling GET request  

  <ol>
    <li>Step 1: Connect to database and API.</li>
    <li>Step 2: Compose invalid GET request.</li>
    <li>Step 3: Send request.</li>
    <li>Step 4: Get response and check status code.</li>
      <ul>
        <li>If status code is the expected one, go to Step 5.</li>
      </ul>
      <ul>
        <li>If status code is not the expected one, send the response to DB for manual check and mark test as FAILed.</li>
      </ul>
    <li>Step 5: Assert response with the expected result.
      <ul>
        <li>If assertion is successful, mark test as PASSed.</li>
      </ul>
      <ul>
        <li>If assertion is successful, send the response to DB for manual check and mark test as FAILed.</li>
      </ul>
    </li>
  </ol>

### Scenario Set 3
#### Positive scenario for calling POST request

  <ol>
    <li>Step 1: Connect to database and API.</li>
    <li>Step 2: Compose valid POST request using valid authorization token.</li>
    <li>Step 3: Send request.</li>
    <li>Step 4: Get response and check status code.</li>
      <ul>
        <li>If status code is the expected one, go to Step 5.</li>
      </ul>
      <ul>
        <li>If status code is not the expected one, send the response to DB for manual check and mark test as FAILed.</li>
      </ul>
    <li>Step 5: Assert response with the expected result.
      <ul>
        <li>If assertion is successful, mark test as PASSed.</li>
      </ul>
      <ul>
        <li>If assertion is successful, send the response to DB for manual check and mark test as FAILed.</li>
      </ul>
    </li>
  </ol>

### Scenario Set 4
#### Negative scenario for calling POST request

  <ol>
    <li>Step 1: Connect to database and API.</li>
    <li>Step 2: Compose valid POST request using invalid authorization token.</li>
    <li>Step 3: Send request.</li>
    <li>Step 4: Get response and check status code.</li>
      <ul>
        <li>If status code is the expected one, go to Step 5.</li>
      </ul>
      <ul>
        <li>If status code is not the expected one, send the response to DB for manual check and mark test as FAILed.</li>
      </ul>
    <li>Step 5: Assert response with the expected result.
      <ul>
        <li>If assertion is successful, mark test as PASSed.</li>
      </ul>
      <ul>
        <li>If assertion is successful, send the response to DB for manual check and mark test as FAILed.</li>
      </ul>
    </li>
  </ol>

### Scenario Set 5
#### Negative scenario for calling PATCH request

   <ol>
    <li>Step 1: Connect to database and API.</li>
    <li>Step 2: Compose invalid PATCH request using valid authorization token.</li>
    <li>Step 3: Send request.</li>
    <li>Step 4: Get response and check status code.</li>
      <ul>
        <li>If status code is the expected one, go to Step 5.</li>
      </ul>
      <ul>
        <li>If status code is not the expected one, send the response to DB for manual check and mark test as FAILed.</li>
      </ul>
    <li>Step 5: Assert response with the expected result.
      <ul>
        <li>If assertion is successful mark test as PASSed.</li>
      </ul>
      <ul>
        <li>If assertion is successful send the response to DB for manual check and mark test as FAILed.</li>
      </ul>
    </li>
  </ol>

### Scenario Set 6
#### Negative scenario for calling PUT request

   <ol>
    <li>Step 1: Connect to database and API.</li>
    <li>Step 2: Compose invalid PUT request using invalid authorization token.</li>
    <li>Step 3: Send request.</li>
    <li>Step 4: Get response and check status code.</li>
      <ul>
        <li>If status code is the expected one, go to Step 5.</li>
      </ul>
      <ul>
        <li>If status code is not the expected one, send the response to DB for manual check and mark test as FAILed.</li>
      </ul>
    <li>Step 5: Assert response with the expected result.
      <ul>
        <li>If assertion is successful mark test as PASSed.</li>
      </ul>
      <ul>
        <li>If assertion is successful send the response to DB for manual check and mark test as FAILed.</li>
      </ul>
    </li>
  </ol>

### Scenario Set 7
#### Negative scenario for calling DELETE request

   <ol>
    <li>Step 1: Connect to database and API.</li>
    <li>Step 2: Compose valid DELETE request using valid authorization token, but use it on another user.</li>
    <li>Step 3: Send request.</li>
    <li>Step 4: Get response and check status code.</li>
      <ul>
        <li>If status code is the expected one, go to Step 5.</li>
      </ul>
      <ul>
        <li>If status code is not the expected one, send the response to DB for manual check and mark test as FAILed.</li>
      </ul>
    <li>Step 5: Assert response with the expected result.
      <ul>
        <li>If assertion is successful mark test as PASSed.</li>
      </ul>
      <ul>
        <li>If assertion is successful send the response to DB for manual check and mark test as FAILed.</li>
      </ul>
    </li>
  </ol>

### Scenario Set 8
#### Positive scenario for calling OPTIONS request

   <ol>
    <li>Step 1: Connect to database and API.</li>
    <li>Step 2: Compose valid OPTIONS request.</li>
    <li>Step 3: Send request.</li>
    <li>Step 4: Get response and check status code.</li>
      <ul>
        <li>If status code is the expected one, go to Step 5.</li>
      </ul>
      <ul>
        <li>If status code is not the expected one, send the response to DB for manual check and mark test as FAILed.</li>
      </ul>
    <li>Step 5: Assert response with the expected result.
      <ul>
        <li>If assertion is successful mark test as PASSed.</li>
      </ul>
      <ul>
        <li>If assertion is successful send the response to DB for manual check and mark test as FAILed.</li>
      </ul>
    </li>
  </ol>
  
### Scenario Set 9
#### Fuzzy scenario performed with spike testing

  <ol>
    <li>Step 1: Connect to database and API.</li>
    <li>Step 2: Compose POST request with wrong data and a GET requset.</li>
    <li>Step 3: Send POST request 100 times, afterwards send one GET request.</li>
    <li>Step 4: Recieve GET response.</li>
      <ul>
        <li>If status code is the expected one, go to Step 5.</li>
      </ul>
      <ul>
        <li>If status code is not the expected one, send the response to DB for manual check and mark test as FAILed.</li>
      </ul>
      <ul>
        <li>If response comes later than 1 second, send POST requests count to DB for manual check and mark test as FAILed.</li>
      </ul>
    <li>Step 5: Assert response with the expected result.
      <ul>
        <li>If assertion is successful, mark test as PASSed.</li>
      </ul>
      <ul>
        <li>If assertion is successful, send the response to DB for manual check and mark test as FAILed.</li>
      </ul>
    </li>
  </ol>

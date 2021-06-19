<!--
*** Thanks for checking out the Best-README-Template. If you have a suggestion
*** that would make this better, please fork the repo and create a pull request
*** or simply open an issue with the tag "enhancement".
*** Thanks again! Now go create something AMAZING! :D
-->



<!-- PROJECT SHIELDS -->
<!--
*** I'm using markdown "reference style" links for readability.
*** Reference links are enclosed in brackets [ ] instead of parentheses ( ).
*** See the bottom of this document for the declaration of the reference variables
*** for contributors-url, forks-url, etc. This is an optional, concise syntax you may use.
*** https://www.markdownguide.org/basic-syntax/#reference-style-links
-->
[![MIT License][license-shield]][license-url]
[![LinkedIn][linkedin-shield]][linkedin-url]



<!-- TABLE OF CONTENTS -->
<details open="open">
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">About The Project</a>
      <ul>
        <li><a href="#built-using">Built Using</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Getting Started</a>
      <ul>
        <li><a href="#prerequisites">Prerequisites</a></li>
        <li><a href="#installation">Installation</a></li>
      </ul>
    </li>
    <li><a href="#usage">Usage</a></li>
    <li><a href="#roadmap">Roadmap</a></li>
    <!--<li><a href="#contributing">Contributing</a></li>-->
    <li><a href="#license">License</a></li>
    <!--<li><a href="#contact">Contact</a></li>
    <li><a href="#acknowledgements">Acknowledgements</a></li>-->
  </ol>
</details>



<!-- ABOUT THE PROJECT -->
## About The Project

This is a DEMO project for API testing using Java Selenium.

Documentations:
* [Test Plan](Documentation/Test%20Plan.md)
* [Test Strategy](Documentation/Test%20Strategy.md)
* [Test Scenarios](Documentation/Test%20Scenarios.md)


### Built Using

This section will list any major frameworks that are used to built the project.
* [Java](https://java.com)
* [Maven](https://maven.apache.org)
* [Docker](https://www.docker.com)
* [MongoDB](https://www.mongodb.com)

<!-- GETTING STARTED -->
## Getting Started

This project is an automation framework that will need several steps for it's installation.
After the test a report will be created in [localhost](127.0.0.1:899)

### Prerequisites

To run the framework you would need to set up the environment first (installing Java, Maven and Docker is needed).

* [Java JDK](https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html) 
* [Maven](https://maven.apache.org/download.cgi)
* [Docker](https://www.docker.com/products/docker-desktop)

### Installation

1. Clone the repo
   ```
   git clone https://github.com/MTigran/api-test.git
   ```  
2. Get MnogoDB package
   ```
   docker pull ghcr.io/mtigran/api-test/mongo:1.0
   ```
3. Install Maven dependencies
   ```
   mvn install
   ```
P.S. Should be done in same dir.

<!-- USAGE EXAMPLES -->
## Usage

To run the automation the command line will be used.

General examples include:
* ```mvn -Dtest'**.INDIVIDUAL_TEST_NAME' test -Dsuite=TEST_SUITE.xml``` for running individual tests.                                                                     
\- **.INDIVIDUAL_TEST_NAME can be in following format ```tests.API.GET.userinfo``` where userinfo.java is the test case  
\- TEST_SUIT.xml should be the one that includes the INDIVIDUAL_TEST_NAME
* ```mvn test -Dsuite=TEST_SUITE.xml``` for running test suites.                                                                            
\- It could be also refered to the TestNG.xml that includes all other test suites. 


<!-- ROADMAP -->
## Roadmap

See the [Test Plan](Documentation/Test%20Plan.md).


<!-- CONTRIBUTING 
## Contributing

Contributions are what make the open source community such an amazing place to be learn, inspire, and create. Any contributions you make are **greatly appreciated**.

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feature/AmazingFeature`)
3. Commit your Changes (`git commit -m 'Add some AmazingFeature'`)
4. Push to the Branch (`git push origin feature/AmazingFeature`)
5. Open a Pull Request
-->

<!-- LICENSE -->
## License

Distributed under the MIT License. See `LICENSE` for more information.


<!-- CONTACT 
## Contact

Your Name - [@your_twitter](https://twitter.com/your_username) - email@example.com

Project Link: [https://github.com/your_username/repo_name](https://github.com/your_username/repo_name)
-->


<!-- ACKNOWLEDGEMENTS 
## Acknowledgements
* [GitHub Emoji Cheat Sheet](https://www.webpagefx.com/tools/emoji-cheat-sheet)
* [Img Shields](https://shields.io)
* [Choose an Open Source License](https://choosealicense.com)
* [GitHub Pages](https://pages.github.com)
* [Animate.css](https://daneden.github.io/animate.css)
* [Loaders.css](https://connoratherton.com/loaders)
* [Slick Carousel](https://kenwheeler.github.io/slick)
* [Smooth Scroll](https://github.com/cferdinandi/smooth-scroll)
* [Sticky Kit](http://leafo.net/sticky-kit)
* [JVectorMap](http://jvectormap.com)
* [Font Awesome](https://fontawesome.com)
-->




<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[contributors-shield]: https://img.shields.io/github/contributors/othneildrew/Best-README-Template.svg?style=for-the-badge
[contributors-url]: https://github.com/othneildrew/Best-README-Template/graphs/contributors
[forks-shield]: https://img.shields.io/github/forks/othneildrew/Best-README-Template.svg?style=for-the-badge
[forks-url]: https://github.com/othneildrew/Best-README-Template/network/members
[stars-shield]: https://img.shields.io/github/stars/othneildrew/Best-README-Template.svg?style=for-the-badge
[stars-url]: https://github.com/othneildrew/Best-README-Template/stargazers
[issues-shield]: https://img.shields.io/github/issues/othneildrew/Best-README-Template.svg?style=for-the-badge
[issues-url]: https://github.com/othneildrew/Best-README-Template/issues
[license-shield]: https://img.shields.io/github/license/othneildrew/Best-README-Template.svg?style=for-the-badge
[license-url]: https://github.com/othneildrew/Best-README-Template/blob/master/LICENSE.txt
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url]: https://www.linkedin.com/in/tigran-mutafyan-9647b512a/
[product-screenshot]: images/screenshot.png

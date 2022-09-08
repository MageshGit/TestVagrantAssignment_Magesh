# TestVagrantAssignment_Magesh
this repository contains the implementation of an assignment by TestVagrant

## Techstack
Programming language: Java v1.8 -  https://www.oracle.com/java/technologies/downloads/   <br />
Test runner/Assertion: TestNG v7.6.1 -  https://testng.org/doc/index.html   <br />
JSON marshal library: Apache Juneau v8.2.0 -  https://juneau.apache.org/#about.html   <br />
Project type: Maven project - https://maven.apache.org/   <br />

## Setting up project in local
1. Clone the repository into your local machine
2. Import as existing maven project in your preferred IDE <br />
Good to check maven dependencies are downloaded and referred in the project. <br />

## Script details
**Testscript class name**: TeamPlayersTest <br />
**Testscript methods**:   <br />
1. verifyTeamHasOnlyFourForeignPlayers      <br />
2.  verifyTeamHasAtleastOneWicketKeeper      <br />
**TestNG XML file**: teamPlayersTest.xml

## Running test scripts
### Run scripts at class level
> Right click on class-level (or) class name, choose Run As-> TestNG test

### Run individual script
> Right click on testng test method, choose Run As-> TestNG test      <br />

### Run with testng XML
> Right click on the testng xml file and choose Run As->TestNG Suite
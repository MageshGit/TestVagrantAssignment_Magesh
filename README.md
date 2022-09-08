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
**TestNG XML file**: teamPlayersTest.xml   <br />
**Testscript class name**: TeamPlayersTest <br />
**Testscript methods**:   
1. verifyTeamHasOnlyFourForeignPlayers      <br />
2.  verifyTeamHasAtleastOneWicketKeeper      

## Running test scripts
### Run scripts at class level
> Right click on class-level (or) class name, choose Run As-> TestNG test

### Run individual script
> Right click on testng test method, choose Run As-> TestNG test   

### Run with testng XML
> Right click on the testng xml file and choose Run As->TestNG Suite

### Json file
> To test the script stability, added a few Json which has different combination of players and roles

### Properties file
> Mention the Json file to be referred by scripts in this config.properties file   <br />
> example   <br />
>    rcbPlayersJsonFile:playersListRCB.json

### Test reports
> Execute scripts and the default testng reports will be published in the test-output folder

### Note
Use Java 8 or higher as some of the java 8 features are implemented in test script

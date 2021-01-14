# TFT
## Instructions to run the project in local system

## OS -> Windows 10 (Preferred)

### SOFTWARES REQUIRED

  1. **JAVA SE 8 (jdk 8)**   <br/>
      Download link -> https://www.oracle.com/in/java/technologies/javase/javase-jdk8-downloads.html

  2. **NETBEANS IDE**   <br/>
      version 8.0 (Stable version) ( versions above 8.0 may have some bugs )  <br/>
      Download link -> https://netbeans.org/downloads/old/8.0/  <br/>  (download under All Free 210MB) <br/><br/>
      <img src="/README Images/s1.jpg"/>

  3. **WAMP SERVER**    <br/>
      version -> 2.0i    <br/>
      Download link -> https://wampserver.soft112.com/
      
### INSTALLATION INSTRUCTIONS

  1. **JAVA SE 8 (jdk 8)**   <br/>
      Install JDK and set the path for it wrt your windows  <br/>
      Search this in youtube for help -> <q>How to set path of java in windows 10</q>  <br/>
      NOTE : Without setting path NETBEANS IDE won't work properly or ask for JDK while installing IDE.
  
  2. **NETBEANS IDE**   <br/>
      Step 1: Run the .exe file that you downloaded and click on Customize button on this window <br/><br/>
      <img src="/README Images/s2.png"/>
      
      Step 2: Under Runtimes: check Apache Tomcat  <br/><br/>
      <img src="/README Images/s3.png"/>
      
      Step 3: Uncheck Glassfish ( Apache Tomcat is already installed in mine that's why it is showing error )  <br/><br/>
      <img src="/README Images/s4.png"/>
      
      Step 4: Click ok and Next then no further customization required except Step 5.
      
      Step 5: UNCHECK <q>check for updates</q> before clicking FINISH button.
      
  3. **WAMP SERVER**
      Simply run the .exe file and Install it with default settings (No Customization needed)
      
### RUN the Project

  1. Unzip the project and paste it in here: This PC > Documents > NetBeansProjects
  
  2. Open netbeans software and open the project: Click File > Open Project > Select TFT > click Open Project button.
  
  3. **Driver Setup** <br/>
      1. Expand the TFT Folder and right click on Libraries  <br/><br/>
          <img src="/README Images/d1.png"/>
      
      2. Click Add JAR/Folder  <br/><br/>
          <img src="/README Images/d2.png"/>
      
      3. Go To this path in Add JAR/Folder window: This PC > Documents > NetBeansProjects > TFT > JDBC Driver  <br/>
          NOTE: Ignore the path in the screenshot, it is different because I didn't kept the driver inside project directory before.  <br/><br/>
          <img src="/README Images/d3.png"/>
      
      4. Select com.mysql.jdbc_5.1.5.jar file and click Open button.
      
  4. Now just start the WAMP SERVER<br/> then click on TFT folder in NETBEANS IDE<br/> then click the green arrow symbol in the toolbar to run project.

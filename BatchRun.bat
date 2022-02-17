set projectLocation=C:\AlasTest
 
cd %projectLocation%
 
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
 
java org.testng.TestNG %projectLocation%\crossbrowser.xml
 
pause

set projectLocation=C:\Users\Rajan\eclipse-workspace\TestNgDemo2
cd %projectLocation%
set classpath=%projectLocation%\lib\*;
java org.testng.TestNG %projectLocation%\testng.xml
pause

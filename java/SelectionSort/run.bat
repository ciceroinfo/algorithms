@echo off
cls
if not exist classes mkdir classes
if exist app.jar del app.jar

for %%a in (.) do set currentfolder=%%~na
echo Project %currentfolder%
echo.
type README.txt
echo.
echo.

echo ## Compiling JAVA files ##
javac -sourcepath src src/*.java -d classes
echo.

REM echo ## Running CLASS files ##
REM java -cp classes %currentfolder% 6 5 3 1 8 7 2 4
REM echo.

echo ## Creating JAR file ##
jar cfve app.jar %currentfolder% -C classes .
echo.

echo ## Running jar file ##
java -cp classes -jar app.jar 6 5 3 1 8 7 2 4 13
echo.

del app.jar
rmdir /S /Q classes

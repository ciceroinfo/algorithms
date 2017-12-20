@echo off
cls

for %%a in (.) do set currentfolder=%%~na
echo Project %currentfolder%
echo.
type README.txt
echo.
echo.

echo ## Running ##
python src/%currentfolder%.py 6 5 3 1 8 7 2 4
echo.

@echo off
setlocal

set "JMETER_HOME=%~dp0.tools\apache-jmeter-5.6.3"
set "PATH=%JMETER_HOME%\bin;%PATH%"

call "%JMETER_HOME%\bin\jmeter.bat" %*

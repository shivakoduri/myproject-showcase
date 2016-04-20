@ECHO OFF

Set dir=D:\Stuff\Softwares\apache-tomcat-7.0.57\webapps\myproject-web

Echo Deleting all files from %dir%
del %dir%\* /F /Q

Echo Deleting all folders from %dir%
for /d %%p in (%dir%\*) Do rd /Q /S "%%p"
@echo Folder deleted.

cd D:\Stuff\Softwares\apache-tomcat-7.0.57\webapps\
rmdir %dir%

del D:\Stuff\Softwares\apache-tomcat-7.0.57\webapps\myproject-web.war

cd D:\Stuff\Softwares\apache-tomcat-7.0.57\bin
shutdown.bat

exit
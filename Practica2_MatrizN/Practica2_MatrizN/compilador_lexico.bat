SET JAVA_HOME="C:\Program Files\Java\jdk1.6.0_15\bin"
SET PATH=%JAVA_HOME%;%PATH%
SET CLASSPATH=%JAVA_HOME%;
SET JFLEX_HOME= C:\Fuentes\jflex-1.4.3

cd C:\Users\Mxabi\Documents\NetBeansProjects\Practica2_MatrizN\src\Analizadores
java -jar %JFLEX_HOME%\lib\JFlex.jar lexico.jflex
pause
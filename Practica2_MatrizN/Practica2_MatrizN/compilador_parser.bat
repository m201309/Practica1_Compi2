SET JAVA_HOME="C:\Program Files\Java\jdk1.6.0_15\bin"
SET PATH=%JAVA_HOME%;%PATH%
SET CLASSPATH=%JAVA_HOME%;
cd C:\Users\Mxabi\Documents\NetBeansProjects\Practica2_MatrizN\src\Analizadores
java -classpath C:\Fuentes\ java_cup.Main -parser parser -symbols simbolo parser.cup
pause
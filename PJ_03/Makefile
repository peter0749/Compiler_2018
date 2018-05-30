all:
	java -cp antlr-3.5.2-complete.jar org.antlr.Tool myChecker.g
	javac -cp antlr-3.5.2-complete.jar:. myChecker_test.java
	java -cp antlr-3.5.2-complete.jar:. myChecker_test test.c
clean:
	rm -f *.class *.tokens 


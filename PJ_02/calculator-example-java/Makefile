all:
	java -cp antlr-3.5.2-complete.jar org.antlr.Tool myC.g
	javac -cp antlr-3.5.2-complete.jar:. myC_test.java
	java -cp antlr-3.5.2-complete.jar:. myC_test test1.c
	java -cp antlr-3.5.2-complete.jar:. myC_test test2.c
	java -cp antlr-3.5.2-complete.jar:. myC_test test3.c
clean:
	rm -f *.class *.tokens myCLexer.java myCParser.java


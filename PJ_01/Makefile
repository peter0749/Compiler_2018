all:
	java -cp antlr-3.5.2-complete.jar org.antlr.Tool mylexer.g
	javac -cp ./antlr-3.5.2-complete.jar testLexer.java mylexer.java 
	java -cp ./antlr-3.5.2-complete.jar:. testLexer hello.c
	java -cp ./antlr-3.5.2-complete.jar:. testLexer for.c
	java -cp ./antlr-3.5.2-complete.jar:. testLexer struct.c
run:
	java -cp ./antlr-3.5.2-complete.jar:. testLexer ${SRC}
clean:
	rm -f *.tokens *.class *.out mylexer.java


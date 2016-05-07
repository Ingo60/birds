#
#	Make Birds
#

FREGEC=fregec.jar
JAVA=java
JAVAC=javac
JLINE=jline-1.0.jar

clean:
	rm -rf bin
	mkdir bin

all:
	$(JAVAC) -d bin -cp $(JLINE) src/birds/ParensCompletor.java
	$(JAVA)  -cp $(FREGEC):$(JLINE) frege.compiler.Main -d bin -O -sp src -make birds.Main
	cp src/birds/standard.ski bin/birds/

pure:
	$(JAVA) -Xss8m -cp bin:$(FREGEC):$(JLINE) -Dski.pure birds.Main

run:
	$(JAVA) -Xss8m -cp bin:$(FREGEC):$(JLINE) birds.Main

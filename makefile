main: main.java
	javac ./main.java

run: main.class
	java main

clean:
	rm -r *.class
	rm -r ./meatpackage/*.class

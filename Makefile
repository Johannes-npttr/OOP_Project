all: compiletest runtest cleantest compile run clean

compiletest:
	javac code/*.java

runtest:
	java code.Main

cleantest:
	del code\*.class


compile: 
	javac app/*.java

run: 
	java app.Main

clean:
	del app\*.class


# unter windows (mingw32.make = make) ==> "mingw32-make run" statt "make run"
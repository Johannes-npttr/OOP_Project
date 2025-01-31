all: compiletest runtest cleantest compile run clean

# JOHANNES WENN DIE MAKEFILE BEI DIR NICHT FUNKTIONIERT WEGEN MAC MACH NICHT DIREKT ALLES KAPUTT UND SPRICH MIT UNS!!!!
# BEI MIR FUNKTIONIERT SIE WUNDERBAR!!!!!



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

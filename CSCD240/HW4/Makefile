output: main.o LinkedListString.o
	gcc main.o LinkedListString.o -o output
main.o: main.c LinkedListString.h
	gcc -c main.c
message.o: LinkedListString.c LinkedListString.h
	gcc -c LinkedListString.c
clean:
	rm -f main.o LinkedListString.o

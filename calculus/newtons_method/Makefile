CC=gcc
CFLAGS=-g -Wall

all: newtonsMethod clean

.SUFFIXES: .c .o
.c .o:
	$(CC) $(CFLAGS) -c $*.c
	
newtonsMethod: main.o
	$(CC) -g -o newtonsMethod main.o -lm
	
clean: 
	rm -f *.o
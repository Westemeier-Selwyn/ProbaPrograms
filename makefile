UNAME_S := $(shell uname -s)
	
ifeq ($(UNAME_S),Linux)
	CC=gcc
endif
ifeq ($(UNAME_S),Darwin)
	CC=clang
endif

CFLAGS=-I. -g
SRC = $(wildcard *.c)
OBJ = $(src:.c=.o)

$(target): $(SRC)
	@mkdir -p .build >/dev/null
	$(CC) -o .build/$@ $(CFLAGS) $^

clean:
	rm -rf .build $(OBJ)
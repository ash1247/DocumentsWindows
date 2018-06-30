sandbox: sandbox.o
	ld -o sandbox sandbox.o
sandbox: sandbox.asm
	nasm -f elf64 -g -F dwarf sandbox.asm -l sandbox.lst

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;
;;
;   Run: nasm -f elf64 -g -F dwarf 1.asm -l 1.lst
;        ld -o 1 1.o
;
;       A program to display a message
;
;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
section .bss
        

section .data                      ;Section containing data

        msg: db "Hello World!!", 10     ; Given message
        msgLen equ $-msg           ; Count Length of msg
        
        
section .text                      ; section containing code

global _start                      ;linker initialized

_start:                            ;entry point for linker
        nop                        ; For debugger
        
        mov eax, 4                 ; initialize sys_call
        mov ebx, 1                 
        mov ecx, msg               ; Pass offset of the msg
        mov edx, msgLen            ; Pass the length of msg 
        int 80h                    ; Make kernel call,
                                   ; 21h for windows, 80h for 
                                   ; linux
        
        mov eax, 1                 ; Exit sys_call
        mov ebx, 0                 ; Return a code for zero
        int 80h                    ; Make kernel call

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;;
;;
;   Run: nasm -f elf64 -g -F dwarf 1.asm -l 1.lst
;        ld -o 1 1.o
;
;       A program to read a char from keyboard and display it
;
;
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
section .bss                       ; uninitialized data

section .data                      ;Section containing data

        star: db "*"  
        starL equ $-star           ; Count Length of msg1
        
        newLine: db "",10              ; newLine 
        newLL equ $-newLine        ; newLine length
        
section .text                      ; section containing code

global _start                      ;linker initialized

_start:                            ;entry point for linker
        nop                        ; For debugger
        
        mov ebp, 20
        ; Output
Loop:   mov eax, 4                 ; initialize wr sys_call 
        mov ebx, 1                 
        mov ecx, star              ; Pass offset of the msg
        mov edx, starL           ; Pass the length of msg 
        int 80h                    ; Make kernel call,
        dec ebp                     ; 21h for windows, 80h                  
        jnz Loop                            ;for linux        
       
       ; add new line
        mov eax, 4                 ; initialize wr sys_call
        mov ebx, 1                 ;
        mov ecx, newLine           ; add newLine
        mov edx, newLL             ; length of newLine
        int 80h

        ; Exit
        mov eax, 1                 ; Exit sys_call
        mov ebx, 0                 ; Return a code for zero
        int 80h                    ; Make kernel call 

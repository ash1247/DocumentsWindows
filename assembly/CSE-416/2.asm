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
        char resb 1

section .data                      ;Section containing data

        msg1: db "Enter a character: ", 10  ; Prompt message
        msg1Len equ $-msg1           ; Count Length of msg1
        
        msg2: db "You entered "     ; Output msg
        msg2Len equ $-msg2          ; Count length of msg2

        newLine: db " ",10              ; newLine 
        newLL equ $-newLine        ; newLine length
        
section .text                      ; section containing code

global _start                      ;linker initialized

_start:                            ;entry point for linker
        nop                        ; For debugger
        
        ; user prompt
        mov eax, 4                 ; initialize wr sys_call 
        mov ebx, 1                 
        mov ecx, msg1              ; Pass offset of the msg
        mov edx, msg1Len           ; Pass the length of msg 
        int 80h                    ; Make kernel call,
                                   ; 21h for windows, 80h for 
                                   ; linux
        
        ; read and store the user input
        mov eax, 3                 ; initialize rd sys_call                 
        mov ebx, 2
        mov ecx, char
        mov edx, 1                 ; 1 bytes of that info
        int 80h
        
        ; Output msg 
        mov eax, 4                 ; initialize wr sys_call
        mov ebx, 1                 ;
        mov ecx, msg2              ; Pass offset of the msg
        mov edx, msg2Len           ; Pass the length of msg 
        int 80h                    ; Make kernel call
        
        ; Output char 
        mov eax, 4                 ; initialize wr sys_call
        mov ebx, 1                 ;
        mov ecx, char             ; Pass offset of the char
        mov edx, 1                 ; Pass the length of char 
        int 80h                    ; Make kernel call
        
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

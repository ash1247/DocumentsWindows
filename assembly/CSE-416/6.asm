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

        res resb 1
section .data                      ;Section containing data
        newLine: db "",10              ; newLine 
        newLL equ $-newLine        ; newLine length
        
section .text                      ; section containing code

global _start                      ;linker initialized

_start:                            ;entry point for linker
        nop                        ; For debugger
        
        mov eax, '1'
        sub eax, '0'
        mov ebx, '3'
        sub eax, '0'
        mov ecx, '49'
        sub ecx, '0'
        
        
Loop:   add eax, ebx
        cmp eax, ecx
        jng Loop  
        
        add eax, '0'
        mov [res], eax
        
        mov eax, 4                 ; initialize wr sys_call 
        mov ebx, 1                 
        mov ecx, res              ; Pass offset of the msg
        mov edx, 3          
        int 80h                    ; Make kernel call,
        
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

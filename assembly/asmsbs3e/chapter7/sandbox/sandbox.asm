;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
; Executable name : sandbox
; Version: 1.0
; Created date: 21.01.2018
; Last update: 21.01.2018
; Author     : @$#1247
; Description: A simple program for change lowercase into uppercase in assembly for Linux, using NASM
;              2.13.01, demonstrating the conversion of binary values 
;              to hexadecimal strings. It acts as a very simple hex 
;              dump utility for file, though without the ASCII 
;              equivalent column 
; Use: ./sandbox < input_file
;
; Build: nasm -f elf -g -F stabs sandbox.asm
;        ld -o filename sandbox.o -melf_i386
;                          
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

section .data               ; Section for initialised data
        EOL equ 10          ; Linux EOL character
        FILLCHR equ 32      ; ASCII space character
        HBARCHR equ 196     ; Use dash char if won't display
        STRTROW equ 2       ; Row where the graph begins
        
; The dataset is just a table of byte-length numbers:
        Dataset db 9,71,17,52,55,18,29,36,18,68,77,63,58,33,0
        
        Message db "Data current as of 01.02.18"
        MSGLEN equ $-Message
        ;Clear the terminal and reset the cursor
        ClrHome db 27, "[2J", 27, "[01;01H"
        CLRLEN  equ $-ClrHome
        
section .bss
        COLS equ 81               ; Line length + 1 char for EOL
        ROWS equ 25               ; Number of lines in display
        VidBuff resb COLS*ROWS    ; Buffer size adapts to R & C
        
section .text
        
global _start
    
%macro ClearTerminal 0
        pushad
        mov eax, 4
        mov ebx, 1
        mov ecx, ClrHome
        mov edx CLRLEN
        int 80h
        popad
%endmacro

Show:   pushad
        mov eax, 4
        mov ebx, 1
        mov ecx, VidBuff
        mov edx, COLS*ROWS
        int 80h
        popad 
        ret
        
ClrVid:  push eax
         push ecx
         push edi
         cld
         mov al, FILLCHR
         mov edi, VidBuff
         mov ecx, COLS*ROWS
         rep stosb
         
         mov edi, VidBuff   
         dec edi
         mov ecx, ROWS
         
ptEOL:  add edi, COLS
        mov byte[edi], EOL
        loop ptEOL
        pop edi
        pop ecx
        pop eax
        ret
        
WrtLn:  push eax
        push ebx
        push ecx
        push edi
        cld
        mov edi, VidBuff
        dec eax
        dec ebx
        mov ah, COLS
        mul ah
        add edi, eax
        add edi, ebx
        rep movsb
        pop edi
        pop ecx
        pop ebx
        pop eax
        ret

WrtHB:  push eax
        push ebx
        push ecx
        push edi
        cld
        mov edi, VidBuff
        dec eax
        dec ebx
        mov ah, COLS
        mul ah
        add edi, eax
        add edi, ebx
        mov al, HBARCHR
        rep stosb
        pop edi
        pop ecx
        pop ebx
        pop eax
        ret
        
Ruler:  push eax
        push ebx
        push ecx
        push edi
        mov edi, VidBuff
        dec eax
        dec ebx
        mov ah, COLS
        mul ah
        add edi, eax
        add edi, ebx
        
        mov al, '1'

DoChar: stosb
        add al, '1'
        aaa
        add al, '0'
        loop DoChar
        pop edi
        pop ecx
        pop ebx
        pop eax
        ret 

_start
        nop
         
        ClearTerminal
        call ClrVid
        mov eax, 1
        mov ebx, 1
        mov ecx, COLS-1
        call Ruler 
        
        mov esi, Dataset
        mov ebx, 1
        mov ebp, 0

.blast: mov eax, ebp
        add eax, STRTROW
        mov cl, byte[esi+ebp]
        cmp ecx, 0
        je .rule2
        call WrtHB
        inc ebp
        jmp .blast

.rule2: mov eax, ebp
        add eax, STRTROW
        mov ebx, 1
        mov ecx, COLS-1
        call Ruler
        
        mov esi, Message
        mov ecx, MSGLEN
        mov ebx, COLS
        sub ebx, ecx
        shr ebx, 1
        mov eax, 24
        call WrtLn
        
        call Show
        
Exit:   mov eax, 1
        mov ebx, 0
        int 80h
        

.ORIG X3000

;;; Simulator used: http://lc3tutor.org/


; Below sets up the integers placed at addresses x3120 and x3121
ADD R0, R0, #3  ; Add an integer to R0
STI R0, X       ; Store the value at R0 to address X
AND R0, R0, x0  ; Reset R0
ADD R0, R0, #3  ; Add an integer to R0
STI R0, Y       ; Store the value at R0 to address Y


; Compute the difference X −Y and place it at location x3122
LDI R1, X       ; Load value at address X to R1
LDI R2, Y       ; Load value at address Y to R2
NOT R1, R1      ; Invert integer at R1 to R1
ADD R1, R1, #1  ; Complete the inversion by adding 1 to R1
ADD R3, R1, R2  ; Perform subtraction between R1 and R2
STI R3, A       ; Store value at R3 to address A


; Place the absolute values |X| and |Y| at locations x3123 and x3124, respectively
ADD R4, R1, #0  ; Add value at R1 to R4
BRzp ZP         ; If added value is negative or positive skip to ZP
NOT R4, R4      ; Invert integer at R4 to R4
ADD R4, R4, #1  ; Complete the inversion by adding 1 to R4
ZP STI R4, B    ; Store value at R4 to address B

ADD R5, R2, #0  ; Add value at R2 to R5
BRzp ZP2        ; If added value is negative or positive skip to ZP2
NOT R5, R5      ; Invert integer at R5 to R5
ADD R5, R5, #1  ; Complete the inversion by adding 1 to R5
ZP2 STI R5, C   ; Store value at R5 to address C


; Determine which of |X| and |Y| is larger. Place 1 at location x3125 if |X| is, a 2 if
; |Y| is, or a 0 if they are equal.
AND R5, R5, x0  ; Reset R5
ADD R5, R1, R2  ; Perform subtraction between R1 and R2
BRn NN          ; If subtracted value is negative skip to NN
AND R5, R5, x0  ; Reset R5
ADD R5, R1, R2  ; Perform subtraction between R1 and R2
BRp PP          ; If subtracted value is negative skip to PP
AND R5, R5, x0  ; Reset R5
ADD R5, R1, R2  ; Perform subtraction between R1 and R2
BRz ZZ          ; If subtracted value is negative skip to ZZ

NN ADD R7, R7, #2  ; Set the value of R7 to 2
BRnzp LAST         ; Skip to LAST
PP ADD R7, R7, #1  ; Set the value of R7 to 1
BRnzp LAST         ; Skip to LAST
ZZ ADD R7, R7, #0  ; Set the value of R7 to 0
BRnzp LAST         ; Skip to LAST

LAST STI R7, Z  ; Store the value at R7 to address Z


HALT


X .FILL x3120
Y .FILL X3121
A .FILL x3122
B .FILL x3123
C .FILL X3124
Z .FILL x3125

.END

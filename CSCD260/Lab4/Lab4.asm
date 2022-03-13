.ORIG x3000

;;; Simulator used: http://lc3tutor.org/

;;; Setting up...
        LD R0, START       ; Set R0 to the value of START
        LD R7, N           ; Set R7 to the value of N
        ADD R1, R1, #1     ; Set R1 equal to 1
        STR R1, R0, #0     ; Store value at R1 to address in R0
        ADD R0, R0, #1     ; Increase address in R0 by 1
        ADD R7, R7, #-1    ; Decrease value in R7
        ADD R2, R2, #1     ; Set R2 equal to 1
        STR R2, R0, #0     ; Store value at R2 to address in R0
        ADD R0, R0, #1     ; Increase address in R0 by 1
        ADD R7, R7, #-1    ; Decrease value in R7 by 1

;;; For everything beyond the first two numbers of the Fibonacci Sequence
LOOP    ADD R3, R2, #0     ; Store current value in R2 in R3
        ADD R4, R1, R2     ; Add R1 and R2 into R4
        ADD R1, R3, #0     ; Set R1 with the saved R2 value, placed in R3
        ADD R2, R4, #0     ; Set R2 with the sum of R1 and R2, placed in R4
        STR R2, R0, #0     ; Store value at R2 to address in R0
        ADD R0, R0, #1     ; Increase address in R0 by 1
        ADD R7, R7, #-1    ; Decrease value in R7 by 1
        BRp LOOP           ; Repeat LOOP if R7 is still positive
        
        HALT

START   .FILL x3100
N       .FILL #15

.END




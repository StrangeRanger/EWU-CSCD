.ORIG x3100

;;; Simulator used: http://lc3tutor.org/

;;; Output text to the screen.
        LEA R0, ASK  ; Loads the address of the string into R0
        PUTS

;;; Reading the input value.
        GETC              ; Place ASCII value of input character into R0
        ADD R3, R0, #0    ; Copy R0 into R3
        ADD R3, R3, #-16  ; Subtract 48, the ASCII value of 0
        ADD R3, R3, #-16
        ADD R3, R3, #-16  ; R3 now contains the actual value

;;; R3 already contains the numerical code of the i
        LEA R0, DAYS      ; Address of "Sunday" in R0
        ADD R3, R3, #0    ; To be able to use condition codes

;;; The loop (4 instructions) implements R0 <== R0 + 10 * i
LOOP    BRz DISPLAY
        ADD R0, R0, #10   ; Go to next day
        ADD R3, R3, #-1   ; Decrement loop variable
        BR LOOP

DISPLAY PUTS

        HALT

ASK     .STRINGZ "Please enter a number: "
DAYS    .STRINGZ "Sunday   "
        .STRINGZ "Monday   "
        .STRINGZ "Tuesday  "
        .STRINGZ "Wednesday"
        .STRINGZ "Thursday "
        .STRINGZ "Friday   "
        .STRINGZ "Saturday "

.END


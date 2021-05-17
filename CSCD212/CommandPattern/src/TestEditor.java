// *************************************************************************************
//
// Name:        Hunter T.
// Class:       CSCD 212
// Description: Program demonstrating the command pattern at work...
//
// *************************************************************************************

public class TestEditor {
    public static void main(String[] args) {
        DocumentInvoker myDocument = new DocumentInvoker("message_to_Nancy Ripplinger");

        myDocument.Write("Stop your messin' around");
        myDocument.Write("Better think of your future");
        myDocument.Write("Time you straightened right out");
        System.out.println(myDocument.Read());
        myDocument.Undo(0);
        System.out.println(myDocument.Read());
        myDocument.Redo(0);
        System.out.println(myDocument.Read());
        myDocument.Undo(2);
        System.out.println(myDocument.Read());
    }
}

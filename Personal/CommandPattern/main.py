#!/usr/bin/env python3

####[ Imports ]#########################################################################


from pkg.document_invoker import DocumentInvoker


####[ Functions ]#######################################################################


def main():
    """Main method."""
    my_document = DocumentInvoker("message_to_Nancy Ripplinger")

    my_document.write("Stop your messin' around")
    my_document.write("Better think of your future")
    my_document.write("Time you straightened right out")
    print(my_document.read())
    my_document.undo(0)
    print(my_document.read())
    my_document.redo(0)
    print(my_document.read())
    my_document.undo(2)
    print(my_document.read())
    print(my_document.print_command_buffer())


####[ Main ]############################################################################


if __name__ == "__main__":
    main()

from pkg.document import Document
from pkg.document_write_command import DocumentWriteCommand
from pkg.document_erase_command import DocumentEraseCommand


class DocumentInvoker:
    """Document invoker class..."""

    def __init__(self, name):
        """Constructor.

        Parameters
        ----------
        name : str
        """
        self._commands = []
        self._current_doc = Document(name)

    def write(self, text):
        """Instantiate 'DocumentWriteCommand' and store the write command in '_commands'.

        Parameters
        ----------
        text : str
            Text to be added to the the document.
        """
        cmd = DocumentWriteCommand(self._current_doc, text)
        self._commands.append(cmd)

    def erase(self, text):
        """Instantiate 'DocumentEraseCommand' and store the erase command in '_commands'.

        Parameters
        ----------
        text : str
            Text to be added to the the document.
        """
        cmd = DocumentEraseCommand(self._current_doc, text)
        self._commands.append(cmd)

    def read(self):
        """Call the read() method inside of the 'Document' class and return the provided
        text.

        Returns
        -------
        str
            Combined text from '_text_array' inside of the 'Document' class.
        """
        return self._current_doc.read()

    def undo(self, index):
        """Undo the actions of a command index 'index'.

        Parameters
        ----------
        index : int
            The index of a command inside of '_commands'.
        """
        tmp = self._commands[index]
        print("\n---- Undo level {}".format(index))
        tmp.undo()

    def redo(self, index):
        """Undo the actions of the 'undo' method.

        Parameters
        ----------
        index : int
            The index of a command inside of '_commands'.
        """
        tmp = self._commands[index]
        print("\n---- Redo level {}".format(index))
        tmp.redo()

    def print_command_buffer(self):
        """Return the content of '_commands'.

        Returns
        -------
        txt : str
            A string comprised of all the text in '_commands'.
        """
        txt = "\n------Commands issued------"

        for line in self._commands:
            txt += "\n" + str(line)

        return txt

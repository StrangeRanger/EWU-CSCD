from pkg.command import Command


class DocumentWriteCommand(Command):
    """Write 'text' to the document."""

    def __init__(self, document, text):
        """Constructor.

        Parameters
        ----------
        document : document.Document
            Document object/instance.
        text : str
            Text to be added to the document.
        """
        self._document = document
        self._text = text
        self._document.write(text)

    def undo(self):
        """Erase 'text' from the document."""
        self._document.erase(self._text)

    def redo(self):
        """Re-add 'text' to the document."""
        self._document.write(self._text)
